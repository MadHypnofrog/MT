// Generated from test.g4 by ANTLR 4.7.1
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class testLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INTEGER=1, LONG=2, SHORT=3, REAL=4, BEGIN=5, END=6, VAR=7, READ=8, WRITE=9, 
		WRITELN=10, COLON=11, SEMICOLON=12, COMMA=13, LPAR=14, RPAR=15, PLUS=16, 
		MINUS=17, DIV=18, MUL=19, EQ=20, STRING=21, NUMBER=22, NAME=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INTEGER", "LONG", "SHORT", "REAL", "BEGIN", "END", "VAR", "READ", "WRITE", 
		"WRITELN", "COLON", "SEMICOLON", "COMMA", "LPAR", "RPAR", "AP", "PLUS", 
		"MINUS", "DIV", "MUL", "EQ", "STRING", "NUMBER", "NAME", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'integer'", "'longint'", "'shortint'", "'real'", "'begin'", "'end.'", 
		"'var'", "'read'", "'write'", "'writeln'", "':'", "';'", "','", "'('", 
		"')'", "'+'", "'-'", "'/'", "'*'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INTEGER", "LONG", "SHORT", "REAL", "BEGIN", "END", "VAR", "READ", 
		"WRITE", "WRITELN", "COLON", "SEMICOLON", "COMMA", "LPAR", "RPAR", "PLUS", 
		"MINUS", "DIV", "MUL", "EQ", "STRING", "NUMBER", "NAME", "WS"
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


	public testLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "test.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00b0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\7\27\u008e\n\27\f\27\16"+
		"\27\u0091\13\27\3\27\3\27\3\30\3\30\7\30\u0097\n\30\f\30\16\30\u009a\13"+
		"\30\3\30\6\30\u009d\n\30\r\30\16\30\u009e\5\30\u00a1\n\30\3\31\3\31\7"+
		"\31\u00a5\n\31\f\31\16\31\u00a8\13\31\3\32\6\32\u00ab\n\32\r\32\16\32"+
		"\u00ac\3\32\3\32\2\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\2#\22%\23\'\24)\25+\26-\27/\30\61\31\63"+
		"\32\3\2\t\b\2\"\"*;??C\\aac|\3\2\63;\3\2\62;\4\2\60\60\62;\5\2C\\aac|"+
		"\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u00b4\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2"+
		"\2\5=\3\2\2\2\7E\3\2\2\2\tN\3\2\2\2\13S\3\2\2\2\rY\3\2\2\2\17^\3\2\2\2"+
		"\21b\3\2\2\2\23g\3\2\2\2\25m\3\2\2\2\27u\3\2\2\2\31w\3\2\2\2\33y\3\2\2"+
		"\2\35{\3\2\2\2\37}\3\2\2\2!\177\3\2\2\2#\u0081\3\2\2\2%\u0083\3\2\2\2"+
		"\'\u0085\3\2\2\2)\u0087\3\2\2\2+\u0089\3\2\2\2-\u008b\3\2\2\2/\u0094\3"+
		"\2\2\2\61\u00a2\3\2\2\2\63\u00aa\3\2\2\2\65\66\7k\2\2\66\67\7p\2\2\67"+
		"8\7v\2\289\7g\2\29:\7i\2\2:;\7g\2\2;<\7t\2\2<\4\3\2\2\2=>\7n\2\2>?\7q"+
		"\2\2?@\7p\2\2@A\7i\2\2AB\7k\2\2BC\7p\2\2CD\7v\2\2D\6\3\2\2\2EF\7u\2\2"+
		"FG\7j\2\2GH\7q\2\2HI\7t\2\2IJ\7v\2\2JK\7k\2\2KL\7p\2\2LM\7v\2\2M\b\3\2"+
		"\2\2NO\7t\2\2OP\7g\2\2PQ\7c\2\2QR\7n\2\2R\n\3\2\2\2ST\7d\2\2TU\7g\2\2"+
		"UV\7i\2\2VW\7k\2\2WX\7p\2\2X\f\3\2\2\2YZ\7g\2\2Z[\7p\2\2[\\\7f\2\2\\]"+
		"\7\60\2\2]\16\3\2\2\2^_\7x\2\2_`\7c\2\2`a\7t\2\2a\20\3\2\2\2bc\7t\2\2"+
		"cd\7g\2\2de\7c\2\2ef\7f\2\2f\22\3\2\2\2gh\7y\2\2hi\7t\2\2ij\7k\2\2jk\7"+
		"v\2\2kl\7g\2\2l\24\3\2\2\2mn\7y\2\2no\7t\2\2op\7k\2\2pq\7v\2\2qr\7g\2"+
		"\2rs\7n\2\2st\7p\2\2t\26\3\2\2\2uv\7<\2\2v\30\3\2\2\2wx\7=\2\2x\32\3\2"+
		"\2\2yz\7.\2\2z\34\3\2\2\2{|\7*\2\2|\36\3\2\2\2}~\7+\2\2~ \3\2\2\2\177"+
		"\u0080\7)\2\2\u0080\"\3\2\2\2\u0081\u0082\7-\2\2\u0082$\3\2\2\2\u0083"+
		"\u0084\7/\2\2\u0084&\3\2\2\2\u0085\u0086\7\61\2\2\u0086(\3\2\2\2\u0087"+
		"\u0088\7,\2\2\u0088*\3\2\2\2\u0089\u008a\7?\2\2\u008a,\3\2\2\2\u008b\u008f"+
		"\5!\21\2\u008c\u008e\t\2\2\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0092\u0093\5!\21\2\u0093.\3\2\2\2\u0094\u0098\t\3\2\2\u0095\u0097"+
		"\t\4\2\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u00a0\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009d\t\5"+
		"\2\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009c\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\60\3\2\2\2\u00a2\u00a6\t\6\2\2\u00a3\u00a5\t\7\2\2\u00a4\u00a3"+
		"\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\62\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ab\t\b\2\2\u00aa\u00a9\3\2\2"+
		"\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae"+
		"\3\2\2\2\u00ae\u00af\b\32\2\2\u00af\64\3\2\2\2\t\2\u008f\u0098\u009e\u00a0"+
		"\u00a6\u00ac\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}