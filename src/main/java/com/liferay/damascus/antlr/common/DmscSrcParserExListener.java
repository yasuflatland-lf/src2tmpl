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
	 * @param str strings single / double quotations
	 * @return stripped strings
     */
	protected String stripQuotations(String str) {
		String str1 = StringUtils.strip(str, "\"");
		return StringUtils.strip(str1, "'");
	}

}
