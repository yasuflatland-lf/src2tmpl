package com.liferay.damascus.antlr.generator;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

import com.liferay.damascus.antlr.common.DmscSrcParserExListener;
import com.liferay.damascus.antlr.template.DmscSrcParser;
import com.liferay.damascus.antlr.template.DmscSrcParser.AttributeContext;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/**
 * Source Loader
 * 
 * @author Yasuyuki Takeo
 *
 */
@Slf4j
public class SourceLoader extends DmscSrcParserExListener {

	public SourceLoader(TokenStream tokens, Map<String, String> contentsIdMap) {
		this.contentsIdMap = contentsIdMap;
		
		rewriter = new TokenStreamRewriter(tokens);
		rootAttributes = new ConcurrentHashMap<>();
		syncAttributes = new ConcurrentHashMap<>();
	}

	/**
	 * Get Root Element
	 */
	@Override
	public void exitRootelement(DmscSrcParser.RootelementContext ctx) {

		List<AttributeContext> attributes = ctx.attribute();
		for (AttributeContext attribute : attributes) {
			rootAttributes.put(attribute.Name().getText(), attribute.STRING().getText());
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

				syncAttributes.put(currentId, "");
				return;
			}
		}
	}

	/**
	 * Get Sync End Element
	 */
	@Override
	public void exitSyncelementEnd(DmscSrcParser.SyncelementEndContext ctx) {
	}
	
	/**
	 * Get text data between sync tag
	 */
	@Override 
	public void exitSavedata(DmscSrcParser.SavedataContext ctx) {
		// Delete contents between tags
		//rewriter.delete(ctx.start);
		// Replace contents here
		// rewriter.insertAfter(ctx.start, "replace here");
	}	
	
	@Getter
	protected TokenStreamRewriter rewriter;

	protected Map<String, String> contentsIdMap;
	protected Map<String, String> rootAttributes;
	protected Map<String, String> syncAttributes;
}