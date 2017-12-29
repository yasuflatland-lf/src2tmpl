package com.liferay.damascus.antlr.generator;

import com.liferay.damascus.antlr.common.UnderlineListener;
import com.liferay.damascus.antlr.template.DmscSrcLexer;
import com.liferay.damascus.antlr.template.DmscSrcParser;
import com.liferay.damascus.cli.common.CommonUtil;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;

/**
 * Template Generator
 *
 * @author Yasuyuki Takeo
 */
public class TemplateGenerator {

    /**
     * Constructor
     *
     * @param contentsFile
     * @param targetTemplateContext
     */
    public TemplateGenerator(File contentsFile, TemplateContext targetTemplateContext) {
        this.contentsFile = contentsFile;
        this.targetTemplateContext = targetTemplateContext;
    }

    /**
     * Template Generator
     *
     * @return processed string
     * @throws IOException
     */
    public String generator() throws IOException {
        String contents = FileUtils.readFileToString(contentsFile, Charset.defaultCharset());
        // Always get data from a file
        return getSourceLoader(contents, targetTemplateContext).getRewriter().getText();
    }

    /**
     * Get Source Context
     *
     * @return TemplateContext
     * @throws IOException
     */
    public TemplateContext getSourceContext() throws IOException {
        String contents = FileUtils.readFileToString(contentsFile, Charset.defaultCharset());
        return getSourceLoader(contents, targetTemplateContext).getSourceContext();
    }

    /**
     * Get Source Loader
     *
     * @param contents
     * @param targetTemplateContext
     * @return
     */
    protected SourceConvertListener getSourceLoader(String contents, TemplateContext targetTemplateContext) {

        CharStream        input  = CharStreams.fromString(contents);
        DmscSrcLexer      lexer  = new DmscSrcLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DmscSrcParser     parser = new DmscSrcParser(tokens);

        // Apply custom listener
        parser.removeErrorListeners(); // remove ConsoleErrorListener
        parser.addErrorListener(new UnderlineListener());

        ParseTree tree = parser.file(); // parse

        ParseTreeWalker walker = new ParseTreeWalker();

        SourceConvertListener sourceLoader = new SourceConvertListener(tokens, targetTemplateContext);
        walker.walk(sourceLoader, tree);

        return sourceLoader;
    }

    /**
     * Replace keywords in contents
     *
     * @param contentsFile
     * @param replacements
     * @return
     * @throws IOException
     */
    public String replaceKeywords(File contentsFile, Map<String, String> replacements)
        throws IOException {
        String contents = FileUtils.readFileToString(contentsFile, Charset.defaultCharset());
        return CommonUtil.replaceKeywords(contents, replacements);
    }

    protected File contentsFile;
    protected TemplateContext targetTemplateContext;
}
