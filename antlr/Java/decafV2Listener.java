// Generated from decafV2.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link decafV2Parser}.
 */
public interface decafV2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link decafV2Parser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(decafV2Parser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV2Parser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(decafV2Parser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV2Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(decafV2Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV2Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(decafV2Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV2Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(decafV2Parser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV2Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(decafV2Parser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV2Parser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(decafV2Parser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV2Parser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(decafV2Parser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV2Parser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(decafV2Parser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV2Parser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(decafV2Parser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV2Parser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVarType(decafV2Parser.VarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV2Parser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVarType(decafV2Parser.VarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV2Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(decafV2Parser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV2Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(decafV2Parser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV2Parser#methodType}.
	 * @param ctx the parse tree
	 */
	void enterMethodType(decafV2Parser.MethodTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV2Parser#methodType}.
	 * @param ctx the parse tree
	 */
	void exitMethodType(decafV2Parser.MethodTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV2Parser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(decafV2Parser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV2Parser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(decafV2Parser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV2Parser#parameterType}.
	 * @param ctx the parse tree
	 */
	void enterParameterType(decafV2Parser.ParameterTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV2Parser#parameterType}.
	 * @param ctx the parse tree
	 */
	void exitParameterType(decafV2Parser.ParameterTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV2Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(decafV2Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV2Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(decafV2Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(decafV2Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(decafV2Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV2Parser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(decafV2Parser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV2Parser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(decafV2Parser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(decafV2Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(decafV2Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV2Parser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(decafV2Parser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV2Parser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(decafV2Parser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV2Parser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(decafV2Parser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV2Parser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(decafV2Parser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV2Parser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(decafV2Parser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV2Parser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(decafV2Parser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV2Parser#arith_op}.
	 * @param ctx the parse tree
	 */
	void enterArith_op(decafV2Parser.Arith_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV2Parser#arith_op}.
	 * @param ctx the parse tree
	 */
	void exitArith_op(decafV2Parser.Arith_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV2Parser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(decafV2Parser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV2Parser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(decafV2Parser.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV2Parser#eq_op}.
	 * @param ctx the parse tree
	 */
	void enterEq_op(decafV2Parser.Eq_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV2Parser#eq_op}.
	 * @param ctx the parse tree
	 */
	void exitEq_op(decafV2Parser.Eq_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV2Parser#cond_op}.
	 * @param ctx the parse tree
	 */
	void enterCond_op(decafV2Parser.Cond_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV2Parser#cond_op}.
	 * @param ctx the parse tree
	 */
	void exitCond_op(decafV2Parser.Cond_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV2Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(decafV2Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV2Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(decafV2Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV2Parser#int_literal}.
	 * @param ctx the parse tree
	 */
	void enterInt_literal(decafV2Parser.Int_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV2Parser#int_literal}.
	 * @param ctx the parse tree
	 */
	void exitInt_literal(decafV2Parser.Int_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV2Parser#char_literal}.
	 * @param ctx the parse tree
	 */
	void enterChar_literal(decafV2Parser.Char_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV2Parser#char_literal}.
	 * @param ctx the parse tree
	 */
	void exitChar_literal(decafV2Parser.Char_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV2Parser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal(decafV2Parser.Bool_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV2Parser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal(decafV2Parser.Bool_literalContext ctx);
}