// Generated from test.g4 by ANTLR 4.7.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class testParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INTEGER=1, LONG=2, SHORT=3, REAL=4, BEGIN=5, END=6, VAR=7, READ=8, WRITE=9, 
		WRITELN=10, COLON=11, SEMICOLON=12, COMMA=13, LPAR=14, RPAR=15, PLUS=16, 
		MINUS=17, DIV=18, MUL=19, EQ=20, STRING=21, NUMBER=22, NAME=23, WS=24;
	public static final int
		RULE_program = 0, RULE_variables = 1, RULE_declaration = 2, RULE_type = 3, 
		RULE_commands = 4, RULE_command = 5, RULE_arithmetic = 6;
	public static final String[] ruleNames = {
		"program", "variables", "declaration", "type", "commands", "command", 
		"arithmetic"
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

	@Override
	public String getGrammarFileName() { return "test.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public testParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(testParser.BEGIN, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode END() { return getToken(testParser.END, 0); }
		public TerminalNode VAR() { return getToken(testParser.VAR, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(14);
				match(VAR);
				setState(15);
				variables();
				}
			}

			setState(18);
			match(BEGIN);
			setState(19);
			commands();
			setState(20);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariablesContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				declaration();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(testParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(testParser.NAME, i);
		}
		public TerminalNode COLON() { return getToken(testParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(testParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(testParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(testParser.COMMA, i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(27);
					match(NAME);
					setState(28);
					match(COMMA);
					}
					} 
				}
				setState(33);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(34);
			match(NAME);
			setState(35);
			match(COLON);
			setState(36);
			type();
			setState(37);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(testParser.INTEGER, 0); }
		public TerminalNode LONG() { return getToken(testParser.LONG, 0); }
		public TerminalNode SHORT() { return getToken(testParser.SHORT, 0); }
		public TerminalNode REAL() { return getToken(testParser.REAL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << LONG) | (1L << SHORT) | (1L << REAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandsContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(testParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(testParser.SEMICOLON, i);
		}
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_commands);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << READ) | (1L << WRITE) | (1L << WRITELN) | (1L << NAME))) != 0)) {
				{
				{
				setState(41);
				command();
				setState(42);
				match(SEMICOLON);
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(testParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(testParser.NAME, i);
		}
		public TerminalNode EQ() { return getToken(testParser.EQ, 0); }
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(testParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(testParser.MINUS, 0); }
		public TerminalNode DIV() { return getToken(testParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(testParser.MUL, 0); }
		public TerminalNode READ() { return getToken(testParser.READ, 0); }
		public TerminalNode LPAR() { return getToken(testParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(testParser.RPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(testParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(testParser.COMMA, i);
		}
		public TerminalNode WRITE() { return getToken(testParser.WRITE, 0); }
		public TerminalNode WRITELN() { return getToken(testParser.WRITELN, 0); }
		public List<TerminalNode> STRING() { return getTokens(testParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(testParser.STRING, i);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_command);
		int _la;
		try {
			int _alt;
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				match(NAME);
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << DIV) | (1L << MUL))) != 0)) {
					{
					setState(50);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << DIV) | (1L << MUL))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(53);
				match(EQ);
				setState(54);
				arithmetic(0);
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(READ);
				setState(56);
				match(LPAR);
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(57);
						match(NAME);
						setState(58);
						match(COMMA);
						}
						} 
					}
					setState(63);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(64);
				match(NAME);
				setState(65);
				match(RPAR);
				}
				break;
			case WRITE:
			case WRITELN:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				_la = _input.LA(1);
				if ( !(_la==WRITE || _la==WRITELN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(67);
				match(LPAR);
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(70);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LPAR:
						case NUMBER:
						case NAME:
							{
							setState(68);
							arithmetic(0);
							}
							break;
						case STRING:
							{
							setState(69);
							match(STRING);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(72);
						match(COMMA);
						}
						} 
					}
					setState(77);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(80);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LPAR:
				case NUMBER:
				case NAME:
					{
					setState(78);
					arithmetic(0);
					}
					break;
				case STRING:
					{
					setState(79);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(82);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(testParser.LPAR, 0); }
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(testParser.RPAR, 0); }
		public TerminalNode NAME() { return getToken(testParser.NAME, 0); }
		public TerminalNode NUMBER() { return getToken(testParser.NUMBER, 0); }
		public TerminalNode PLUS() { return getToken(testParser.PLUS, 0); }
		public TerminalNode MUL() { return getToken(testParser.MUL, 0); }
		public TerminalNode MINUS() { return getToken(testParser.MINUS, 0); }
		public TerminalNode DIV() { return getToken(testParser.DIV, 0); }
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitArithmetic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		return arithmetic(0);
	}

	private ArithmeticContext arithmetic(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, _parentState);
		ArithmeticContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_arithmetic, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				{
				setState(86);
				match(LPAR);
				setState(87);
				arithmetic(0);
				setState(88);
				match(RPAR);
				}
				break;
			case NAME:
				{
				setState(90);
				match(NAME);
				}
				break;
			case NUMBER:
				{
				setState(91);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(106);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(94);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(95);
						match(PLUS);
						setState(96);
						arithmetic(8);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(97);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(98);
						match(MUL);
						setState(99);
						arithmetic(7);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(100);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(101);
						match(MINUS);
						setState(102);
						arithmetic(6);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(103);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(104);
						match(DIV);
						setState(105);
						arithmetic(5);
						}
						break;
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return arithmetic_sempred((ArithmeticContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmetic_sempred(ArithmeticContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32r\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\5\2\23\n\2\3\2\3\2"+
		"\3\2\3\2\3\3\6\3\32\n\3\r\3\16\3\33\3\4\3\4\7\4 \n\4\f\4\16\4#\13\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\7\6/\n\6\f\6\16\6\62\13\6\3\7\3"+
		"\7\5\7\66\n\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7>\n\7\f\7\16\7A\13\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7I\n\7\3\7\7\7L\n\7\f\7\16\7O\13\7\3\7\3\7\5\7S\n\7"+
		"\3\7\5\7V\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b_\n\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bm\n\b\f\b\16\bp\13\b\3\b\2\3\16\t\2\4"+
		"\6\b\n\f\16\2\5\3\2\3\6\3\2\22\25\3\2\13\f\2{\2\22\3\2\2\2\4\31\3\2\2"+
		"\2\6!\3\2\2\2\b)\3\2\2\2\n\60\3\2\2\2\fU\3\2\2\2\16^\3\2\2\2\20\21\7\t"+
		"\2\2\21\23\5\4\3\2\22\20\3\2\2\2\22\23\3\2\2\2\23\24\3\2\2\2\24\25\7\7"+
		"\2\2\25\26\5\n\6\2\26\27\7\b\2\2\27\3\3\2\2\2\30\32\5\6\4\2\31\30\3\2"+
		"\2\2\32\33\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\5\3\2\2\2\35\36\7\31"+
		"\2\2\36 \7\17\2\2\37\35\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3"+
		"\2\2\2#!\3\2\2\2$%\7\31\2\2%&\7\r\2\2&\'\5\b\5\2\'(\7\16\2\2(\7\3\2\2"+
		"\2)*\t\2\2\2*\t\3\2\2\2+,\5\f\7\2,-\7\16\2\2-/\3\2\2\2.+\3\2\2\2/\62\3"+
		"\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\13\3\2\2\2\62\60\3\2\2\2\63\65\7\31"+
		"\2\2\64\66\t\3\2\2\65\64\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\678\7\26"+
		"\2\28V\5\16\b\29:\7\n\2\2:?\7\20\2\2;<\7\31\2\2<>\7\17\2\2=;\3\2\2\2>"+
		"A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\7\31\2\2CV\7\21\2"+
		"\2DE\t\4\2\2EM\7\20\2\2FI\5\16\b\2GI\7\27\2\2HF\3\2\2\2HG\3\2\2\2IJ\3"+
		"\2\2\2JL\7\17\2\2KH\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NR\3\2\2\2OM"+
		"\3\2\2\2PS\5\16\b\2QS\7\27\2\2RP\3\2\2\2RQ\3\2\2\2ST\3\2\2\2TV\7\21\2"+
		"\2U\63\3\2\2\2U9\3\2\2\2UD\3\2\2\2V\r\3\2\2\2WX\b\b\1\2XY\7\20\2\2YZ\5"+
		"\16\b\2Z[\7\21\2\2[_\3\2\2\2\\_\7\31\2\2]_\7\30\2\2^W\3\2\2\2^\\\3\2\2"+
		"\2^]\3\2\2\2_n\3\2\2\2`a\f\t\2\2ab\7\22\2\2bm\5\16\b\ncd\f\b\2\2de\7\25"+
		"\2\2em\5\16\b\tfg\f\7\2\2gh\7\23\2\2hm\5\16\b\bij\f\6\2\2jk\7\24\2\2k"+
		"m\5\16\b\7l`\3\2\2\2lc\3\2\2\2lf\3\2\2\2li\3\2\2\2mp\3\2\2\2nl\3\2\2\2"+
		"no\3\2\2\2o\17\3\2\2\2pn\3\2\2\2\17\22\33!\60\65?HMRU^ln";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}