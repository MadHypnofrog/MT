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
		T__0=1, FUNCTION=2, INTEGER=3, LONG=4, SHORT=5, REAL=6, BEGIN=7, END=8, 
		VAR=9, READ=10, WRITE=11, WRITELN=12, COLON=13, SEMICOLON=14, COMMA=15, 
		LPAR=16, RPAR=17, PLUS=18, MINUS=19, DIV=20, MUL=21, EQ=22, STRING=23, 
		NUMBER=24, NAME=25, WS=26;
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_header = 2, RULE_variables = 3, 
		RULE_declaration = 4, RULE_type = 5, RULE_commands = 6, RULE_command = 7, 
		RULE_arithmetic = 8;
	public static final String[] ruleNames = {
		"program", "function", "header", "variables", "declaration", "type", "commands", 
		"command", "arithmetic"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'function'", "'integer'", "'longint'", "'shortint'", "'real'", 
		"'begin'", "'end'", "'var'", "'read'", "'write'", "'writeln'", "':'", 
		"';'", "','", "'('", "')'", "'+'", "'-'", "'/'", "'*'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "FUNCTION", "INTEGER", "LONG", "SHORT", "REAL", "BEGIN", "END", 
		"VAR", "READ", "WRITE", "WRITELN", "COLON", "SEMICOLON", "COMMA", "LPAR", 
		"RPAR", "PLUS", "MINUS", "DIV", "MUL", "EQ", "STRING", "NUMBER", "NAME", 
		"WS"
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
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
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
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(18);
				match(VAR);
				setState(19);
				variables();
				}
			}

			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(22);
				function();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
			match(BEGIN);
			setState(29);
			commands();
			setState(30);
			match(END);
			setState(31);
			match(T__0);
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

	public static class FunctionContext extends ParserRuleContext {
		public HeaderContext h;
		public Token n;
		public TerminalNode BEGIN() { return getToken(testParser.BEGIN, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(testParser.COLON, 0); }
		public TerminalNode EQ() { return getToken(testParser.EQ, 0); }
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(testParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(testParser.SEMICOLON, i);
		}
		public TerminalNode END() { return getToken(testParser.END, 0); }
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public TerminalNode NAME() { return getToken(testParser.NAME, 0); }
		public TerminalNode VAR() { return getToken(testParser.VAR, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			((FunctionContext)_localctx).h = header();
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(34);
				match(VAR);
				setState(35);
				variables();
				}
			}

			setState(38);
			match(BEGIN);
			setState(39);
			commands();
			setState(40);
			((FunctionContext)_localctx).n = match(NAME);
			setState(41);
			match(COLON);
			setState(42);
			match(EQ);
			setState(43);
			arithmetic(0);
			setState(44);
			match(SEMICOLON);
			setState(45);
			match(END);
			setState(46);
			match(SEMICOLON);
			setState(47);
			if (!(((FunctionContext)_localctx).h.name.equals(((FunctionContext)_localctx).n.getText()))) throw new FailedPredicateException(this, "$h.name.equals($n.getText())");
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

	public static class HeaderContext extends ParserRuleContext {
		public String name;
		public Token n;
		public TerminalNode FUNCTION() { return getToken(testParser.FUNCTION, 0); }
		public TerminalNode LPAR() { return getToken(testParser.LPAR, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(testParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(testParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(testParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(testParser.SEMICOLON, i);
		}
		public TerminalNode NAME() { return getToken(testParser.NAME, 0); }
		public List<TerminalNode> VAR() { return getTokens(testParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(testParser.VAR, i);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_header);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(FUNCTION);
			setState(50);
			((HeaderContext)_localctx).n = match(NAME);
			setState(51);
			match(LPAR);
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(53);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==VAR) {
						{
						setState(52);
						match(VAR);
						}
					}

					setState(55);
					declaration();
					setState(56);
					match(SEMICOLON);
					}
					} 
				}
				setState(62);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(63);
				match(VAR);
				}
			}

			setState(66);
			declaration();
			setState(67);
			match(RPAR);
			setState(68);
			match(COLON);
			setState(69);
			type();
			setState(70);
			match(SEMICOLON);
			((HeaderContext)_localctx).name =  ((HeaderContext)_localctx).n.getText();
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
		public List<TerminalNode> SEMICOLON() { return getTokens(testParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(testParser.SEMICOLON, i);
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
		enterRule(_localctx, 6, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73);
				declaration();
				setState(74);
				match(SEMICOLON);
				}
				}
				setState(78); 
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
		enterRule(_localctx, 8, RULE_declaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(80);
					match(NAME);
					setState(81);
					match(COMMA);
					}
					} 
				}
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(87);
			match(NAME);
			setState(88);
			match(COLON);
			setState(89);
			type();
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
		enterRule(_localctx, 10, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
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
		enterRule(_localctx, 12, RULE_commands);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(93);
					command();
					setState(94);
					match(SEMICOLON);
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		enterRule(_localctx, 14, RULE_command);
		int _la;
		try {
			int _alt;
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(NAME);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << DIV) | (1L << MUL))) != 0)) {
					{
					setState(102);
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

				setState(105);
				match(EQ);
				setState(106);
				arithmetic(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(READ);
				setState(108);
				match(LPAR);
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(109);
						match(NAME);
						setState(110);
						match(COMMA);
						}
						} 
					}
					setState(115);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(116);
				match(NAME);
				setState(117);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				_la = _input.LA(1);
				if ( !(_la==WRITE || _la==WRITELN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(119);
				match(LPAR);
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(122);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LPAR:
						case NUMBER:
						case NAME:
							{
							setState(120);
							arithmetic(0);
							}
							break;
						case STRING:
							{
							setState(121);
							match(STRING);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(124);
						match(COMMA);
						}
						} 
					}
					setState(129);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(132);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LPAR:
				case NUMBER:
				case NAME:
					{
					setState(130);
					arithmetic(0);
					}
					break;
				case STRING:
					{
					setState(131);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(134);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				match(NAME);
				setState(136);
				match(LPAR);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME) {
					{
					setState(141);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(137);
							match(NAME);
							setState(138);
							match(COMMA);
							}
							} 
						}
						setState(143);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
					}
					setState(144);
					match(NAME);
					}
				}

				setState(147);
				match(RPAR);
				}
				break;
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
		public List<TerminalNode> NAME() { return getTokens(testParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(testParser.NAME, i);
		}
		public TerminalNode NUMBER() { return getToken(testParser.NUMBER, 0); }
		public List<TerminalNode> COMMA() { return getTokens(testParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(testParser.COMMA, i);
		}
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_arithmetic, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(151);
				match(LPAR);
				setState(152);
				arithmetic(0);
				setState(153);
				match(RPAR);
				}
				break;
			case 2:
				{
				setState(155);
				match(NAME);
				}
				break;
			case 3:
				{
				setState(156);
				match(NUMBER);
				}
				break;
			case 4:
				{
				setState(157);
				match(NAME);
				setState(158);
				match(LPAR);
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME) {
					{
					setState(163);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(159);
							match(NAME);
							setState(160);
							match(COMMA);
							}
							} 
						}
						setState(165);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
					}
					setState(166);
					match(NAME);
					}
				}

				setState(169);
				match(RPAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(184);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(172);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(173);
						match(PLUS);
						setState(174);
						arithmetic(9);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(175);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(176);
						match(MUL);
						setState(177);
						arithmetic(8);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(178);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(179);
						match(MINUS);
						setState(180);
						arithmetic(7);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(181);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(182);
						match(DIV);
						setState(183);
						arithmetic(6);
						}
						break;
					}
					} 
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		case 1:
			return function_sempred((FunctionContext)_localctx, predIndex);
		case 8:
			return arithmetic_sempred((ArithmeticContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean function_sempred(FunctionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return ((FunctionContext)_localctx).h.name.equals(((FunctionContext)_localctx).n.getText());
		}
		return true;
	}
	private boolean arithmetic_sempred(ArithmeticContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u00c0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3"+
		"\2\5\2\27\n\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\5\3\'\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\5\48\n\4\3\4\3\4\3\4\7\4=\n\4\f\4\16\4@\13\4\3\4\5\4C\n\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\6\5O\n\5\r\5\16\5P\3\6\3\6\7\6U\n"+
		"\6\f\6\16\6X\13\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\7\bc\n\b\f\b\16"+
		"\bf\13\b\3\t\3\t\5\tj\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tr\n\t\f\t\16\tu\13"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t}\n\t\3\t\7\t\u0080\n\t\f\t\16\t\u0083\13"+
		"\t\3\t\3\t\5\t\u0087\n\t\3\t\3\t\3\t\3\t\3\t\7\t\u008e\n\t\f\t\16\t\u0091"+
		"\13\t\3\t\5\t\u0094\n\t\3\t\5\t\u0097\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\7\n\u00a4\n\n\f\n\16\n\u00a7\13\n\3\n\5\n\u00aa\n\n\3"+
		"\n\5\n\u00ad\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00bb"+
		"\n\n\f\n\16\n\u00be\13\n\3\n\2\3\22\13\2\4\6\b\n\f\16\20\22\2\5\3\2\5"+
		"\b\3\2\24\27\3\2\r\16\2\u00d2\2\26\3\2\2\2\4#\3\2\2\2\6\63\3\2\2\2\bN"+
		"\3\2\2\2\nV\3\2\2\2\f]\3\2\2\2\16d\3\2\2\2\20\u0096\3\2\2\2\22\u00ac\3"+
		"\2\2\2\24\25\7\13\2\2\25\27\5\b\5\2\26\24\3\2\2\2\26\27\3\2\2\2\27\33"+
		"\3\2\2\2\30\32\5\4\3\2\31\30\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34"+
		"\3\2\2\2\34\36\3\2\2\2\35\33\3\2\2\2\36\37\7\t\2\2\37 \5\16\b\2 !\7\n"+
		"\2\2!\"\7\3\2\2\"\3\3\2\2\2#&\5\6\4\2$%\7\13\2\2%\'\5\b\5\2&$\3\2\2\2"+
		"&\'\3\2\2\2\'(\3\2\2\2()\7\t\2\2)*\5\16\b\2*+\7\33\2\2+,\7\17\2\2,-\7"+
		"\30\2\2-.\5\22\n\2./\7\20\2\2/\60\7\n\2\2\60\61\7\20\2\2\61\62\6\3\2\3"+
		"\62\5\3\2\2\2\63\64\7\4\2\2\64\65\7\33\2\2\65>\7\22\2\2\668\7\13\2\2\67"+
		"\66\3\2\2\2\678\3\2\2\289\3\2\2\29:\5\n\6\2:;\7\20\2\2;=\3\2\2\2<\67\3"+
		"\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?B\3\2\2\2@>\3\2\2\2AC\7\13\2\2BA"+
		"\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\5\n\6\2EF\7\23\2\2FG\7\17\2\2GH\5\f\7\2"+
		"HI\7\20\2\2IJ\b\4\1\2J\7\3\2\2\2KL\5\n\6\2LM\7\20\2\2MO\3\2\2\2NK\3\2"+
		"\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\t\3\2\2\2RS\7\33\2\2SU\7\21\2\2TR"+
		"\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\7\33\2\2"+
		"Z[\7\17\2\2[\\\5\f\7\2\\\13\3\2\2\2]^\t\2\2\2^\r\3\2\2\2_`\5\20\t\2`a"+
		"\7\20\2\2ac\3\2\2\2b_\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e\17\3\2\2"+
		"\2fd\3\2\2\2gi\7\33\2\2hj\t\3\2\2ih\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7\30"+
		"\2\2l\u0097\5\22\n\2mn\7\f\2\2ns\7\22\2\2op\7\33\2\2pr\7\21\2\2qo\3\2"+
		"\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7\33\2\2w\u0097"+
		"\7\23\2\2xy\t\4\2\2y\u0081\7\22\2\2z}\5\22\n\2{}\7\31\2\2|z\3\2\2\2|{"+
		"\3\2\2\2}~\3\2\2\2~\u0080\7\21\2\2\177|\3\2\2\2\u0080\u0083\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0086\3\2\2\2\u0083\u0081\3\2\2"+
		"\2\u0084\u0087\5\22\n\2\u0085\u0087\7\31\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0097\7\23\2\2\u0089\u008a\7"+
		"\33\2\2\u008a\u0093\7\22\2\2\u008b\u008c\7\33\2\2\u008c\u008e\7\21\2\2"+
		"\u008d\u008b\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0094\7\33\2\2"+
		"\u0093\u008f\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097"+
		"\7\23\2\2\u0096g\3\2\2\2\u0096m\3\2\2\2\u0096x\3\2\2\2\u0096\u0089\3\2"+
		"\2\2\u0097\21\3\2\2\2\u0098\u0099\b\n\1\2\u0099\u009a\7\22\2\2\u009a\u009b"+
		"\5\22\n\2\u009b\u009c\7\23\2\2\u009c\u00ad\3\2\2\2\u009d\u00ad\7\33\2"+
		"\2\u009e\u00ad\7\32\2\2\u009f\u00a0\7\33\2\2\u00a0\u00a9\7\22\2\2\u00a1"+
		"\u00a2\7\33\2\2\u00a2\u00a4\7\21\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7\3"+
		"\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a8\u00aa\7\33\2\2\u00a9\u00a5\3\2\2\2\u00a9\u00aa\3"+
		"\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\7\23\2\2\u00ac\u0098\3\2\2\2\u00ac"+
		"\u009d\3\2\2\2\u00ac\u009e\3\2\2\2\u00ac\u009f\3\2\2\2\u00ad\u00bc\3\2"+
		"\2\2\u00ae\u00af\f\n\2\2\u00af\u00b0\7\24\2\2\u00b0\u00bb\5\22\n\13\u00b1"+
		"\u00b2\f\t\2\2\u00b2\u00b3\7\27\2\2\u00b3\u00bb\5\22\n\n\u00b4\u00b5\f"+
		"\b\2\2\u00b5\u00b6\7\25\2\2\u00b6\u00bb\5\22\n\t\u00b7\u00b8\f\7\2\2\u00b8"+
		"\u00b9\7\26\2\2\u00b9\u00bb\5\22\n\b\u00ba\u00ae\3\2\2\2\u00ba\u00b1\3"+
		"\2\2\2\u00ba\u00b4\3\2\2\2\u00ba\u00b7\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\23\3\2\2\2\u00be\u00bc\3\2\2"+
		"\2\30\26\33&\67>BPVdis|\u0081\u0086\u008f\u0093\u0096\u00a5\u00a9\u00ac"+
		"\u00ba\u00bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}