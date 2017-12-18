// Generated from com/liferay/damascus/antlr/template/DmscSrcParser.g4 by ANTLR 4.7.1
package com.liferay.damascus.antlr.template;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DmscSrcParser}.
 */
public interface DmscSrcParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DmscSrcParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(DmscSrcParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmscSrcParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(DmscSrcParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmscSrcParser#rootElement}.
	 * @param ctx the parse tree
	 */
	void enterRootElement(DmscSrcParser.RootElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmscSrcParser#rootElement}.
	 * @param ctx the parse tree
	 */
	void exitRootElement(DmscSrcParser.RootElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmscSrcParser#syncElement}.
	 * @param ctx the parse tree
	 */
	void enterSyncElement(DmscSrcParser.SyncElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmscSrcParser#syncElement}.
	 * @param ctx the parse tree
	 */
	void exitSyncElement(DmscSrcParser.SyncElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmscSrcParser#syncContents}.
	 * @param ctx the parse tree
	 */
	void enterSyncContents(DmscSrcParser.SyncContentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmscSrcParser#syncContents}.
	 * @param ctx the parse tree
	 */
	void exitSyncContents(DmscSrcParser.SyncContentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmscSrcParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(DmscSrcParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmscSrcParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(DmscSrcParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmscSrcParser#htmlAttributeName}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttributeName(DmscSrcParser.HtmlAttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmscSrcParser#htmlAttributeName}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttributeName(DmscSrcParser.HtmlAttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmscSrcParser#htmlAttributeValue}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttributeValue(DmscSrcParser.HtmlAttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmscSrcParser#htmlAttributeValue}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttributeValue(DmscSrcParser.HtmlAttributeValueContext ctx);
}