// Generated from C:/Users/User/Desktop/MT/automatic-parser/src\Grammar.g4 by ANTLR 4.7.2
import antlr.Argument;
import antlr.CodeBlock;
import antlr.Grammar;
import antlr.LexerRule;
import antlr.NonTerminal;
import antlr.ParserRule;
import antlr.RegexRule;
import antlr.RuleNode;
import antlr.SimpleRule;
import antlr.Terminal;
import antlr.WhitespaceRule;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, GRAMMAR=12, TERMINAL=13, NONTERMINAL=14, CODEBLOCK=15, 
		WS=16, RANDOMSTRING=17;
	public static final int
		RULE_gram = 0, RULE_parserRules = 1, RULE_arguments = 2, RULE_ret = 3, 
		RULE_expand = 4, RULE_ruleNode = 5, RULE_simpleRuleNode = 6, RULE_lexerRules = 7, 
		RULE_lexerRule = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"gram", "parserRules", "arguments", "ret", "expand", "ruleNode", "simpleRuleNode", 
			"lexerRules", "lexerRule"
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

	@Override
	public String getGrammarFileName() { return "antlr/Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class GramContext extends ParserRuleContext {
		public Grammar g;
		public Token name;
		public ParserRulesContext parserRules;
		public LexerRulesContext lexerRules;
		public TerminalNode GRAMMAR() { return getToken(GrammarParser.GRAMMAR, 0); }
		public ParserRulesContext parserRules() {
			return getRuleContext(ParserRulesContext.class,0);
		}
		public LexerRulesContext lexerRules() {
			return getRuleContext(LexerRulesContext.class,0);
		}
		public TerminalNode TERMINAL() { return getToken(GrammarParser.TERMINAL, 0); }
		public TerminalNode NONTERMINAL() { return getToken(GrammarParser.NONTERMINAL, 0); }
		public GramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterGram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitGram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitGram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GramContext gram() throws RecognitionException {
		GramContext _localctx = new GramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_gram);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(GRAMMAR);
			setState(19);
			((GramContext)_localctx).name = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==TERMINAL || _la==NONTERMINAL) ) {
				((GramContext)_localctx).name = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(20);
			match(T__0);
			setState(21);
			((GramContext)_localctx).parserRules = parserRules();
			setState(22);
			((GramContext)_localctx).lexerRules = lexerRules();
			((GramContext)_localctx).g =  new Grammar((((GramContext)_localctx).name!=null?((GramContext)_localctx).name.getText():null), ((GramContext)_localctx).parserRules.rulesList, ((GramContext)_localctx).lexerRules.rulesList, ((GramContext)_localctx).parserRules.start); 
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

	public static class ParserRulesContext extends ParserRuleContext {
		public List<ParserRule> rulesList;
		public String start;
		public Token NONTERMINAL;
		public ArgumentsContext arguments;
		public RetContext ret;
		public ExpandContext expand;
		public List<TerminalNode> NONTERMINAL() { return getTokens(GrammarParser.NONTERMINAL); }
		public TerminalNode NONTERMINAL(int i) {
			return getToken(GrammarParser.NONTERMINAL, i);
		}
		public List<ArgumentsContext> arguments() {
			return getRuleContexts(ArgumentsContext.class);
		}
		public ArgumentsContext arguments(int i) {
			return getRuleContext(ArgumentsContext.class,i);
		}
		public List<RetContext> ret() {
			return getRuleContexts(RetContext.class);
		}
		public RetContext ret(int i) {
			return getRuleContext(RetContext.class,i);
		}
		public List<ExpandContext> expand() {
			return getRuleContexts(ExpandContext.class);
		}
		public ExpandContext expand(int i) {
			return getRuleContext(ExpandContext.class,i);
		}
		public ParserRulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserRules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterParserRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitParserRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitParserRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParserRulesContext parserRules() throws RecognitionException {
		ParserRulesContext _localctx = new ParserRulesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_parserRules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ParserRulesContext)_localctx).rulesList =  new ArrayList<>();
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==NONTERMINAL) {
				{
				{
				boolean b = false;
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(27);
					match(T__1);
					b = true;
					}
				}

				setState(31);
				((ParserRulesContext)_localctx).NONTERMINAL = match(NONTERMINAL);
				setState(32);
				((ParserRulesContext)_localctx).arguments = arguments();
				setState(33);
				((ParserRulesContext)_localctx).ret = ret();
				setState(34);
				match(T__2);
				setState(35);
				((ParserRulesContext)_localctx).expand = expand();
				setState(36);
				match(T__0);
				_localctx.rulesList.add(new ParserRule((((ParserRulesContext)_localctx).NONTERMINAL!=null?((ParserRulesContext)_localctx).NONTERMINAL.getText():null), ((ParserRulesContext)_localctx).arguments.args, ((ParserRulesContext)_localctx).ret.rets, ((ParserRulesContext)_localctx).expand.expandList));
				         if (b) ((ParserRulesContext)_localctx).start =  (((ParserRulesContext)_localctx).NONTERMINAL!=null?((ParserRulesContext)_localctx).NONTERMINAL.getText():null);
				}
				}
				setState(43);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public List<Argument> args;
		public Token typeName;
		public Token variableName;
		public Token typeName1;
		public Token variableName1;
		public List<TerminalNode> TERMINAL() { return getTokens(GrammarParser.TERMINAL); }
		public TerminalNode TERMINAL(int i) {
			return getToken(GrammarParser.TERMINAL, i);
		}
		public List<TerminalNode> NONTERMINAL() { return getTokens(GrammarParser.NONTERMINAL); }
		public TerminalNode NONTERMINAL(int i) {
			return getToken(GrammarParser.NONTERMINAL, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_arguments);
		int _la;
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				((ArgumentsContext)_localctx).args =  new ArrayList<>();
				setState(45);
				match(T__3);
				setState(46);
				((ArgumentsContext)_localctx).typeName = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==TERMINAL || _la==NONTERMINAL) ) {
					((ArgumentsContext)_localctx).typeName = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(47);
				((ArgumentsContext)_localctx).variableName = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==TERMINAL || _la==NONTERMINAL) ) {
					((ArgumentsContext)_localctx).variableName = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				_localctx.args.add(new Argument((((ArgumentsContext)_localctx).typeName!=null?((ArgumentsContext)_localctx).typeName.getText():null), (((ArgumentsContext)_localctx).variableName!=null?((ArgumentsContext)_localctx).variableName.getText():null)));
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(49);
					match(T__4);
					setState(50);
					((ArgumentsContext)_localctx).typeName1 = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==TERMINAL || _la==NONTERMINAL) ) {
						((ArgumentsContext)_localctx).typeName1 = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(51);
					((ArgumentsContext)_localctx).variableName1 = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==TERMINAL || _la==NONTERMINAL) ) {
						((ArgumentsContext)_localctx).variableName1 = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					_localctx.args.add(new Argument((((ArgumentsContext)_localctx).typeName1!=null?((ArgumentsContext)_localctx).typeName1.getText():null), (((ArgumentsContext)_localctx).variableName1!=null?((ArgumentsContext)_localctx).variableName1.getText():null)));
					}
					}
					setState(57);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(58);
				match(T__5);
				}
				break;
			case T__2:
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				((ArgumentsContext)_localctx).args =  new ArrayList<>();
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

	public static class RetContext extends ParserRuleContext {
		public List<Argument> rets;
		public Token typeName;
		public Token variableName;
		public Token typeName1;
		public Token variableName1;
		public List<TerminalNode> TERMINAL() { return getTokens(GrammarParser.TERMINAL); }
		public TerminalNode TERMINAL(int i) {
			return getToken(GrammarParser.TERMINAL, i);
		}
		public List<TerminalNode> NONTERMINAL() { return getTokens(GrammarParser.NONTERMINAL); }
		public TerminalNode NONTERMINAL(int i) {
			return getToken(GrammarParser.NONTERMINAL, i);
		}
		public RetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitRet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetContext ret() throws RecognitionException {
		RetContext _localctx = new RetContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ret);
		int _la;
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				((RetContext)_localctx).rets =  new ArrayList<>();
				setState(63);
				match(T__6);
				setState(64);
				((RetContext)_localctx).typeName = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==TERMINAL || _la==NONTERMINAL) ) {
					((RetContext)_localctx).typeName = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(65);
				((RetContext)_localctx).variableName = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==TERMINAL || _la==NONTERMINAL) ) {
					((RetContext)_localctx).variableName = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				_localctx.rets.add(new Argument((((RetContext)_localctx).typeName!=null?((RetContext)_localctx).typeName.getText():null), (((RetContext)_localctx).variableName!=null?((RetContext)_localctx).variableName.getText():null)));
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(67);
					match(T__4);
					setState(68);
					((RetContext)_localctx).typeName1 = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==TERMINAL || _la==NONTERMINAL) ) {
						((RetContext)_localctx).typeName1 = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(69);
					((RetContext)_localctx).variableName1 = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==TERMINAL || _la==NONTERMINAL) ) {
						((RetContext)_localctx).variableName1 = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					_localctx.rets.add(new Argument((((RetContext)_localctx).typeName1!=null?((RetContext)_localctx).typeName1.getText():null), (((RetContext)_localctx).variableName1!=null?((RetContext)_localctx).variableName1.getText():null)));
					}
					}
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(76);
				match(T__7);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				((RetContext)_localctx).rets =  new ArrayList<>();
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

	public static class ExpandContext extends ParserRuleContext {
		public List<List<antlr.RuleNode>> expandList;
		public RuleNodeContext ruleNode;
		public List<RuleNodeContext> ruleNode() {
			return getRuleContexts(RuleNodeContext.class);
		}
		public RuleNodeContext ruleNode(int i) {
			return getRuleContext(RuleNodeContext.class,i);
		}
		public ExpandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpandContext expand() throws RecognitionException {
		ExpandContext _localctx = new ExpandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpandContext)_localctx).expandList =  new ArrayList<>();
			setState(81);
			((ExpandContext)_localctx).ruleNode = ruleNode();
			_localctx.expandList.add(((ExpandContext)_localctx).ruleNode.list);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(83);
				match(T__8);
				setState(84);
				((ExpandContext)_localctx).ruleNode = ruleNode();
				_localctx.expandList.add(((ExpandContext)_localctx).ruleNode.list);
				}
				}
				setState(91);
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

	public static class RuleNodeContext extends ParserRuleContext {
		public List<antlr.RuleNode> list;
		public SimpleRuleNodeContext simpleRuleNode;
		public RuleNodeContext ruleNode;
		public SimpleRuleNodeContext simpleRuleNode() {
			return getRuleContext(SimpleRuleNodeContext.class,0);
		}
		public RuleNodeContext ruleNode() {
			return getRuleContext(RuleNodeContext.class,0);
		}
		public RuleNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRuleNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRuleNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitRuleNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleNodeContext ruleNode() throws RecognitionException {
		RuleNodeContext _localctx = new RuleNodeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ruleNode);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TERMINAL:
			case NONTERMINAL:
			case CODEBLOCK:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				((RuleNodeContext)_localctx).simpleRuleNode = simpleRuleNode();
				setState(93);
				((RuleNodeContext)_localctx).ruleNode = ruleNode();
				((RuleNodeContext)_localctx).list =  new ArrayList<>(); _localctx.list.add(((RuleNodeContext)_localctx).simpleRuleNode.node); _localctx.list.addAll(((RuleNodeContext)_localctx).ruleNode.list);
				}
				break;
			case T__0:
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				((RuleNodeContext)_localctx).list =  new ArrayList<>();
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

	public static class SimpleRuleNodeContext extends ParserRuleContext {
		public RuleNode node;
		public Token CODEBLOCK;
		public Token name;
		public Token TERMINAL;
		public Token NONTERMINAL;
		public TerminalNode CODEBLOCK() { return getToken(GrammarParser.CODEBLOCK, 0); }
		public List<TerminalNode> TERMINAL() { return getTokens(GrammarParser.TERMINAL); }
		public TerminalNode TERMINAL(int i) {
			return getToken(GrammarParser.TERMINAL, i);
		}
		public List<TerminalNode> NONTERMINAL() { return getTokens(GrammarParser.NONTERMINAL); }
		public TerminalNode NONTERMINAL(int i) {
			return getToken(GrammarParser.NONTERMINAL, i);
		}
		public SimpleRuleNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleRuleNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSimpleRuleNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSimpleRuleNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSimpleRuleNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleRuleNodeContext simpleRuleNode() throws RecognitionException {
		SimpleRuleNodeContext _localctx = new SimpleRuleNodeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_simpleRuleNode);
		int _la;
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				((SimpleRuleNodeContext)_localctx).CODEBLOCK = match(CODEBLOCK);
				((SimpleRuleNodeContext)_localctx).node =  new CodeBlock((((SimpleRuleNodeContext)_localctx).CODEBLOCK!=null?((SimpleRuleNodeContext)_localctx).CODEBLOCK.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((SimpleRuleNodeContext)_localctx).node =  new Terminal();
				setState(105);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(102);
					((SimpleRuleNodeContext)_localctx).name = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==TERMINAL || _la==NONTERMINAL) ) {
						((SimpleRuleNodeContext)_localctx).name = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(103);
					match(T__9);
					((Terminal)_localctx.node).name = (((SimpleRuleNodeContext)_localctx).name!=null?((SimpleRuleNodeContext)_localctx).name.getText():null);
					}
					break;
				}
				setState(107);
				((SimpleRuleNodeContext)_localctx).TERMINAL = match(TERMINAL);
				((Terminal)_localctx.node).terminalName = (((SimpleRuleNodeContext)_localctx).TERMINAL!=null?((SimpleRuleNodeContext)_localctx).TERMINAL.getText():null);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				((SimpleRuleNodeContext)_localctx).node =  new NonTerminal();
				setState(113);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(110);
					((SimpleRuleNodeContext)_localctx).name = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==TERMINAL || _la==NONTERMINAL) ) {
						((SimpleRuleNodeContext)_localctx).name = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(111);
					match(T__9);
					((NonTerminal)_localctx.node).name = (((SimpleRuleNodeContext)_localctx).name!=null?((SimpleRuleNodeContext)_localctx).name.getText():null);
					}
					break;
				}
				setState(115);
				((SimpleRuleNodeContext)_localctx).NONTERMINAL = match(NONTERMINAL);
				((NonTerminal)_localctx.node).nonTerminalName = (((SimpleRuleNodeContext)_localctx).NONTERMINAL!=null?((SimpleRuleNodeContext)_localctx).NONTERMINAL.getText():null);
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(117);
					match(T__3);
					setState(118);
					((SimpleRuleNodeContext)_localctx).CODEBLOCK = match(CODEBLOCK);
					((NonTerminal)_localctx.node).args = (((SimpleRuleNodeContext)_localctx).CODEBLOCK!=null?((SimpleRuleNodeContext)_localctx).CODEBLOCK.getText():null).substring(1, (((SimpleRuleNodeContext)_localctx).CODEBLOCK!=null?((SimpleRuleNodeContext)_localctx).CODEBLOCK.getText():null).length() - 1);
					setState(120);
					match(T__5);
					}
				}

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

	public static class LexerRulesContext extends ParserRuleContext {
		public List<LexerRule> rulesList;
		public LexerRuleContext lexerRule;
		public List<LexerRuleContext> lexerRule() {
			return getRuleContexts(LexerRuleContext.class);
		}
		public LexerRuleContext lexerRule(int i) {
			return getRuleContext(LexerRuleContext.class,i);
		}
		public LexerRulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerRules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLexerRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLexerRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLexerRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexerRulesContext lexerRules() throws RecognitionException {
		LexerRulesContext _localctx = new LexerRulesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lexerRules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((LexerRulesContext)_localctx).rulesList =  new ArrayList<>();
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10 || _la==TERMINAL) {
				{
				{
				setState(126);
				((LexerRulesContext)_localctx).lexerRule = lexerRule();
				setState(127);
				match(T__0);
				_localctx.rulesList.add(((LexerRulesContext)_localctx).lexerRule.rule);
				}
				}
				setState(134);
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

	public static class LexerRuleContext extends ParserRuleContext {
		public LexerRule rule;
		public Token TERMINAL;
		public Token RANDOMSTRING;
		public TerminalNode TERMINAL() { return getToken(GrammarParser.TERMINAL, 0); }
		public TerminalNode RANDOMSTRING() { return getToken(GrammarParser.RANDOMSTRING, 0); }
		public LexerRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLexerRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLexerRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLexerRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexerRuleContext lexerRule() throws RecognitionException {
		LexerRuleContext _localctx = new LexerRuleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lexerRule);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				((LexerRuleContext)_localctx).TERMINAL = match(TERMINAL);
				setState(136);
				match(T__9);
				setState(137);
				((LexerRuleContext)_localctx).RANDOMSTRING = match(RANDOMSTRING);
				((LexerRuleContext)_localctx).rule =  new SimpleRule((((LexerRuleContext)_localctx).TERMINAL!=null?((LexerRuleContext)_localctx).TERMINAL.getText():null), (((LexerRuleContext)_localctx).RANDOMSTRING!=null?((LexerRuleContext)_localctx).RANDOMSTRING.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				((LexerRuleContext)_localctx).TERMINAL = match(TERMINAL);
				setState(140);
				match(T__2);
				setState(141);
				((LexerRuleContext)_localctx).RANDOMSTRING = match(RANDOMSTRING);
				((LexerRuleContext)_localctx).rule =  new RegexRule((((LexerRuleContext)_localctx).TERMINAL!=null?((LexerRuleContext)_localctx).TERMINAL.getText():null), (((LexerRuleContext)_localctx).RANDOMSTRING!=null?((LexerRuleContext)_localctx).RANDOMSTRING.getText():null));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				match(T__10);
				setState(144);
				((LexerRuleContext)_localctx).RANDOMSTRING = match(RANDOMSTRING);
				((LexerRuleContext)_localctx).rule =  new WhitespaceRule((((LexerRuleContext)_localctx).RANDOMSTRING!=null?((LexerRuleContext)_localctx).RANDOMSTRING.getText():null));
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23\u0097\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3 \n\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\7\3*\n\3\f\3\16\3-\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\7\48\n\4\f\4\16\4;\13\4\3\4\3\4\5\4?\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\7\5J\n\5\f\5\16\5M\13\5\3\5\3\5\5\5Q\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\7\6Z\n\6\f\6\16\6]\13\6\3\7\3\7\3\7\3\7\3\7\5\7d\n\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\bl\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bt\n\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\b|\n\b\5\b~\n\b\3\t\3\t\3\t\3\t\3\t\7\t\u0085\n\t\f\t\16"+
		"\t\u0088\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0095\n"+
		"\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\3\3\2\17\20\2\u009d\2\24\3\2\2\2"+
		"\4\33\3\2\2\2\6>\3\2\2\2\bP\3\2\2\2\nR\3\2\2\2\fc\3\2\2\2\16}\3\2\2\2"+
		"\20\177\3\2\2\2\22\u0094\3\2\2\2\24\25\7\16\2\2\25\26\t\2\2\2\26\27\7"+
		"\3\2\2\27\30\5\4\3\2\30\31\5\20\t\2\31\32\b\2\1\2\32\3\3\2\2\2\33+\b\3"+
		"\1\2\34\37\b\3\1\2\35\36\7\4\2\2\36 \b\3\1\2\37\35\3\2\2\2\37 \3\2\2\2"+
		" !\3\2\2\2!\"\7\20\2\2\"#\5\6\4\2#$\5\b\5\2$%\7\5\2\2%&\5\n\6\2&\'\7\3"+
		"\2\2\'(\b\3\1\2(*\3\2\2\2)\34\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\5"+
		"\3\2\2\2-+\3\2\2\2./\b\4\1\2/\60\7\6\2\2\60\61\t\2\2\2\61\62\t\2\2\2\62"+
		"9\b\4\1\2\63\64\7\7\2\2\64\65\t\2\2\2\65\66\t\2\2\2\668\b\4\1\2\67\63"+
		"\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<?\7\b\2\2"+
		"=?\b\4\1\2>.\3\2\2\2>=\3\2\2\2?\7\3\2\2\2@A\b\5\1\2AB\7\t\2\2BC\t\2\2"+
		"\2CD\t\2\2\2DK\b\5\1\2EF\7\7\2\2FG\t\2\2\2GH\t\2\2\2HJ\b\5\1\2IE\3\2\2"+
		"\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NQ\7\n\2\2OQ\b\5\1"+
		"\2P@\3\2\2\2PO\3\2\2\2Q\t\3\2\2\2RS\b\6\1\2ST\5\f\7\2T[\b\6\1\2UV\7\13"+
		"\2\2VW\5\f\7\2WX\b\6\1\2XZ\3\2\2\2YU\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3"+
		"\2\2\2\\\13\3\2\2\2][\3\2\2\2^_\5\16\b\2_`\5\f\7\2`a\b\7\1\2ad\3\2\2\2"+
		"bd\b\7\1\2c^\3\2\2\2cb\3\2\2\2d\r\3\2\2\2ef\7\21\2\2f~\b\b\1\2gk\b\b\1"+
		"\2hi\t\2\2\2ij\7\f\2\2jl\b\b\1\2kh\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7\17"+
		"\2\2n~\b\b\1\2os\b\b\1\2pq\t\2\2\2qr\7\f\2\2rt\b\b\1\2sp\3\2\2\2st\3\2"+
		"\2\2tu\3\2\2\2uv\7\20\2\2v{\b\b\1\2wx\7\6\2\2xy\7\21\2\2yz\b\b\1\2z|\7"+
		"\b\2\2{w\3\2\2\2{|\3\2\2\2|~\3\2\2\2}e\3\2\2\2}g\3\2\2\2}o\3\2\2\2~\17"+
		"\3\2\2\2\177\u0086\b\t\1\2\u0080\u0081\5\22\n\2\u0081\u0082\7\3\2\2\u0082"+
		"\u0083\b\t\1\2\u0083\u0085\3\2\2\2\u0084\u0080\3\2\2\2\u0085\u0088\3\2"+
		"\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\21\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0089\u008a\7\17\2\2\u008a\u008b\7\f\2\2\u008b\u008c\7\23\2\2"+
		"\u008c\u0095\b\n\1\2\u008d\u008e\7\17\2\2\u008e\u008f\7\5\2\2\u008f\u0090"+
		"\7\23\2\2\u0090\u0095\b\n\1\2\u0091\u0092\7\r\2\2\u0092\u0093\7\23\2\2"+
		"\u0093\u0095\b\n\1\2\u0094\u0089\3\2\2\2\u0094\u008d\3\2\2\2\u0094\u0091"+
		"\3\2\2\2\u0095\23\3\2\2\2\20\37+9>KP[cks{}\u0086\u0094";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}