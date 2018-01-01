package com.liferay.damascus.antlr.generator

import com.liferay.damascus.cli.test.tools.AntlrTestBase
import com.liferay.damascus.cli.test.tools.FileEnvUtils
import spock.lang.Unroll

class SourceToTemplateEngineTest extends AntlrTestBase {

    @Unroll("Smoke test of generator")
    def "Smoke test of generator"() {
        when:
        def targetName = "service.xml"
        def targetTemplateName = "Portlet_XXXXROOT_service.xml.ftl"
        def checkpattern = [
                'com.liferay.test': '${packageName}',
                'SampleSB'        : '${capFirstModel}',
                'sampleSB'        : '${uncapFirstModel}',
                'samplesb'        : '${lowercaseModel}',
                'SAMPLESB'        : '${uppercaseModel}',
                'sample-sb'       : '${snakecaseModel}'
        ]

        FileEnvUtils.createXmlSource(SRC_DIR, targetName, targetTemplateName)
        File createdFile = new File(SRC_DIR + DS + targetName)

        SourceToTemplateEngine.builder()
                .sourceRootPath(SRC_DIR)
                .templateDirPath(TMPLATE_DIR)
                .replacements(checkpattern)
                .build()
                .process()

        File createdTemplate = new File(TMPLATE_DIR + DS + targetTemplateName)

        then:
        true == createdFile.exists()
        true == createdTemplate.exists()
    }

}