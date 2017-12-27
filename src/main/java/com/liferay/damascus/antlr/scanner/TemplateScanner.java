package com.liferay.damascus.antlr.scanner;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;

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
 * Template Scanner
 * 
 * Scanning a template and extract contents to swap in a source where surrounded
 * by sync tags.
 * 
 * @author Yasuyuki Takeo
 *
 */
public class TemplateScanner {

	/**
	 * Get Contents Map
	 * 
	 * @param contentsFile
	 * @return parsed strings
	 * @throws IOException
	 */
	static public Map<String, String> getContentsMap(File contentsFile) throws IOException {
		String contents = FileUtils.readFileToString(contentsFile, Charset.defaultCharset());
		return getContentsMap(contents);
	}

	/**
	 * Get Contents Map
	 * 
	 * @param contents
	 * @return id and contents map for generator
	 */
	static public Map<String, String> getContentsMap(String contents) {

		CharStream input = CharStreams.fromString(contents);
		DmscSrcLexer lexer = new DmscSrcLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		DmscSrcParser parser = new DmscSrcParser(tokens);

		// Apply custom listener
		parser.removeErrorListeners(); // remove ConsoleErrorListener
		parser.addErrorListener(new UnderlineListener());

		ParseTree tree = parser.file(); // parse

		ParseTreeWalker walker = new ParseTreeWalker();
		TemplateLoader templateLoader = new TemplateLoader();
		walker.walk(templateLoader, tree);

		return templateLoader.getSyncAttributes();
	}
}
