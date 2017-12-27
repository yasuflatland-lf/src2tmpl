package com.liferay.damascus.antlr.scanner;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.lang3.StringUtils;

import com.liferay.damascus.antlr.template.DmscSrcParser;
import com.liferay.damascus.antlr.template.DmscSrcParser.AttributeContext;
import com.liferay.damascus.antlr.template.DmscSrcParserBaseListener;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/**
 * Template Loader
 * 
 * Scanning a template file to correct replace contents for template generator
 * 
 * @author Yasuyuki Takeo
 *
 */
@Slf4j
public class TemplateLoader extends DmscSrcParserBaseListener {

	/**
	 * Constructor
	 */
	public TemplateLoader() {
		syncAttributes = new ConcurrentHashMap<>();
	}

	protected String stripQuotations(String str) {
		String str1 = StringUtils.strip(str, "\"");
		return StringUtils.strip(str1, "'");
	}
	
	/**
	 * Get Sync Start element
	 */
	@Override
	public void exitSyncelementStart(DmscSrcParser.SyncelementStartContext ctx) {
		List<AttributeContext> attributes = ctx.attribute();
		for (AttributeContext attribute : attributes) {
			if (ID.equals(attribute.Name().getText())) {

				currentId = stripQuotations(attribute.STRING().getText());

				syncAttributes.put(currentId, "");
				return;
			}
		}
	}

	@Override
	public void exitSyncelementEnd(DmscSrcParser.SyncelementEndContext ctx) {
		currentId = "";
	}

	/**
	 * Get text data between sync tag
	 */
	@Override
	public void exitSavedata(DmscSrcParser.SavedataContext ctx) {
		if (log.isDebugEnabled()) {
			log.debug("ID <" + currentId + ">");
			log.debug("Text <<< " + ctx.getText() + ">>>");
		}
		syncAttributes.put(currentId, ctx.getText());
	}

	static final protected String ID = "id";

	protected String currentId = "";

	@Getter
	protected Map<String, String> syncAttributes;
}
