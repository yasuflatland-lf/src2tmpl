package com.liferay.damascus.antlr.generator;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.io.FileUtils;

import com.liferay.damascus.antlr.template.DmscSrcLexer;
import com.liferay.damascus.antlr.template.DmscSrcParser;

public class TemplateGenerator {

	/**
	 * Template Generetor
	 * 
	 * @param contentsFile
	 * @return
	 * @throws IOException
	 */
	public String generator(File contentsFile) throws IOException {
		String contents = FileUtils.readFileToString(contentsFile, Charset.defaultCharset());
		return generator(contents);
	}

	/**
	 * Template Generetor
	 * 
	 * @param contents
	 * @return
	 */
	public String generator(String contents) {
		CharStream input = CharStreams.fromString(contents);
		DmscSrcLexer lexer = new DmscSrcLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		DmscSrcParser parser = new DmscSrcParser(tokens);
		ParseTree tree = parser.file(); // parse

		ParseTreeWalker walker = new ParseTreeWalker();
		SourceListner sourceListner = new SourceListner(tokens);
		walker.walk(sourceListner, tree);

		return sourceListner.getRewriter().getText();
	}
	
	public String getAllTokens(File contentsFile) throws IOException {
		String contents = FileUtils.readFileToString(contentsFile, Charset.defaultCharset());
		return getAllTokens(contents);
	}
	
	public String getAllTokens(String contents) {
		CharStream input = CharStreams.fromString(contents);
		DmscSrcLexer lexer = new DmscSrcLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		DmscSrcParser parser = new DmscSrcParser(tokens);
		ParseTree tree = parser.file(); // parse

		ParseTreeWalker walker = new ParseTreeWalker();
		SourceListner sourceListner = new SourceListner(tokens);
		walker.walk(sourceListner, tree);

		List<Token> alltokens = tokens.getTokens();
		StringBuffer sb = new StringBuffer();
		for (Token t : alltokens) {
			sb.append(t.toString() + '\n');
		}
		
		return sb.toString();
	}
}
