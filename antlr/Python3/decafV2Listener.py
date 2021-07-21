# Generated from decafV2.g4 by ANTLR 4.9.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .decafV2Parser import decafV2Parser
else:
    from decafV2Parser import decafV2Parser

# This class defines a complete listener for a parse tree produced by decafV2Parser.
class decafV2Listener(ParseTreeListener):

    # Enter a parse tree produced by decafV2Parser#program.
    def enterProgram(self, ctx:decafV2Parser.ProgramContext):
        pass

    # Exit a parse tree produced by decafV2Parser#program.
    def exitProgram(self, ctx:decafV2Parser.ProgramContext):
        pass


    # Enter a parse tree produced by decafV2Parser#declaration.
    def enterDeclaration(self, ctx:decafV2Parser.DeclarationContext):
        pass

    # Exit a parse tree produced by decafV2Parser#declaration.
    def exitDeclaration(self, ctx:decafV2Parser.DeclarationContext):
        pass


    # Enter a parse tree produced by decafV2Parser#varDeclaration.
    def enterVarDeclaration(self, ctx:decafV2Parser.VarDeclarationContext):
        pass

    # Exit a parse tree produced by decafV2Parser#varDeclaration.
    def exitVarDeclaration(self, ctx:decafV2Parser.VarDeclarationContext):
        pass


    # Enter a parse tree produced by decafV2Parser#structDeclaration.
    def enterStructDeclaration(self, ctx:decafV2Parser.StructDeclarationContext):
        pass

    # Exit a parse tree produced by decafV2Parser#structDeclaration.
    def exitStructDeclaration(self, ctx:decafV2Parser.StructDeclarationContext):
        pass


    # Enter a parse tree produced by decafV2Parser#varType.
    def enterVarType(self, ctx:decafV2Parser.VarTypeContext):
        pass

    # Exit a parse tree produced by decafV2Parser#varType.
    def exitVarType(self, ctx:decafV2Parser.VarTypeContext):
        pass


    # Enter a parse tree produced by decafV2Parser#methodDeclaration.
    def enterMethodDeclaration(self, ctx:decafV2Parser.MethodDeclarationContext):
        pass

    # Exit a parse tree produced by decafV2Parser#methodDeclaration.
    def exitMethodDeclaration(self, ctx:decafV2Parser.MethodDeclarationContext):
        pass


    # Enter a parse tree produced by decafV2Parser#methodType.
    def enterMethodType(self, ctx:decafV2Parser.MethodTypeContext):
        pass

    # Exit a parse tree produced by decafV2Parser#methodType.
    def exitMethodType(self, ctx:decafV2Parser.MethodTypeContext):
        pass


    # Enter a parse tree produced by decafV2Parser#parameter.
    def enterParameter(self, ctx:decafV2Parser.ParameterContext):
        pass

    # Exit a parse tree produced by decafV2Parser#parameter.
    def exitParameter(self, ctx:decafV2Parser.ParameterContext):
        pass


    # Enter a parse tree produced by decafV2Parser#parameterType.
    def enterParameterType(self, ctx:decafV2Parser.ParameterTypeContext):
        pass

    # Exit a parse tree produced by decafV2Parser#parameterType.
    def exitParameterType(self, ctx:decafV2Parser.ParameterTypeContext):
        pass


    # Enter a parse tree produced by decafV2Parser#block.
    def enterBlock(self, ctx:decafV2Parser.BlockContext):
        pass

    # Exit a parse tree produced by decafV2Parser#block.
    def exitBlock(self, ctx:decafV2Parser.BlockContext):
        pass


    # Enter a parse tree produced by decafV2Parser#statement.
    def enterStatement(self, ctx:decafV2Parser.StatementContext):
        pass

    # Exit a parse tree produced by decafV2Parser#statement.
    def exitStatement(self, ctx:decafV2Parser.StatementContext):
        pass


    # Enter a parse tree produced by decafV2Parser#location.
    def enterLocation(self, ctx:decafV2Parser.LocationContext):
        pass

    # Exit a parse tree produced by decafV2Parser#location.
    def exitLocation(self, ctx:decafV2Parser.LocationContext):
        pass


    # Enter a parse tree produced by decafV2Parser#expression.
    def enterExpression(self, ctx:decafV2Parser.ExpressionContext):
        pass

    # Exit a parse tree produced by decafV2Parser#expression.
    def exitExpression(self, ctx:decafV2Parser.ExpressionContext):
        pass


    # Enter a parse tree produced by decafV2Parser#methodCall.
    def enterMethodCall(self, ctx:decafV2Parser.MethodCallContext):
        pass

    # Exit a parse tree produced by decafV2Parser#methodCall.
    def exitMethodCall(self, ctx:decafV2Parser.MethodCallContext):
        pass


    # Enter a parse tree produced by decafV2Parser#arg.
    def enterArg(self, ctx:decafV2Parser.ArgContext):
        pass

    # Exit a parse tree produced by decafV2Parser#arg.
    def exitArg(self, ctx:decafV2Parser.ArgContext):
        pass


    # Enter a parse tree produced by decafV2Parser#op.
    def enterOp(self, ctx:decafV2Parser.OpContext):
        pass

    # Exit a parse tree produced by decafV2Parser#op.
    def exitOp(self, ctx:decafV2Parser.OpContext):
        pass


    # Enter a parse tree produced by decafV2Parser#arith_op.
    def enterArith_op(self, ctx:decafV2Parser.Arith_opContext):
        pass

    # Exit a parse tree produced by decafV2Parser#arith_op.
    def exitArith_op(self, ctx:decafV2Parser.Arith_opContext):
        pass


    # Enter a parse tree produced by decafV2Parser#rel_op.
    def enterRel_op(self, ctx:decafV2Parser.Rel_opContext):
        pass

    # Exit a parse tree produced by decafV2Parser#rel_op.
    def exitRel_op(self, ctx:decafV2Parser.Rel_opContext):
        pass


    # Enter a parse tree produced by decafV2Parser#eq_op.
    def enterEq_op(self, ctx:decafV2Parser.Eq_opContext):
        pass

    # Exit a parse tree produced by decafV2Parser#eq_op.
    def exitEq_op(self, ctx:decafV2Parser.Eq_opContext):
        pass


    # Enter a parse tree produced by decafV2Parser#cond_op.
    def enterCond_op(self, ctx:decafV2Parser.Cond_opContext):
        pass

    # Exit a parse tree produced by decafV2Parser#cond_op.
    def exitCond_op(self, ctx:decafV2Parser.Cond_opContext):
        pass


    # Enter a parse tree produced by decafV2Parser#literal.
    def enterLiteral(self, ctx:decafV2Parser.LiteralContext):
        pass

    # Exit a parse tree produced by decafV2Parser#literal.
    def exitLiteral(self, ctx:decafV2Parser.LiteralContext):
        pass


    # Enter a parse tree produced by decafV2Parser#int_literal.
    def enterInt_literal(self, ctx:decafV2Parser.Int_literalContext):
        pass

    # Exit a parse tree produced by decafV2Parser#int_literal.
    def exitInt_literal(self, ctx:decafV2Parser.Int_literalContext):
        pass


    # Enter a parse tree produced by decafV2Parser#char_literal.
    def enterChar_literal(self, ctx:decafV2Parser.Char_literalContext):
        pass

    # Exit a parse tree produced by decafV2Parser#char_literal.
    def exitChar_literal(self, ctx:decafV2Parser.Char_literalContext):
        pass


    # Enter a parse tree produced by decafV2Parser#bool_literal.
    def enterBool_literal(self, ctx:decafV2Parser.Bool_literalContext):
        pass

    # Exit a parse tree produced by decafV2Parser#bool_literal.
    def exitBool_literal(self, ctx:decafV2Parser.Bool_literalContext):
        pass



del decafV2Parser