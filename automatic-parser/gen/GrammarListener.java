// Generated from C:/Users/User/Desktop/MT/automatic-parser/src\Grammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#gram}.
	 * @param ctx the parse tree
	 */
	void enterGram(GrammarParser.GramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#gram}.
	 * @param ctx the parse tree
	 */
	void exitGram(GrammarParser.GramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#parserRules}.
	 * @param ctx the parse tree
	 */
	void enterParserRules(GrammarParser.ParserRulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#parserRules}.
	 * @param ctx the parse tree
	 */
	void exitParserRules(GrammarParser.ParserRulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(GrammarParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(GrammarParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ret}.
	 * @param ctx the parse tree
	 */
	void enterRet(GrammarParser.RetContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ret}.
	 * @param ctx the parse tree
	 */
	void exitRet(GrammarParser.RetContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expand}.
	 * @param ctx the parse tree
	 */
	void enterExpand(GrammarParser.ExpandContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expand}.
	 * @param ctx the parse tree
	 */
	void exitExpand(GrammarParser.ExpandContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ruleNode}.
	 * @param ctx the parse tree
	 */
	void enterRuleNode(GrammarParser.RuleNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ruleNode}.
	 * @param ctx the parse tree
	 */
	void exitRuleNode(GrammarParser.RuleNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#simpleRuleNode}.
	 * @param ctx the parse tree
	 */
	void enterSimpleRuleNode(GrammarParser.SimpleRuleNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#simpleRuleNode}.
	 * @param ctx the parse tree
	 */
	void exitSimpleRuleNode(GrammarParser.SimpleRuleNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#lexerRules}.
	 * @param ctx the parse tree
	 */
	void enterLexerRules(GrammarParser.LexerRulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#lexerRules}.
	 * @param ctx the parse tree
	 */
	void exitLexerRules(GrammarParser.LexerRulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#lexerRule}.
	 * @param ctx the parse tree
	 */
	void enterLexerRule(GrammarParser.LexerRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#lexerRule}.
	 * @param ctx the parse tree
	 */
	void exitLexerRule(GrammarParser.LexerRuleContext ctx);
}