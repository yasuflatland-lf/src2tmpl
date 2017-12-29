package com.liferay.damascus.antlr.common;

import com.liferay.damascus.antlr.generator.TemplateContext;
import org.apache.commons.io.FilenameUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Template Generator Validator class
 *
 * @author Yasuyuki Takeo
 */
public class TemplateGenerateValidator {

    /**
     * Root Attributes validator
     *
     * @param sourceContext
     * @return String List if there are errors. Empty List if it's valid
     */
    static public List<String> rootValidator(TemplateContext sourceContext) {

        Map<String, String> rootAttributes = sourceContext.getRootAttributes();
        List<String>        errors         = new ArrayList<String>();

        // Template Name is required
        if (!rootAttributes.containsKey(TemplateContext.ATTR_TEMPLATE_NAME)) {
            errors.add(TemplateContext.ATTR_TEMPLATE_NAME + " is missing");
        } else {
            String templateName = rootAttributes.get(TemplateContext.ATTR_TEMPLATE_NAME);

            if (templateName.equals("")) {
                errors.add(TemplateContext.ATTR_TEMPLATE_NAME + " is empty. must be configured");
            }
        }

        // Version is optional, then the template directory must be configured instead
        if (!rootAttributes.containsKey(TemplateContext.ATTR_VERSION)) {
            if (!rootAttributes.containsKey(TemplateContext.ATTR_TEMPLATE_DIR)) {
                errors.add(
                    TemplateContext.ATTR_TEMPLATE_DIR +
                        " needs to be configured when " + TemplateContext.ATTR_VERSION + " is not configured.");
            } else {
                String templateDir = rootAttributes.get(TemplateContext.ATTR_TEMPLATE_DIR);

                if (null == FilenameUtils.normalize(templateDir)) {
                    errors.add(TemplateContext.ATTR_TEMPLATE_DIR + " is not valid path. <" + templateDir + ">");
                }
            }
        } else {
            // If version exists
            String attrVersion = rootAttributes.get(TemplateContext.ATTR_VERSION);

            if (attrVersion.equals("")) {
                errors.add(TemplateContext.ATTR_VERSION + " is empty. must be configured");
            }
        }

        return errors;
    }

    /**
     * Sync Attributes validator
     *
     * @param sourceContext
     * @return String List if there are errors. Empty List if it's valid
     */
    static public List<String> syncValidator(TemplateContext sourceContext) {

        Map<String, String> syncAttributes = sourceContext.getSyncAttributes();
        List<String>        errors         = new ArrayList<>();

        if (!syncAttributes.containsKey(TemplateContext.ATTR_ID)) {
            errors.add(TemplateContext.ATTR_ID + " is missing");
        } else {
            String attrId = syncAttributes.get(TemplateContext.ATTR_ID);

            if (attrId.equals("")) {
                errors.add(TemplateContext.ATTR_ID + " is empty. must be configured");
            }
        }

        return errors;
    }
}