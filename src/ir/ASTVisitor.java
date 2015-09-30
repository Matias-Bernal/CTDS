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
	
// visit literals	
	T visit(IntLiteral lit);

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
}
