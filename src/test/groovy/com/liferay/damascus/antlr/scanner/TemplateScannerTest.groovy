package com.liferay.damascus.antlr.scanner

import java.nio.charset.Charset

import org.apache.commons.io.FileUtils

import spock.lang.Specification
import spock.lang.Unroll

class TemplateScannerTest extends Specification {
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
		
		
		def compFileName = "comp.jsp"
		
		final FileTreeBuilder tfc = new FileTreeBuilder(new File(TEMP_DIR))
		tf.dir(TEST_DIR) {
			file(compFileName) {
				withWriter('UTF-8') { writer ->
					writer.write '''
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
<%'''.stripIndent()
				}
			}
		}
		def filePath = new File(TEMP_DIR + TEST_DIR + DS + testFileName)
		def compfilePath = new File(TEMP_DIR + TEST_DIR + DS + compFileName)
		
		def result = TemplateScanner.getContentsMap(filePath)
		
		String contents = FileUtils.readFileToString(compfilePath, Charset.defaultCharset());
		
		then:
		true == compfilePath.exists()
		true == result.containsKey("hoge")
		contents == result.get("hoge")
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
