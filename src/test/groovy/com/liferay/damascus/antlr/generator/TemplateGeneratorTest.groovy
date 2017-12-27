package com.liferay.damascus.antlr.generator

import spock.lang.Specification
import spock.lang.Unroll

import java.nio.charset.Charset

import org.apache.commons.io.FileUtils

class TemplateGeneratorTest extends Specification {
	static final String TEMP_DIR = System.getProperty("java.io.tmpdir")
	static final String TEST_DIR = "testdir"
	static final String DS = "/"
	
	@Unroll("smoke test")
	def "smoke test" () {
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
<%
</dmsc:sync>
%>
'''.stripIndent()
				}
			}
		}
		
		def filePath = new File(TEMP_DIR + TEST_DIR + DS + testFileName)
		TemplateGenerator tmg = new TemplateGenerator()
		def result = tmg.generator(filePath)
		
		String contents = FileUtils.readFileToString(filePath, Charset.defaultCharset());
		
		then:
		true == filePath.exists()
		contents == result
	}
	
	def setup() {
		FileUtils.deleteQuietly(new File(TEMP_DIR + TEST_DIR))
	}
}
