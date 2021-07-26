// Generated from decafV3.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link decafV3Parser}.
 */
public interface decafV3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link decafV3Parser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(decafV3Parser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV3Parser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(decafV3Parser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV3Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(decafV3Parser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV3Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(decafV3Parser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV3Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(decafV3Parser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV3Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(decafV3Parser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV3Parser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(decafV3Parser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV3Parser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(decafV3Parser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV3Parser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(decafV3Parser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV3Parser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(decafV3Parser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV3Parser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVarType(decafV3Parser.VarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV3Parser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVarType(decafV3Parser.VarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV3Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(decafV3Parser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV3Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(decafV3Parser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV3Parser#methodType}.
	 * @param ctx the parse tree
	 */
	void enterMethodType(decafV3Parser.MethodTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV3Parser#methodType}.
	 * @param ctx the parse tree
	 */
	void exitMethodType(decafV3Parser.MethodTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV3Parser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(decafV3Parser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV3Parser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(decafV3Parser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV3Parser#parameterType}.
	 * @param ctx the parse tree
	 */
	void enterParameterType(decafV3Parser.ParameterTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV3Parser#parameterType}.
	 * @param ctx the parse tree
	 */
	void exitParameterType(decafV3Parser.ParameterTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV3Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(decafV3Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV3Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(decafV3Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(decafV3Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(decafV3Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV3Parser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(decafV3Parser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV3Parser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(decafV3Parser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(decafV3Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(decafV3Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV3Parser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(decafV3Parser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV3Parser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(decafV3Parser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV3Parser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(decafV3Parser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV3Parser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(decafV3Parser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV3Parser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(decafV3Parser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV3Parser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(decafV3Parser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV3Parser#arith_op}.
	 * @param ctx the parse tree
	 */
	void enterArith_op(decafV3Parser.Arith_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV3Parser#arith_op}.
	 * @param ctx the parse tree
	 */
	void exitArith_op(decafV3Parser.Arith_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV3Parser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(decafV3Parser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV3Parser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(decafV3Parser.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV3Parser#eq_op}.
	 * @param ctx the parse tree
	 */
	void enterEq_op(decafV3Parser.Eq_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV3Parser#eq_op}.
	 * @param ctx the parse tree
	 */
	void exitEq_op(decafV3Parser.Eq_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV3Parser#cond_op}.
	 * @param ctx the parse tree
	 */
	void enterCond_op(decafV3Parser.Cond_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV3Parser#cond_op}.
	 * @param ctx the parse tree
	 */
	void exitCond_op(decafV3Parser.Cond_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV3Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(decafV3Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV3Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(decafV3Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV3Parser#int_literal}.
	 * @param ctx the parse tree
	 */
	void enterInt_literal(decafV3Parser.Int_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV3Parser#int_literal}.
	 * @param ctx the parse tree
	 */
	void exitInt_literal(decafV3Parser.Int_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV3Parser#char_literal}.
	 * @param ctx the parse tree
	 */
	void enterChar_literal(decafV3Parser.Char_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV3Parser#char_literal}.
	 * @param ctx the parse tree
	 */
	void exitChar_literal(decafV3Parser.Char_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV3Parser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal(decafV3Parser.Bool_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV3Parser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal(decafV3Parser.Bool_literalContext ctx);
}