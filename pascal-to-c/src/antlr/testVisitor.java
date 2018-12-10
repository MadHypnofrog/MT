// Generated from test.g4 by ANTLR 4.7.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link testParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface testVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link testParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(testParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(testParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(testParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(testParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommands(testParser.CommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(testParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic(testParser.ArithmeticContext ctx);
}