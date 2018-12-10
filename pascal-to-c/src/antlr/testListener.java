// Generated from test.g4 by ANTLR 4.7.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link testParser}.
 */
public interface testListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link testParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(testParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(testParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(testParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(testParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(testParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(testParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(testParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(testParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterCommands(testParser.CommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitCommands(testParser.CommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(testParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(testParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic(testParser.ArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic(testParser.ArithmeticContext ctx);
}