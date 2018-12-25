// Generated from C:/Users/User/Desktop/MT/automatic-parser/src\Grammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#gram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGram(GrammarParser.GramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#parserRules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParserRules(GrammarParser.ParserRulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(GrammarParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#ret}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRet(GrammarParser.RetContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpand(GrammarParser.ExpandContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#ruleNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleNode(GrammarParser.RuleNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#simpleRuleNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleRuleNode(GrammarParser.SimpleRuleNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#lexerRules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexerRules(GrammarParser.LexerRulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#lexerRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexerRule(GrammarParser.LexerRuleContext ctx);
}