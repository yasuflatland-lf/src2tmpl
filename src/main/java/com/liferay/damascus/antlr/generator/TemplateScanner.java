package com.liferay.damascus.antlr.generator;

import com.liferay.damascus.antlr.common.UnderlineListener;
import com.liferay.damascus.antlr.template.DmscSrcLexer;
import com.liferay.damascus.antlr.template.DmscSrcParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/**
 * Template Scanner
 * <p/>
 * Scanning a target template and extract contents to swap in a source where surrounded
 * by sync tags.
 *
 * @author Yasuyuki Takeo
 */
public class TemplateScanner {

    /**
     * Constructor
     *
     * @param contentsFile
     */
    public TemplateScanner(File contentsFile) {
        this.contentsFile = contentsFile;
    }

    /**
     * Get Contents Map
     *
     * @return parsed strings
     * @throws IOException
     */
    public TemplateContext getTargetTemplateContext() throws IOException {
        String contents = FileUtils.readFileToString(contentsFile, Charset.defaultCharset());
        return getTemplateLoader(contents).getTargetTemplateContext();
    }

    /**
     * Get Template Loader
     *
     * @param contents
     * @return id and contents map for generator
     */
    protected TemplateScanListener getTemplateLoader(String contents) {

        CharStream        input  = CharStreams.fromString(contents);
        DmscSrcLexer      lexer  = new DmscSrcLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DmscSrcParser     parser = new DmscSrcParser(tokens);

        // Apply custom listener
        parser.removeErrorListeners(); // remove ConsoleErrorListener
        parser.addErrorListener(new UnderlineListener());

        ParseTree tree = parser.file(); // parse

        ParseTreeWalker      walker         = new ParseTreeWalker();
        TemplateScanListener templateLoader = new TemplateScanListener();
        walker.walk(templateLoader, tree);

        return templateLoader;
    }

    protected File contentsFile;
}
