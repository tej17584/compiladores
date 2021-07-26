// Generated from decafV1.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link decafV1Parser}.
 */
public interface decafV1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link decafV1Parser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(decafV1Parser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV1Parser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(decafV1Parser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV1Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(decafV1Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV1Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(decafV1Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV1Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(decafV1Parser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV1Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(decafV1Parser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV1Parser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(decafV1Parser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV1Parser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(decafV1Parser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV1Parser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(decafV1Parser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV1Parser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(decafV1Parser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV1Parser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVarType(decafV1Parser.VarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV1Parser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVarType(decafV1Parser.VarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV1Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(decafV1Parser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV1Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(decafV1Parser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV1Parser#methodType}.
	 * @param ctx the parse tree
	 */
	void enterMethodType(decafV1Parser.MethodTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV1Parser#methodType}.
	 * @param ctx the parse tree
	 */
	void exitMethodType(decafV1Parser.MethodTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV1Parser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(decafV1Parser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV1Parser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(decafV1Parser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV1Parser#parameterType}.
	 * @param ctx the parse tree
	 */
	void enterParameterType(decafV1Parser.ParameterTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV1Parser#parameterType}.
	 * @param ctx the parse tree
	 */
	void exitParameterType(decafV1Parser.ParameterTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV1Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(decafV1Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV1Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(decafV1Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(decafV1Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(decafV1Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV1Parser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(decafV1Parser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV1Parser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(decafV1Parser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV1Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(decafV1Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV1Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(decafV1Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV1Parser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(decafV1Parser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV1Parser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(decafV1Parser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV1Parser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(decafV1Parser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV1Parser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(decafV1Parser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV1Parser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(decafV1Parser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV1Parser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(decafV1Parser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV1Parser#arith_op}.
	 * @param ctx the parse tree
	 */
	void enterArith_op(decafV1Parser.Arith_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV1Parser#arith_op}.
	 * @param ctx the parse tree
	 */
	void exitArith_op(decafV1Parser.Arith_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV1Parser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(decafV1Parser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV1Parser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(decafV1Parser.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV1Parser#eq_op}.
	 * @param ctx the parse tree
	 */
	void enterEq_op(decafV1Parser.Eq_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV1Parser#eq_op}.
	 * @param ctx the parse tree
	 */
	void exitEq_op(decafV1Parser.Eq_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV1Parser#cond_op}.
	 * @param ctx the parse tree
	 */
	void enterCond_op(decafV1Parser.Cond_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV1Parser#cond_op}.
	 * @param ctx the parse tree
	 */
	void exitCond_op(decafV1Parser.Cond_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV1Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(decafV1Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV1Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(decafV1Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV1Parser#int_literal}.
	 * @param ctx the parse tree
	 */
	void enterInt_literal(decafV1Parser.Int_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV1Parser#int_literal}.
	 * @param ctx the parse tree
	 */
	void exitInt_literal(decafV1Parser.Int_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV1Parser#char_literal}.
	 * @param ctx the parse tree
	 */
	void enterChar_literal(decafV1Parser.Char_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV1Parser#char_literal}.
	 * @param ctx the parse tree
	 */
	void exitChar_literal(decafV1Parser.Char_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafV1Parser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal(decafV1Parser.Bool_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafV1Parser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal(decafV1Parser.Bool_literalContext ctx);
}