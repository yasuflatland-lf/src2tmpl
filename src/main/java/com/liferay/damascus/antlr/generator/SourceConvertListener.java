package com.liferay.damascus.antlr.generator;

import java.util.List;

import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

import com.liferay.damascus.antlr.common.DmscSrcParserExListener;
import com.liferay.damascus.antlr.template.DmscSrcParser;
import com.liferay.damascus.antlr.template.DmscSrcParser.AttributeContext;

import lombok.Getter;

/**
 * Source Convert Listener
 * 
 * Listner for converting source files into templates. 
 * 
 * @author Yasuyuki Takeo
 *
 */
public class SourceConvertListener extends DmscSrcParserExListener {

	/**
	 * Constructor
	 * 
	 * @param tokens
	 * @param contentsIdMap
	 */
	public SourceConvertListener(TokenStream tokens, TemplateContext targetTemplateContext) {

		rewriter = new TokenStreamRewriter(tokens);
		sourceContext = new TemplateContext();
		this.targetTemplateContext = targetTemplateContext;
	}

	/**
	 * Get Root Element
	 */
	@Override
	public void exitRootelement(DmscSrcParser.RootelementContext ctx) {

		List<AttributeContext> attributes = ctx.attribute();
		for (AttributeContext attribute : attributes) {

			String value = stripQuotations(attribute.STRING().getText());

			sourceContext.setRootAttribute(attribute.Name().getText(), value);
		}
	}

	/**
	 * Get Sync Start element
	 */
	@Override
	public void exitSyncelementStart(DmscSrcParser.SyncelementStartContext ctx) {
		List<AttributeContext> attributes = ctx.attribute();
		for (AttributeContext attribute : attributes) {
			if (ID.equals(attribute.Name().getText())) {

				String currentId = stripQuotations(attribute.STRING().getText());

				sourceContext.setSyncAttribute(currentId, "");
				return;
			}
		}
	}

	/**
	 * Get text data between sync tag
	 */
	@Override
	public void exitSavedata(DmscSrcParser.SavedataContext ctx) {
		// Delete contents between tags
		// rewriter.delete(ctx.start);
		// Replace contents here
		// rewriter.insertAfter(ctx.start, "replace here");
	}

	@Getter
	protected TokenStreamRewriter rewriter;

	@Getter
	protected TemplateContext sourceContext;

	protected TemplateContext targetTemplateContext;

}
