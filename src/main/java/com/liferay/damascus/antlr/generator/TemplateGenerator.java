package com.liferay.damascus.antlr.generator;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.io.FileUtils;

import com.liferay.damascus.antlr.common.UnderlineListener;
import com.liferay.damascus.antlr.template.DmscSrcLexer;
import com.liferay.damascus.antlr.template.DmscSrcParser;

/**
 * Template Generator
 * 
 * @author Yasuyuki Takeo
 *
 */
public class TemplateGenerator {

	/**
	 * Template Generator
	 * 
	 * @param contentsFile
	 * @return parsed strings
	 * @throws IOException
	 */
	static public String generator(File contentsFile) throws IOException {
		String contents = FileUtils.readFileToString(contentsFile, Charset.defaultCharset());
		return generator(contents);
	}

	/**
	 * Template Generator
	 * 
	 * @param contents
	 * @return parsed strings
	 */
	static public String generator(String contents) {
		
		CharStream input = CharStreams.fromString(contents);
		DmscSrcLexer lexer = new DmscSrcLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		DmscSrcParser parser = new DmscSrcParser(tokens);
		
		// Apply custom listener
        parser.removeErrorListeners(); // remove ConsoleErrorListener
        parser.addErrorListener(new UnderlineListener());
        
		ParseTree tree = parser.file(); // parse

		ParseTreeWalker walker = new ParseTreeWalker();
		SourceLoader sourceLoader = new SourceLoader(tokens, new ConcurrentHashMap<>());
		walker.walk(sourceLoader, tree);

		return sourceLoader.getRewriter().getText();
	}
}
