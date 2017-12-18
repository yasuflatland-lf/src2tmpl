// Generated from com/liferay/damascus/antlr/template/DmscSrcLexer.g4 by ANTLR 4.7.1
package com.liferay.damascus.antlr.template;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DmscSrcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN_TAG_ROOT=1, OPEN_TAG_SYNC=2, TEXT=3, WS=4, CLOSE_TAG_SYNC=5, SYNC_TEXT=6, 
		CLOSE_TAG_ROOT=7, CLOSE_TAG=8, TAG_EQUALS=9, TAG_NAME=10, ATTVALUE_VALUE=11, 
		ATTRIBUTE=12;
	public static final int
		DMSC_SYNC_TAG_MODE=1, DMSC_TAG_MODE=2, ATTVALUE=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "DMSC_SYNC_TAG_MODE", "DMSC_TAG_MODE", "ATTVALUE"
	};

	public static final String[] ruleNames = {
		"OPEN_TAG_ROOT", "OPEN_TAG_SYNC", "TEXT", "WS", "CLOSE_TAG_SYNC", "SYNC_TEXT", 
		"CLOSE_TAG_ROOT", "CLOSE_TAG", "TAG_EQUALS", "TAG_NAME", "DIGIT", "TAG_NameChar", 
		"TAG_NameStartChar", "ATTVALUE_VALUE", "ATTRIBUTE", "ATTCHAR", "ATTCHARS", 
		"HEXCHARS", "DECCHARS", "DOUBLE_QUOTE_STRING", "SINGLE_QUOTE_STRING"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OPEN_TAG_ROOT", "OPEN_TAG_SYNC", "TEXT", "WS", "CLOSE_TAG_SYNC", 
		"SYNC_TEXT", "CLOSE_TAG_ROOT", "CLOSE_TAG", "TAG_EQUALS", "TAG_NAME", 
		"ATTVALUE_VALUE", "ATTRIBUTE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public DmscSrcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DmscSrcLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16\u0129\b\1\b\1"+
		"\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t"+
		"\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\7\2\62\n\2"+
		"\f\2\16\2\65\13\2\3\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\7\2I\n\2\f\2\16\2L\13\2\3\2\3\2\3\3\7\3Q\n\3"+
		"\f\3\16\3T\13\3\3\3\3\3\7\3X\n\3\f\3\16\3[\13\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\7\3h\n\3\f\3\16\3k\13\3\3\3\3\3\3\4\6\4p\n\4\r"+
		"\4\16\4q\3\5\6\5u\n\5\r\5\16\5v\3\5\3\5\3\6\7\6|\n\6\f\6\16\6\177\13\6"+
		"\3\6\3\6\7\6\u0083\n\6\f\6\16\6\u0086\13\6\3\6\3\6\7\6\u008a\n\6\f\6\16"+
		"\6\u008d\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u009a\n"+
		"\6\f\6\16\6\u009d\13\6\3\6\3\6\7\6\u00a1\n\6\f\6\16\6\u00a4\13\6\3\6\3"+
		"\6\3\7\6\7\u00a9\n\7\r\7\16\7\u00aa\3\b\7\b\u00ae\n\b\f\b\16\b\u00b1\13"+
		"\b\3\b\3\b\7\b\u00b5\n\b\f\b\16\b\u00b8\13\b\3\b\3\b\7\b\u00bc\n\b\f\b"+
		"\16\b\u00bf\13\b\3\b\3\b\3\t\7\t\u00c4\n\t\f\t\16\t\u00c7\13\t\3\t\3\t"+
		"\7\t\u00cb\n\t\f\t\16\t\u00ce\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\7\13\u00d7"+
		"\n\13\f\13\16\13\u00da\13\13\3\13\3\13\7\13\u00de\n\13\f\13\16\13\u00e1"+
		"\13\13\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u00e9\n\r\3\16\5\16\u00ec\n\16\3\17"+
		"\7\17\u00ef\n\17\f\17\16\17\u00f2\13\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00fd\n\20\3\21\5\21\u0100\n\21\3\22\6\22\u0103\n"+
		"\22\r\22\16\22\u0104\3\22\5\22\u0108\n\22\3\23\3\23\6\23\u010c\n\23\r"+
		"\23\16\23\u010d\3\24\6\24\u0111\n\24\r\24\16\24\u0112\3\24\5\24\u0116"+
		"\n\24\3\25\3\25\7\25\u011a\n\25\f\25\16\25\u011d\13\25\3\25\3\25\3\26"+
		"\3\26\7\26\u0123\n\26\f\26\16\26\u0126\13\26\3\26\3\26\4q\u00aa\2\27\6"+
		"\3\b\4\n\5\f\6\16\7\20\b\22\t\24\n\26\13\30\f\32\2\34\2\36\2 \r\"\16$"+
		"\2&\2(\2*\2,\2.\2\6\2\3\4\5\f\5\2\13\f\16\17\"\"\3\2\62;\4\2/\60aa\5\2"+
		"\u00b9\u00b9\u0302\u0371\u2041\u2042\n\2<<C\\c|\u2072\u2191\u2c02\u2ff1"+
		"\u3003\ud801\uf902\ufdd1\ufdf2\uffff\3\2\"\"\t\2%%-=??AAC\\aac|\5\2\62"+
		";CHch\4\2$$>>\4\2))>>\2\u0140\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f"+
		"\3\2\2\2\3\16\3\2\2\2\3\20\3\2\2\2\4\22\3\2\2\2\4\24\3\2\2\2\4\26\3\2"+
		"\2\2\4\30\3\2\2\2\5 \3\2\2\2\5\"\3\2\2\2\6\63\3\2\2\2\bR\3\2\2\2\no\3"+
		"\2\2\2\ft\3\2\2\2\16}\3\2\2\2\20\u00a8\3\2\2\2\22\u00af\3\2\2\2\24\u00c5"+
		"\3\2\2\2\26\u00d1\3\2\2\2\30\u00d8\3\2\2\2\32\u00e2\3\2\2\2\34\u00e8\3"+
		"\2\2\2\36\u00eb\3\2\2\2 \u00f0\3\2\2\2\"\u00fc\3\2\2\2$\u00ff\3\2\2\2"+
		"&\u0102\3\2\2\2(\u0109\3\2\2\2*\u0110\3\2\2\2,\u0117\3\2\2\2.\u0120\3"+
		"\2\2\2\60\62\5\f\5\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3"+
		"\2\2\2\64\66\3\2\2\2\65\63\3\2\2\2\66:\7>\2\2\679\5\f\5\28\67\3\2\2\2"+
		"9<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\7f\2\2>?\7o\2\2?"+
		"@\7u\2\2@A\7e\2\2AB\7<\2\2BC\7t\2\2CD\7q\2\2DE\7q\2\2EF\7v\2\2FJ\3\2\2"+
		"\2GI\5\f\5\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2"+
		"\2MN\b\2\2\2N\7\3\2\2\2OQ\5\f\5\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2"+
		"\2\2SU\3\2\2\2TR\3\2\2\2UY\7>\2\2VX\5\f\5\2WV\3\2\2\2X[\3\2\2\2YW\3\2"+
		"\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7f\2\2]^\7o\2\2^_\7u\2\2_`\7e\2"+
		"\2`a\7<\2\2ab\7u\2\2bc\7{\2\2cd\7p\2\2de\7e\2\2ei\3\2\2\2fh\5\f\5\2gf"+
		"\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\b\3\2\2m"+
		"\t\3\2\2\2np\13\2\2\2on\3\2\2\2pq\3\2\2\2qr\3\2\2\2qo\3\2\2\2r\13\3\2"+
		"\2\2su\t\2\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\b\5"+
		"\3\2y\r\3\2\2\2z|\5\f\5\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~"+
		"\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0084\7>\2\2\u0081\u0083\5\f\5\2\u0082"+
		"\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u008b\7\61\2\2\u0088"+
		"\u008a\5\f\5\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\u008f\7f\2\2\u008f\u0090\7o\2\2\u0090\u0091\7u\2\2\u0091\u0092\7e\2\2"+
		"\u0092\u0093\7<\2\2\u0093\u0094\7u\2\2\u0094\u0095\7{\2\2\u0095\u0096"+
		"\7p\2\2\u0096\u0097\7e\2\2\u0097\u009b\3\2\2\2\u0098\u009a\5\f\5\2\u0099"+
		"\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u00a2\7@\2\2\u009f"+
		"\u00a1\5\f\5\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\u00a6\b\6\4\2\u00a6\17\3\2\2\2\u00a7\u00a9\13\2\2\2\u00a8\u00a7\3\2\2"+
		"\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\21"+
		"\3\2\2\2\u00ac\u00ae\5\f\5\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2"+
		"\2\2\u00b2\u00b6\7\61\2\2\u00b3\u00b5\5\f\5\2\u00b4\u00b3\3\2\2\2\u00b5"+
		"\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2"+
		"\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bd\7@\2\2\u00ba\u00bc\5\f\5\2\u00bb"+
		"\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\b\b\4\2\u00c1"+
		"\23\3\2\2\2\u00c2\u00c4\5\f\5\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2"+
		"\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5"+
		"\3\2\2\2\u00c8\u00cc\7@\2\2\u00c9\u00cb\5\f\5\2\u00ca\u00c9\3\2\2\2\u00cb"+
		"\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2"+
		"\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\b\t\5\2\u00d0\25\3\2\2\2\u00d1\u00d2"+
		"\7?\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\b\n\6\2\u00d4\27\3\2\2\2\u00d5"+
		"\u00d7\5\f\5\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2"+
		"\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db"+
		"\u00df\5\36\16\2\u00dc\u00de\5\34\r\2\u00dd\u00dc\3\2\2\2\u00de\u00e1"+
		"\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\31\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e2\u00e3\t\3\2\2\u00e3\33\3\2\2\2\u00e4\u00e9\5\36\16"+
		"\2\u00e5\u00e9\t\4\2\2\u00e6\u00e9\5\32\f\2\u00e7\u00e9\t\5\2\2\u00e8"+
		"\u00e4\3\2\2\2\u00e8\u00e5\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3\2"+
		"\2\2\u00e9\35\3\2\2\2\u00ea\u00ec\t\6\2\2\u00eb\u00ea\3\2\2\2\u00ec\37"+
		"\3\2\2\2\u00ed\u00ef\t\7\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0\3\2"+
		"\2\2\u00f3\u00f4\5\"\20\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\b\17\7\2\u00f6"+
		"!\3\2\2\2\u00f7\u00fd\5,\25\2\u00f8\u00fd\5.\26\2\u00f9\u00fd\5&\22\2"+
		"\u00fa\u00fd\5(\23\2\u00fb\u00fd\5*\24\2\u00fc\u00f7\3\2\2\2\u00fc\u00f8"+
		"\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd"+
		"#\3\2\2\2\u00fe\u0100\t\b\2\2\u00ff\u00fe\3\2\2\2\u0100%\3\2\2\2\u0101"+
		"\u0103\5$\21\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0102\3\2"+
		"\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u0108\7\"\2\2\u0107"+
		"\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\'\3\2\2\2\u0109\u010b\7%\2\2"+
		"\u010a\u010c\t\t\2\2\u010b\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010b"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010e)\3\2\2\2\u010f\u0111\t\3\2\2\u0110"+
		"\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2"+
		"\2\2\u0113\u0115\3\2\2\2\u0114\u0116\7\'\2\2\u0115\u0114\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116+\3\2\2\2\u0117\u011b\7$\2\2\u0118\u011a\n\n\2\2\u0119"+
		"\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2"+
		"\2\2\u011c\u011e\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u011f\7$\2\2\u011f"+
		"-\3\2\2\2\u0120\u0124\7)\2\2\u0121\u0123\n\13\2\2\u0122\u0121\3\2\2\2"+
		"\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127"+
		"\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128\7)\2\2\u0128/\3\2\2\2\'\2\3\4"+
		"\5\63:JRYiqv}\u0084\u008b\u009b\u00a2\u00aa\u00af\u00b6\u00bd\u00c5\u00cc"+
		"\u00d8\u00df\u00e8\u00eb\u00f0\u00fc\u00ff\u0104\u0107\u010d\u0112\u0115"+
		"\u011b\u0124\b\4\4\2\2\3\2\4\2\2\4\3\2\7\5\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}