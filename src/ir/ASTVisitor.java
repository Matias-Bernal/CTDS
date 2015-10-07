package ir;

import ir.ast.*;

// Abstract visitor
public interface ASTVisitor<T> {
// visit statements
	T visit(AssignStmt stmt);
	T visit(ReturnStmt stmt);
	T visit(IfStmt stmt);
// visit expressions
	T visit(BinOpExpression expr);;
// visit locations	
	T visit(VarLocation loc);
	T visit(Block block);
	T visit(UnaryOpExpression unaryOpExpression);
	T visit(ForStmt forStmt);
	T visit(WhileStmt whileStmt);
	T visit(BreakStmt breakStmt);
	T visit(ContinueStmt continueStmt);
	T visit(PuntoYComaStmt puntoYComaStmt);
	T visit(MethodCallStmt methodCallStmt);
	T visit(ArrayLocation arrayLocation);
	T visit(Program program);
	T visit(ClassDeclaration classDeclaration);
	T visit(FieldDeclaration fieldDeclaration);
	T visit(Identifier identifier);
	T visit(MethodDeclaration methodDeclaration);
	T visit(Body body);
	T visit(BooleanLiteral booleanLiteral);
	T visit(IntegerLiteral integerLiteral);
	T visit(FloatLiteral floatLiteral);
	T visit(MethodCallExpression methodCallExpression);
}