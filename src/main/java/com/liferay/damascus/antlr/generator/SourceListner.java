package com.liferay.damascus.antlr.generator;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

import com.liferay.damascus.antlr.template.DmscSrcParser;
import com.liferay.damascus.antlr.template.DmscSrcParser.AttributeContext;
import com.liferay.damascus.antlr.template.DmscSrcParserBaseListener;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SourceListner extends DmscSrcParserBaseListener {

	public SourceListner(TokenStream tokens) {
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
			syncAttributes.put(attribute.Name().getText(), attribute.STRING().getText());
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

	protected Map<String, String> rootAttributes;
	protected Map<String, String> syncAttributes;
}
