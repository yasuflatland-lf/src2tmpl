package com.liferay.damascus.antlr.generator

import com.liferay.damascus.cli.test.tools.AntlrTestBase
import com.liferay.damascus.cli.test.tools.FileEnvUtils
import org.apache.commons.io.FileUtils
import spock.lang.Unroll

import java.nio.charset.StandardCharsets

class SourceToTemplateEngineTest extends AntlrTestBase {

    @Unroll("Smoke test of generator (No template exists pattern)")
    def "Smoke test of generator (No template exists pattern)"() {
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

    @Unroll("Smoke test of generator (Template has existed pattern)")
    def "Smoke test of generator (Template has existed pattern)"() {
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

        FileEnvUtils.createXmlTemplate(TMPLATE_DIR, targetTemplateName, targetTemplateName)
        File createdTemplate = new File(TMPLATE_DIR + DS + targetTemplateName)


        SourceToTemplateEngine.builder()
                .sourceRootPath(SRC_DIR)
                .templateDirPath(TMPLATE_DIR + DS)
                .replacements(checkpattern)
                .build()
                .process()

        def processedContents = FileUtils.readFileToString(createdTemplate, StandardCharsets.UTF_8);
        def replacedContents = '''<!-- <dmsc:sync id="foo1"> -->
    <!-- REPLACED BY FOO1 FIRST TAG -->
<!-- </dmsc:sync >'''
        def replacedContens2 = '''<!-- <dmsc:sync id="barfoo"> -->
        <!-- REPLACED BY BARFOO SECOND TAG -->
<!-- </dmsc:sync> -->'''
        then:
        true == createdFile.exists()
        true == createdTemplate.exists()
        true == processedContents.contains(replacedContents)
        true == processedContents.contains(replacedContens2)
    }
}