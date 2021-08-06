// Generated from decafAlejandro.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link decafAlejandroParser}.
 */
public interface decafAlejandroListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link decafAlejandroParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(decafAlejandroParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafAlejandroParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(decafAlejandroParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafAlejandroParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(decafAlejandroParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafAlejandroParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(decafAlejandroParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafAlejandroParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(decafAlejandroParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafAlejandroParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(decafAlejandroParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafAlejandroParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(decafAlejandroParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafAlejandroParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(decafAlejandroParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafAlejandroParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVarType(decafAlejandroParser.VarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafAlejandroParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVarType(decafAlejandroParser.VarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafAlejandroParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(decafAlejandroParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafAlejandroParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(decafAlejandroParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafAlejandroParser#methodType}.
	 * @param ctx the parse tree
	 */
	void enterMethodType(decafAlejandroParser.MethodTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafAlejandroParser#methodType}.
	 * @param ctx the parse tree
	 */
	void exitMethodType(decafAlejandroParser.MethodTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafAlejandroParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(decafAlejandroParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafAlejandroParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(decafAlejandroParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafAlejandroParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void enterParameterType(decafAlejandroParser.ParameterTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafAlejandroParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void exitParameterType(decafAlejandroParser.ParameterTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafAlejandroParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(decafAlejandroParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafAlejandroParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(decafAlejandroParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafAlejandroParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(decafAlejandroParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafAlejandroParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(decafAlejandroParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafAlejandroParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(decafAlejandroParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafAlejandroParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(decafAlejandroParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafAlejandroParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(decafAlejandroParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafAlejandroParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(decafAlejandroParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafAlejandroParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(decafAlejandroParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafAlejandroParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(decafAlejandroParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafAlejandroParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(decafAlejandroParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafAlejandroParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(decafAlejandroParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafAlejandroParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(decafAlejandroParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafAlejandroParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(decafAlejandroParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafAlejandroParser#arith_op}.
	 * @param ctx the parse tree
	 */
	void enterArith_op(decafAlejandroParser.Arith_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafAlejandroParser#arith_op}.
	 * @param ctx the parse tree
	 */
	void exitArith_op(decafAlejandroParser.Arith_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafAlejandroParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(decafAlejandroParser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafAlejandroParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(decafAlejandroParser.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafAlejandroParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void enterEq_op(decafAlejandroParser.Eq_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafAlejandroParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void exitEq_op(decafAlejandroParser.Eq_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafAlejandroParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void enterCond_op(decafAlejandroParser.Cond_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafAlejandroParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void exitCond_op(decafAlejandroParser.Cond_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafAlejandroParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(decafAlejandroParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafAlejandroParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(decafAlejandroParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafAlejandroParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void enterInt_literal(decafAlejandroParser.Int_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafAlejandroParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void exitInt_literal(decafAlejandroParser.Int_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafAlejandroParser#char_literal}.
	 * @param ctx the parse tree
	 */
	void enterChar_literal(decafAlejandroParser.Char_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafAlejandroParser#char_literal}.
	 * @param ctx the parse tree
	 */
	void exitChar_literal(decafAlejandroParser.Char_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafAlejandroParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal(decafAlejandroParser.Bool_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafAlejandroParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal(decafAlejandroParser.Bool_literalContext ctx);
}