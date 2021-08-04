# Generated from decafV1.g4 by ANTLR 4.9.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .decafV1Parser import decafV1Parser
else:
    from decafV1Parser import decafV1Parser

# This class defines a complete listener for a parse tree produced by decafV1Parser.
class decafV1Listener(ParseTreeListener):

    # Enter a parse tree produced by decafV1Parser#program.
    def enterProgram(self, ctx:decafV1Parser.ProgramContext):
        pass

    # Exit a parse tree produced by decafV1Parser#program.
    def exitProgram(self, ctx:decafV1Parser.ProgramContext):
        pass


    # Enter a parse tree produced by decafV1Parser#declaration.
    def enterDeclaration(self, ctx:decafV1Parser.DeclarationContext):
        pass

    # Exit a parse tree produced by decafV1Parser#declaration.
    def exitDeclaration(self, ctx:decafV1Parser.DeclarationContext):
        pass


    # Enter a parse tree produced by decafV1Parser#varDeclaration.
    def enterVarDeclaration(self, ctx:decafV1Parser.VarDeclarationContext):
        pass

    # Exit a parse tree produced by decafV1Parser#varDeclaration.
    def exitVarDeclaration(self, ctx:decafV1Parser.VarDeclarationContext):
        pass


    # Enter a parse tree produced by decafV1Parser#structDeclaration.
    def enterStructDeclaration(self, ctx:decafV1Parser.StructDeclarationContext):
        pass

    # Exit a parse tree produced by decafV1Parser#structDeclaration.
    def exitStructDeclaration(self, ctx:decafV1Parser.StructDeclarationContext):
        pass


    # Enter a parse tree produced by decafV1Parser#varType.
    def enterVarType(self, ctx:decafV1Parser.VarTypeContext):
        pass

    # Exit a parse tree produced by decafV1Parser#varType.
    def exitVarType(self, ctx:decafV1Parser.VarTypeContext):
        pass


    # Enter a parse tree produced by decafV1Parser#methodDeclaration.
    def enterMethodDeclaration(self, ctx:decafV1Parser.MethodDeclarationContext):
        pass

    # Exit a parse tree produced by decafV1Parser#methodDeclaration.
    def exitMethodDeclaration(self, ctx:decafV1Parser.MethodDeclarationContext):
        pass


    # Enter a parse tree produced by decafV1Parser#methodType.
    def enterMethodType(self, ctx:decafV1Parser.MethodTypeContext):
        pass

    # Exit a parse tree produced by decafV1Parser#methodType.
    def exitMethodType(self, ctx:decafV1Parser.MethodTypeContext):
        pass


    # Enter a parse tree produced by decafV1Parser#parameter.
    def enterParameter(self, ctx:decafV1Parser.ParameterContext):
        pass

    # Exit a parse tree produced by decafV1Parser#parameter.
    def exitParameter(self, ctx:decafV1Parser.ParameterContext):
        pass


    # Enter a parse tree produced by decafV1Parser#parameterType.
    def enterParameterType(self, ctx:decafV1Parser.ParameterTypeContext):
        pass

    # Exit a parse tree produced by decafV1Parser#parameterType.
    def exitParameterType(self, ctx:decafV1Parser.ParameterTypeContext):
        pass


    # Enter a parse tree produced by decafV1Parser#block.
    def enterBlock(self, ctx:decafV1Parser.BlockContext):
        pass

    # Exit a parse tree produced by decafV1Parser#block.
    def exitBlock(self, ctx:decafV1Parser.BlockContext):
        pass


    # Enter a parse tree produced by decafV1Parser#statement.
    def enterStatement(self, ctx:decafV1Parser.StatementContext):
        pass

    # Exit a parse tree produced by decafV1Parser#statement.
    def exitStatement(self, ctx:decafV1Parser.StatementContext):
        pass


    # Enter a parse tree produced by decafV1Parser#location.
    def enterLocation(self, ctx:decafV1Parser.LocationContext):
        pass

    # Exit a parse tree produced by decafV1Parser#location.
    def exitLocation(self, ctx:decafV1Parser.LocationContext):
        pass


    # Enter a parse tree produced by decafV1Parser#expression.
    def enterExpression(self, ctx:decafV1Parser.ExpressionContext):
        pass

    # Exit a parse tree produced by decafV1Parser#expression.
    def exitExpression(self, ctx:decafV1Parser.ExpressionContext):
        pass


    # Enter a parse tree produced by decafV1Parser#methodCall.
    def enterMethodCall(self, ctx:decafV1Parser.MethodCallContext):
        pass

    # Exit a parse tree produced by decafV1Parser#methodCall.
    def exitMethodCall(self, ctx:decafV1Parser.MethodCallContext):
        pass


    # Enter a parse tree produced by decafV1Parser#arg.
    def enterArg(self, ctx:decafV1Parser.ArgContext):
        pass

    # Exit a parse tree produced by decafV1Parser#arg.
    def exitArg(self, ctx:decafV1Parser.ArgContext):
        pass


    # Enter a parse tree produced by decafV1Parser#op.
    def enterOp(self, ctx:decafV1Parser.OpContext):
        pass

    # Exit a parse tree produced by decafV1Parser#op.
    def exitOp(self, ctx:decafV1Parser.OpContext):
        pass


    # Enter a parse tree produced by decafV1Parser#arith_op.
    def enterArith_op(self, ctx:decafV1Parser.Arith_opContext):
        pass

    # Exit a parse tree produced by decafV1Parser#arith_op.
    def exitArith_op(self, ctx:decafV1Parser.Arith_opContext):
        pass


    # Enter a parse tree produced by decafV1Parser#rel_op.
    def enterRel_op(self, ctx:decafV1Parser.Rel_opContext):
        pass

    # Exit a parse tree produced by decafV1Parser#rel_op.
    def exitRel_op(self, ctx:decafV1Parser.Rel_opContext):
        pass


    # Enter a parse tree produced by decafV1Parser#eq_op.
    def enterEq_op(self, ctx:decafV1Parser.Eq_opContext):
        pass

    # Exit a parse tree produced by decafV1Parser#eq_op.
    def exitEq_op(self, ctx:decafV1Parser.Eq_opContext):
        pass


    # Enter a parse tree produced by decafV1Parser#cond_op.
    def enterCond_op(self, ctx:decafV1Parser.Cond_opContext):
        pass

    # Exit a parse tree produced by decafV1Parser#cond_op.
    def exitCond_op(self, ctx:decafV1Parser.Cond_opContext):
        pass


    # Enter a parse tree produced by decafV1Parser#literal.
    def enterLiteral(self, ctx:decafV1Parser.LiteralContext):
        pass

    # Exit a parse tree produced by decafV1Parser#literal.
    def exitLiteral(self, ctx:decafV1Parser.LiteralContext):
        pass


    # Enter a parse tree produced by decafV1Parser#int_literal.
    def enterInt_literal(self, ctx:decafV1Parser.Int_literalContext):
        pass

    # Exit a parse tree produced by decafV1Parser#int_literal.
    def exitInt_literal(self, ctx:decafV1Parser.Int_literalContext):
        pass


    # Enter a parse tree produced by decafV1Parser#char_literal.
    def enterChar_literal(self, ctx:decafV1Parser.Char_literalContext):
        pass

    # Exit a parse tree produced by decafV1Parser#char_literal.
    def exitChar_literal(self, ctx:decafV1Parser.Char_literalContext):
        pass


    # Enter a parse tree produced by decafV1Parser#bool_literal.
    def enterBool_literal(self, ctx:decafV1Parser.Bool_literalContext):
        pass

    # Exit a parse tree produced by decafV1Parser#bool_literal.
    def exitBool_literal(self, ctx:decafV1Parser.Bool_literalContext):
        pass



del decafV1Parser