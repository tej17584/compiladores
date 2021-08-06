// Generated from decafJavier.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link decafJavierParser}.
 */
public interface decafJavierListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link decafJavierParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(decafJavierParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJavierParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(decafJavierParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJavierParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(decafJavierParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJavierParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(decafJavierParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJavierParser#vardeclr}.
	 * @param ctx the parse tree
	 */
	void enterVardeclr(decafJavierParser.VardeclrContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJavierParser#vardeclr}.
	 * @param ctx the parse tree
	 */
	void exitVardeclr(decafJavierParser.VardeclrContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJavierParser#field_declr}.
	 * @param ctx the parse tree
	 */
	void enterField_declr(decafJavierParser.Field_declrContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJavierParser#field_declr}.
	 * @param ctx the parse tree
	 */
	void exitField_declr(decafJavierParser.Field_declrContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJavierParser#array_id}.
	 * @param ctx the parse tree
	 */
	void enterArray_id(decafJavierParser.Array_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJavierParser#array_id}.
	 * @param ctx the parse tree
	 */
	void exitArray_id(decafJavierParser.Array_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJavierParser#field_var}.
	 * @param ctx the parse tree
	 */
	void enterField_var(decafJavierParser.Field_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJavierParser#field_var}.
	 * @param ctx the parse tree
	 */
	void exitField_var(decafJavierParser.Field_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJavierParser#var_id}.
	 * @param ctx the parse tree
	 */
	void enterVar_id(decafJavierParser.Var_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJavierParser#var_id}.
	 * @param ctx the parse tree
	 */
	void exitVar_id(decafJavierParser.Var_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJavierParser#struct_declr}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declr(decafJavierParser.Struct_declrContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJavierParser#struct_declr}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declr(decafJavierParser.Struct_declrContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJavierParser#method_declr}.
	 * @param ctx the parse tree
	 */
	void enterMethod_declr(decafJavierParser.Method_declrContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJavierParser#method_declr}.
	 * @param ctx the parse tree
	 */
	void exitMethod_declr(decafJavierParser.Method_declrContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJavierParser#return_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_type(decafJavierParser.Return_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJavierParser#return_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_type(decafJavierParser.Return_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJavierParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(decafJavierParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJavierParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(decafJavierParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJavierParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(decafJavierParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJavierParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(decafJavierParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJavierParser#method_call_inter}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call_inter(decafJavierParser.Method_call_interContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJavierParser#method_call_inter}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call_inter(decafJavierParser.Method_call_interContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJavierParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(decafJavierParser.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJavierParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(decafJavierParser.Method_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJavierParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(decafJavierParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJavierParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(decafJavierParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJavierParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(decafJavierParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJavierParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(decafJavierParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJavierParser#callout_arg}.
	 * @param ctx the parse tree
	 */
	void enterCallout_arg(decafJavierParser.Callout_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJavierParser#callout_arg}.
	 * @param ctx the parse tree
	 */
	void exitCallout_arg(decafJavierParser.Callout_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJavierParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void enterInt_literal(decafJavierParser.Int_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJavierParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void exitInt_literal(decafJavierParser.Int_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJavierParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(decafJavierParser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJavierParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(decafJavierParser.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJavierParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void enterEq_op(decafJavierParser.Eq_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJavierParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void exitEq_op(decafJavierParser.Eq_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJavierParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void enterCond_op(decafJavierParser.Cond_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJavierParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void exitCond_op(decafJavierParser.Cond_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJavierParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(decafJavierParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJavierParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(decafJavierParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJavierParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin_op(decafJavierParser.Bin_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJavierParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin_op(decafJavierParser.Bin_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJavierParser#arith_op}.
	 * @param ctx the parse tree
	 */
	void enterArith_op(decafJavierParser.Arith_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJavierParser#arith_op}.
	 * @param ctx the parse tree
	 */
	void exitArith_op(decafJavierParser.Arith_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJavierParser#var_type}.
	 * @param ctx the parse tree
	 */
	void enterVar_type(decafJavierParser.Var_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJavierParser#var_type}.
	 * @param ctx the parse tree
	 */
	void exitVar_type(decafJavierParser.Var_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJavierParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void enterAssign_op(decafJavierParser.Assign_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJavierParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void exitAssign_op(decafJavierParser.Assign_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafJavierParser#method_name}.
	 * @param ctx the parse tree
	 */
	void enterMethod_name(decafJavierParser.Method_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafJavierParser#method_name}.
	 * @param ctx the parse tree
	 */
	void exitMethod_name(decafJavierParser.Method_nameContext ctx);
}