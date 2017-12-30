package com.liferay.damascus.antlr.generator;

import com.liferay.damascus.antlr.common.TemplateGenerateValidator;
import com.liferay.damascus.cli.common.CommonUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

/**
 * Source to Template convert engine
 *
 * @author Yasuyuki Takeo
 */
@Slf4j
public class SourceToTemplateEngine {

    /**
     * Process source files to convert to template files
     *
     * @param sourceRootPath  Source files' root directory. (this method will process directories under the root recursively)
     * @param templateDirPath Template files' root directory. The path must be end with '/'
     * @param patterns        White list of process target file extensions.
     * @throws IOException
     */
    public void process(String sourceRootPath, String templateDirPath, List<String> patterns)
        throws IOException {

        // Fetch white pattern for target source files
        if (null == patterns) {
            patterns = CommonUtil.stringToList(EXT_WHITE_LIST);
        }

        // Normalize path
        String validatedPath = FilenameUtils.normalize(templateDirPath);

        if (null == validatedPath) {
            log.error("Template file path is invalid. <" + templateDirPath + ">");
            return;
        }

        templateDirPath = validatedPath;

        // Get target file list
        List<File> targetFiles = CommonUtil.getTargetFiles(sourceRootPath, patterns);

        for (File target : targetFiles) {

            // Scan the source file if it includes dmsc root tag
            TemplateContext sourceTemplateContext =
                TemplateGenerator
                    .builder()
                    .contentsFile(target)
                    .build()
                    .getSourceContext();

            if (!sourceTemplateContext.isRootTagExist()) {
                log.debug("A root tag does not exist. Skip.");
                continue;
            }

            List<String> errors = TemplateGenerateValidator.rootValidator(sourceTemplateContext);

            if (0 < errors.size()) {
                for (String error : errors) {
                    log.error(error);
                }
                log.error("Error occurs at parameter validation of root tag. Skip this file.");
                continue;
            }

            // Scan the template file and fetch contents to replace
            String templateName     = sourceTemplateContext.getRootAttribute(TemplateContext.ATTR_TEMPLATE_NAME);
            File   templateFullPath = new File(templateDirPath + templateName);

            TemplateContext targetTemplateContext = null;
            if (templateFullPath.exists()) {

                targetTemplateContext
                    = TemplateScanner
                    .builder()
                    .contentsFile(templateFullPath)
                    .build()
                    .getTargetTemplateContext();
            }

            // Rescan the source file and replace contents if the template file has already exist.
            // Or simply copy the source to the template.
            String processedContents =
                TemplateGenerator.builder()
                    .contentsFile(target)
                    .targetTemplateContext(targetTemplateContext)
                    .build()
                    .process();

            // Write template file
            FileUtils.writeStringToFile(
                templateFullPath,
                processedContents,
                Charset.defaultCharset());

        }
    }

    // White list of searching directory.
    // TODO: This value must be configured in settings.properties under .damascus
    static public final String EXT_WHITE_LIST = "*.java,*.jsp,*.xml,*.bnd,*.gradle,*.properties,*.json,*.jspf";
}
