// Generated from C:/Users/User/Desktop/MT/automatic-parser/src\Grammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, GRAMMAR=12, TERMINAL=13, NONTERMINAL=14, CODEBLOCK=15, 
		WS=16, RANDOMSTRING=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "GRAMMAR", "TERMINAL", "NONTERMINAL", "CODEBLOCK", "WS", 
			"RANDOMSTRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'!'", "':'", "'('", "','", "')'", "'[returns'", "']'", 
			"'|'", "'='", "'WS ->'", "'grammar'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"GRAMMAR", "TERMINAL", "NONTERMINAL", "CODEBLOCK", "WS", "RANDOMSTRING"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "antlr/Grammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23x\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\7\16Q\n\16\f\16\16\16T\13\16\3\17"+
		"\3\17\7\17X\n\17\f\17\16\17[\13\17\3\20\3\20\6\20_\n\20\r\20\16\20`\3"+
		"\20\5\20d\n\20\7\20f\n\20\f\20\16\20i\13\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\6\22s\n\22\r\22\16\22t\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23\3"+
		"\2\b\3\2C\\\b\2\62;>>@@C\\aac|\3\2c|\4\2}}\177\177\5\2\13\f\17\17\"\""+
		"\3\2))\2}\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\3%\3\2\2\2\5\'\3\2\2\2\7)\3\2\2\2\t+\3\2\2\2\13-\3\2\2\2"+
		"\r/\3\2\2\2\17\61\3\2\2\2\21:\3\2\2\2\23<\3\2\2\2\25>\3\2\2\2\27@\3\2"+
		"\2\2\31F\3\2\2\2\33N\3\2\2\2\35U\3\2\2\2\37\\\3\2\2\2!l\3\2\2\2#p\3\2"+
		"\2\2%&\7=\2\2&\4\3\2\2\2\'(\7#\2\2(\6\3\2\2\2)*\7<\2\2*\b\3\2\2\2+,\7"+
		"*\2\2,\n\3\2\2\2-.\7.\2\2.\f\3\2\2\2/\60\7+\2\2\60\16\3\2\2\2\61\62\7"+
		"]\2\2\62\63\7t\2\2\63\64\7g\2\2\64\65\7v\2\2\65\66\7w\2\2\66\67\7t\2\2"+
		"\678\7p\2\289\7u\2\29\20\3\2\2\2:;\7_\2\2;\22\3\2\2\2<=\7~\2\2=\24\3\2"+
		"\2\2>?\7?\2\2?\26\3\2\2\2@A\7Y\2\2AB\7U\2\2BC\7\"\2\2CD\7/\2\2DE\7@\2"+
		"\2E\30\3\2\2\2FG\7i\2\2GH\7t\2\2HI\7c\2\2IJ\7o\2\2JK\7o\2\2KL\7c\2\2L"+
		"M\7t\2\2M\32\3\2\2\2NR\t\2\2\2OQ\t\3\2\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2"+
		"RS\3\2\2\2S\34\3\2\2\2TR\3\2\2\2UY\t\4\2\2VX\t\3\2\2WV\3\2\2\2X[\3\2\2"+
		"\2YW\3\2\2\2YZ\3\2\2\2Z\36\3\2\2\2[Y\3\2\2\2\\g\7}\2\2]_\n\5\2\2^]\3\2"+
		"\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2bd\5\37\20\2cb\3\2\2\2cd\3"+
		"\2\2\2df\3\2\2\2e^\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3"+
		"\2\2\2jk\7\177\2\2k \3\2\2\2lm\t\6\2\2mn\3\2\2\2no\b\21\2\2o\"\3\2\2\2"+
		"pr\7)\2\2qs\n\7\2\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2"+
		"vw\7)\2\2w$\3\2\2\2\t\2RY`cgt\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}