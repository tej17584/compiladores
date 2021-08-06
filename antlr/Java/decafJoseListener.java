// Generated from decafJose.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link decafJoseParser}.
 */
public interface decafJoseListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link decafJoseParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(decafJoseParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJoseParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(decafJoseParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJoseParser#id_tok}.
	 * @param ctx the parse tree
	 */
	void enterId_tok(decafJoseParser.Id_tokContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJoseParser#id_tok}.
	 * @param ctx the parse tree
	 */
	void exitId_tok(decafJoseParser.Id_tokContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJoseParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(decafJoseParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJoseParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(decafJoseParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJoseParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(decafJoseParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJoseParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(decafJoseParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJoseParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(decafJoseParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJoseParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(decafJoseParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJoseParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVarType(decafJoseParser.VarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJoseParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVarType(decafJoseParser.VarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJoseParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(decafJoseParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJoseParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(decafJoseParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJoseParser#methodType}.
	 * @param ctx the parse tree
	 */
	void enterMethodType(decafJoseParser.MethodTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJoseParser#methodType}.
	 * @param ctx the parse tree
	 */
	void exitMethodType(decafJoseParser.MethodTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJoseParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(decafJoseParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJoseParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(decafJoseParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJoseParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void enterParameterType(decafJoseParser.ParameterTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJoseParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void exitParameterType(decafJoseParser.ParameterTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJoseParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(decafJoseParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJoseParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(decafJoseParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJoseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(decafJoseParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJoseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(decafJoseParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJoseParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(decafJoseParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJoseParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(decafJoseParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJoseParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(decafJoseParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJoseParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(decafJoseParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJoseParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(decafJoseParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJoseParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(decafJoseParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJoseParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(decafJoseParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJoseParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(decafJoseParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJoseParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(decafJoseParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJoseParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(decafJoseParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJoseParser#arith_op}.
	 * @param ctx the parse tree
	 */
	void enterArith_op(decafJoseParser.Arith_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJoseParser#arith_op}.
	 * @param ctx the parse tree
	 */
	void exitArith_op(decafJoseParser.Arith_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJoseParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(decafJoseParser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJoseParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(decafJoseParser.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJoseParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void enterEq_op(decafJoseParser.Eq_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJoseParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void exitEq_op(decafJoseParser.Eq_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJoseParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void enterCond_op(decafJoseParser.Cond_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJoseParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void exitCond_op(decafJoseParser.Cond_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJoseParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(decafJoseParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJoseParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(decafJoseParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJoseParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void enterInt_literal(decafJoseParser.Int_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJoseParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void exitInt_literal(decafJoseParser.Int_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJoseParser#char_literal}.
	 * @param ctx the parse tree
	 */
	void enterChar_literal(decafJoseParser.Char_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJoseParser#char_literal}.
	 * @param ctx the parse tree
	 */
	void exitChar_literal(decafJoseParser.Char_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJoseParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal(decafJoseParser.Bool_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJoseParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal(decafJoseParser.Bool_literalContext ctx);
}