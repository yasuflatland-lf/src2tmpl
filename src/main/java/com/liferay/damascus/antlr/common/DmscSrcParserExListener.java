package com.liferay.damascus.antlr.common;

import org.apache.commons.lang3.StringUtils;

import com.liferay.damascus.antlr.template.DmscSrcParserBaseListener;

/**
 * Common Listener class base
 *  
 * @author Yasuyuki Takeo
 *
 */
public class DmscSrcParserExListener extends DmscSrcParserBaseListener {
	
	/**
	 * Strip Quotations
	 * 
	 * @param attribute strings single / double quotations
	 * @return stripped strings
	 */
	protected String stripQuotations(String str) {
		String str1 = StringUtils.strip(str, "\"");
		return StringUtils.strip(str1, "'");
	}

	/**
	 * ID attribute
	 */
	static final public String ID = "id";	
	
	/**
	 * Template file name
	 * 
	 * This is original template file name. 
	 * The file name should follow the Damascus's convention
	 * (Should start from Portlet_XXXX prefix)
	 * 
	 */
	static final public String TEMPLATE_FILE_NAME = "templateFileName";
	
	/**
	 * Version name
	 * 
	 * This is version name under the template directory.
	 * This parameter is required.
	 */
	static final public String VERSION = "version";
	
	/**
	 * Template directory path. 
	 * 
	 * This parameter is optional. If this is not configured in root,
	 * the default directory (${user}/.damascus) will be used.
	 */
	static final public String TEMPLATE_DIR_PATH = "templateDirPath";
}
