package com.liferay.damascus.antlr.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.liferay.damascus.antlr.generator.TemplateContext;

public class TemplateGeneratorUtil {

	/**
	 * Root Attributes validator
	 * 
	 * @param sourceContext
	 * @return String Lists if it's error. Empty List if it's valid
	 */
	static public List<String> rootValidator(TemplateContext sourceContext) {
		
		Map<String, String> rootAttributes = sourceContext.getRootAttributes();
		List<String> errors = new ArrayList<>();
		
		if(!rootAttributes.containsKey(TemplateContext.ATTR_ID)) {
			errors.add(TemplateContext.ATTR_ID + " is missing");
		}
		
		if(!rootAttributes.containsKey(TemplateContext.ATTR_TEMPLATE_NAME)) {
			errors.add(TemplateContext.ATTR_TEMPLATE_NAME + " is missing");
		}

		if(!rootAttributes.containsKey(TemplateContext.ATTR_VERSION)) {
			if(!rootAttributes.containsKey(TemplateContext.ATTR_TEMPLATE_DIR)) {
				errors.add(TemplateContext.ATTR_TEMPLATE_DIR + " needs to be configured when " + TemplateContext.ATTR_VERSION + " is not configured.");
			}
		}
		
		return errors;
	}
	
	/**
	 * Sync Attributes validator
	 * 
	 * @param sourceContext
	 * @return String Lists if it's error. Empty List if it's valid
	 */
	static public List<String> syncValidator(TemplateContext sourceContext) {
		
		Map<String, String> syncAttributes = sourceContext.getSyncAttributes();
		List<String> errors = new ArrayList<>();
		
		if(!syncAttributes.containsKey(TemplateContext.ATTR_ID)) {
			errors.add(TemplateContext.ATTR_ID + " is missing");
		}
		
		return errors;
	}
}