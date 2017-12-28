package com.liferay.damascus.antlr.generator

import spock.lang.Specification
import spock.lang.Unroll

import java.nio.charset.Charset

import org.apache.commons.io.FileUtils

class TemplateGeneratorTest extends Specification {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	
	static final String TEMP_DIR = System.getProperty("java.io.tmpdir")
	static final String TEST_DIR = "testdir"
	static final String DS = "/"
	
	@Unroll("smoke test (jsp file)")
	def "smoke test (jsp file)" () {
		when:
		def testFileName = "test.jsp"
		
		final FileTreeBuilder tf = new FileTreeBuilder(new File(TEMP_DIR))
		tf.dir(TEST_DIR) {
			file(testFileName) {
				withWriter('UTF-8') { writer ->
					writer.write '''
<%--
<dmsc:root id="hoge" />
--%>
<%
Gadget gadget = (Gadget)renderRequest.getAttribute(WebKeys.GADGET);
%>

<%
<dmsc:sync id="hoge" >
%>
<c:choose>
    <c:when test="<%= gadget == null %>">
        <div class="alert alert-info portlet-configuration">
            <a href="<%= portletDisplay.getURLConfiguration() %>" onClick="<%= portletDisplay.getURLConfigurationJS() %>">
                <liferay-ui:message key="configure-a-gadget-to-be-displayed-in-this-portlet" />
            </a>
        </div>

        <liferay-ui:icon
            cssClass="portlet-configuration"
            iconCssClass="icon-cog"
            message="configure-gadget"
            method="get"
            onClick="<%= portletDisplay.getURLConfigurationJS() %>"
            url="<%= portletDisplay.getURLConfiguration() %>"
        />
    </c:when>
    <c:otherwise>
        <liferay-util:include page="/gadget/view.jsp" servletContext="<%= application %>" />
    </c:otherwise>
<%
</dmsc:sync>
%>
'''.stripIndent()
				}
			}
		}
		
		def filePath = new File(TEMP_DIR + TEST_DIR + DS + testFileName)
		TemplateGenerator tg = new TemplateGenerator()
		def result = tg.generator(filePath,null)
		
		String contents = FileUtils.readFileToString(filePath, Charset.defaultCharset());
		
		then:
		true == filePath.exists()
		contents == result
	}

	@Unroll("root tag missing. must be error")
	def "root tag missing. must be error" () {
		when:
		def testFileName = "test.js"
		
		final FileTreeBuilder tf = new FileTreeBuilder(new File(TEMP_DIR))
		tf.dir(TEST_DIR) {
			file(testFileName) {
				withWriter('UTF-8') { writer ->
					writer.write '''
<%
Gadget gadget = (Gadget)renderRequest.getAttribute(WebKeys.GADGET);
%>

<%
<dmsc:sync id="hoge" >
%>
<c:choose>
    <c:when test="<%= gadget == null %>">
        <div class="alert alert-info portlet-configuration">
            <a href="<%= portletDisplay.getURLConfiguration() %>" onClick="<%= portletDisplay.getURLConfigurationJS() %>">
                <liferay-ui:message key="configure-a-gadget-to-be-displayed-in-this-portlet" />
            </a>
        </div>

        <liferay-ui:icon
            cssClass="portlet-configuration"
            iconCssClass="icon-cog"
            message="configure-gadget"
            method="get"
            onClick="<%= portletDisplay.getURLConfigurationJS() %>"
            url="<%= portletDisplay.getURLConfiguration() %>"
        />
    </c:when>
    <c:otherwise>
        <liferay-util:include page="/gadget/view.jsp" servletContext="<%= application %>" />
    </c:otherwise>
<%
</dmsc:sync>
%>
'''.stripIndent()
				}
			}
		}
		
		def filePath = new File(TEMP_DIR + TEST_DIR + DS + testFileName)
		TemplateGenerator tg = new TemplateGenerator()
		def result = tg.generator(filePath,null)
		String contents = FileUtils.readFileToString(filePath, Charset.defaultCharset());
		def error_str = errContent.toString()
		
		then:
		true == filePath.exists()
		contents == result
		error_str.contains('root must be decleared first')
	}

	@Unroll("sync start tag missing. must be error")
	def "sync start tag missing. must be error" () {
		when:
		def testFileName = "test.js"
		
		final FileTreeBuilder tf = new FileTreeBuilder(new File(TEMP_DIR))
		tf.dir(TEST_DIR) {
			file(testFileName) {
				withWriter('UTF-8') { writer ->
					writer.write '''
<%--
<dmsc:root id="hoge" />
--%>
<%
Gadget gadget = (Gadget)renderRequest.getAttribute(WebKeys.GADGET);
%>

<c:choose>
    <c:when test="<%= gadget == null %>">
        <div class="alert alert-info portlet-configuration">
            <a href="<%= portletDisplay.getURLConfiguration() %>" onClick="<%= portletDisplay.getURLConfigurationJS() %>">
                <liferay-ui:message key="configure-a-gadget-to-be-displayed-in-this-portlet" />
            </a>
        </div>

        <liferay-ui:icon
            cssClass="portlet-configuration"
            iconCssClass="icon-cog"
            message="configure-gadget"
            method="get"
            onClick="<%= portletDisplay.getURLConfigurationJS() %>"
            url="<%= portletDisplay.getURLConfiguration() %>"
        />
    </c:when>
    <c:otherwise>
        <liferay-util:include page="/gadget/view.jsp" servletContext="<%= application %>" />
    </c:otherwise>
<%
</dmsc:sync>
%>
'''.stripIndent()
				}
			}
		}
		
		def filePath = new File(TEMP_DIR + TEST_DIR + DS + testFileName)
		TemplateGenerator tg = new TemplateGenerator()
		def result = tg.generator(filePath,null)
		String contents = FileUtils.readFileToString(filePath, Charset.defaultCharset());
		def error_str = errContent.toString()
		
		then:
		true == filePath.exists()
		contents == result
		error_str.contains('dmsc:sync start tag is missing.')
	}
	
	@Unroll("sync end tag missing. must be error")
	def "sync end tag missing. must be error" () {
		when:
		def testFileName = "test.js"
		
		final FileTreeBuilder tf = new FileTreeBuilder(new File(TEMP_DIR))
		tf.dir(TEST_DIR) {
			file(testFileName) {
				withWriter('UTF-8') { writer ->
					writer.write '''
<%--
<dmsc:root id="hoge" />
--%>
<%
Gadget gadget = (Gadget)renderRequest.getAttribute(WebKeys.GADGET);
%>

<%
<dmsc:sync id="hoge" >
%>
<c:choose>
    <c:when test="<%= gadget == null %>">
        <div class="alert alert-info portlet-configuration">
            <a href="<%= portletDisplay.getURLConfiguration() %>" onClick="<%= portletDisplay.getURLConfigurationJS() %>">
                <liferay-ui:message key="configure-a-gadget-to-be-displayed-in-this-portlet" />
            </a>
        </div>

        <liferay-ui:icon
            cssClass="portlet-configuration"
            iconCssClass="icon-cog"
            message="configure-gadget"
            method="get"
            onClick="<%= portletDisplay.getURLConfigurationJS() %>"
            url="<%= portletDisplay.getURLConfiguration() %>"
        />
    </c:when>
    <c:otherwise>
        <liferay-util:include page="/gadget/view.jsp" servletContext="<%= application %>" />
    </c:otherwise>
</c:choose>
'''.stripIndent()
				}
			}
		}
		
		def filePath = new File(TEMP_DIR + TEST_DIR + DS + testFileName)
		TemplateGenerator tg = new TemplateGenerator()
		def result = tg.generator(filePath,null)
		String contents = FileUtils.readFileToString(filePath, Charset.defaultCharset());
		def error_str = errContent.toString()
		
		then:
		true == filePath.exists()
		contents == result
		error_str.contains('Line index is overrun')
	}
	
	@Unroll("smoke test (java file)")
	def "smoke test (java file)" () {
		when:
		def testFileName = "test.java"
		
		final FileTreeBuilder tf = new FileTreeBuilder(new File(TEMP_DIR))
		tf.dir(TEST_DIR) {
			file(testFileName) {
				withWriter('UTF-8') { writer ->
					writer.write '''
/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.util;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Http;
import com.liferay.portal.kernel.util.PortalRunMode;
import com.liferay.portal.kernel.util.ReflectionUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;

import java.io.InputStream;

import java.lang.reflect.Method;

import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.UnknownHostException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * @author Shuyang Zhou
 */
public class JarUtil {

    public static Path downloadAndInstallJar(
            URL url, String libPath, String name)
        throws Exception {
/* <dmsc:root id="hoge" /> */
        String protocol = url.getProtocol();

        if (PortalRunMode.isTestMode() &&
            (protocol.equals(Http.HTTP) || protocol.equals(Http.HTTPS))) {

            String urlString = url.toExternalForm();

/* <dmsc:sync id="hoge" > */
            if (!urlString.contains("mirrors")) {
                try {
                    InetAddress.getAllByName("mirrors");

                    String newURLString = StringUtil.replace(
                        urlString, "://", "://mirrors/");

                    url = new URL(newURLString);

                    if (_log.isDebugEnabled()) {
                        _log.debug(
                            StringBundler.concat(
                                "Swapping URL from ", urlString, " to ",
                                newURLString));
                    }
                }
                catch (UnknownHostException uhe) {
                    if (_log.isDebugEnabled()) {
                        _log.debug("Unable to resolve \"mirrors\"");
                    }
                }
            }
/* </dmsc:sync> */
        }

        Path path = Paths.get(libPath, name);

        if (_log.isInfoEnabled()) {
            _log.info(
                StringBundler.concat(
                    "Downloading ", String.valueOf(url), " to ",
                    String.valueOf(path)));
        }
/* <dmsc:sync id="fuga" > */
        try (InputStream inputStream = url.openStream()) {
            Files.copy(inputStream, path, StandardCopyOption.REPLACE_EXISTING);
        }
/* </dmsc:sync> */
        if (_log.isInfoEnabled()) {
            _log.info(
                StringBundler.concat(
                    "Downloaded ", String.valueOf(url), " to ",
                    String.valueOf(path)));
        }

        return path;
    }

    public static void downloadAndInstallJar(
            URL url, String libPath, String name, URLClassLoader urlClassLoader)
        throws Exception {

        Path path = downloadAndInstallJar(url, libPath, name);

        URI uri = path.toUri();

        if (_log.isInfoEnabled()) {
            _log.info(
                StringBundler.concat(
                    "Installing ", String.valueOf(path), " to ",
                    String.valueOf(urlClassLoader)));
        }

        _addURLMethod.invoke(urlClassLoader, uri.toURL());

        if (_log.isInfoEnabled()) {
            _log.info(
                StringBundler.concat(
                    "Installed ", String.valueOf(path), " to ",
                    String.valueOf(urlClassLoader)));
        }
    }

    private static final Log _log = LogFactoryUtil.getLog(JarUtil.class);

    private static final Method _addURLMethod;

    static {
        try {
            _addURLMethod = ReflectionUtil.getDeclaredMethod(
                URLClassLoader.class, "addURL", URL.class);
        }
        catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

}
'''.stripIndent()
				}
			}
		}
		
		def filePath = new File(TEMP_DIR + TEST_DIR + DS + testFileName)
		TemplateGenerator tg = new TemplateGenerator()
		def result = tg.generator(filePath,null)
		
		String contents = FileUtils.readFileToString(filePath, Charset.defaultCharset());
		
		then:
		true == filePath.exists()
		contents == result
	}
	
	def setup() {
		FileUtils.deleteQuietly(new File(TEMP_DIR + TEST_DIR))
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}
	
	def cleanup() {
		System.setOut(null);
		System.setErr(null);
	}
}
