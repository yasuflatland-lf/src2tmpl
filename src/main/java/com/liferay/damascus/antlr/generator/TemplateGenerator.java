package com.liferay.damascus.antlr.generator;

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

import lombok.extern.slf4j.Slf4j;

/**
 * Template Generator
 * 
 * @author Yasuyuki Takeo
 *
 */
@Slf4j
public class TemplateGenerator {

	/**
	 * Template Generator
	 * 
	 * @param contentsFile
	 * @param contentsIdMap
	 * @return parsed strings
	 * @throws IOException
	 */
	public String generator(File contentsFile, Map<String, String> contentsIdMap) throws IOException {
		String contents = FileUtils.readFileToString(contentsFile, Charset.defaultCharset());
		return generator(contents,contentsIdMap);
	}

	/**
	 * Template Generator
	 * 
	 * @param contents
	 * @param contentsIdMap
	 * @return parsed strings
	 */
	public String generator(String contents, Map<String, String> contentsIdMap) {
		
		// Always get data from a file
		return getSourceLoader(contents, contentsIdMap, false).getRewriter().getText();
	}

	/**
	 * Get Source Loader
	 * 
	 * @param contentsFile
	 * @param contentsIdMap
	 * @param cache
	 * @return
	 * @throws IOException
	 */
	public SourceLoader getSourceLoader(File contentsFile, Map<String, String> contentsIdMap, boolean cache) 
			throws IOException {
		String contents = FileUtils.readFileToString(contentsFile, Charset.defaultCharset());
		return getSourceLoader(contents,contentsIdMap,cache);
	
	}
	
	/**
	 * Get Source Loader
	 * 
	 * @param contents
	 * @param contentsIdMap
	 * @param use cache if it's true or process file
	 * @return
	 */
	public SourceLoader getSourceLoader(String contents, Map<String, String> contentsIdMap, boolean cache) {
		
		// Check cache
		if(cache) {
			if(null != _sourceLoader) {
				if(log.isDebugEnabled()) {
					log.debug("cache returned");
				}
				return _sourceLoader;
			}
		}
		
		CharStream input = CharStreams.fromString(contents);
		DmscSrcLexer lexer = new DmscSrcLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		DmscSrcParser parser = new DmscSrcParser(tokens);
		
		// Apply custom listener
        parser.removeErrorListeners(); // remove ConsoleErrorListener
        parser.addErrorListener(new UnderlineListener());
        
		ParseTree tree = parser.file(); // parse

		ParseTreeWalker walker = new ParseTreeWalker();
		
		_sourceLoader = new SourceLoader(tokens, contentsIdMap);
		walker.walk(_sourceLoader, tree);
		
		return _sourceLoader;
	}
	
	protected SourceLoader _sourceLoader = null;
}
