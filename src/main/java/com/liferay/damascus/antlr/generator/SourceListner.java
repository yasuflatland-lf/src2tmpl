package com.liferay.damascus.antlr.generator;

import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

import com.liferay.damascus.antlr.template.DmscSrcParserBaseListener;

import lombok.Getter;

public class SourceListner extends DmscSrcParserBaseListener {

    public SourceListner(TokenStream tokens) {
        rewriter = new TokenStreamRewriter(tokens);
    }

    @Getter
    private TokenStreamRewriter rewriter;
}
