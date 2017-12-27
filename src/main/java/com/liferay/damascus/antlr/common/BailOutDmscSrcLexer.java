package com.liferay.damascus.antlr.common;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.LexerNoViableAltException;

import com.liferay.damascus.antlr.template.DmscSrcLexer;

public class BailOutDmscSrcLexer extends DmscSrcLexer {

	public BailOutDmscSrcLexer(CharStream input) {
		super(input);
	}
	
    public void recover(LexerNoViableAltException e) {
        throw new RuntimeException(e); // Bail out
    }
}
