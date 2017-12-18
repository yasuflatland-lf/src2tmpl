package com.liferay.damascus.antlr.template

import org.antlr.v4.gui.TestRig
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.ListTokenSource
import org.antlr.v4.runtime.Token
import org.antlr.v4.runtime.TokenStreamRewriter
import org.antlr.v4.runtime.tree.ParseTree
import spock.lang.Specification

class DmscSrcTest extends Specification {
    def "parse single bundle"() {
        given:
        def stream = CharStreams.fromString('<test>hoge</test>')
        def lexer = new DmscSrcLexer(stream)
        def tokens = new CommonTokenStream(lexer)
        def parser = new DmscSrcParser(tokens)

        when:
        ParseTree tree = parser.file(); // begin parsing at init rule

        then:
        "" == tree.toStringTree(parser)
    }
}
