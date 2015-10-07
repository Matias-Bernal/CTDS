package ir.ast;

import ir.ASTVisitor;

public class MethodCallExpression extends Expression {

	private MethodCallStmt method_call_statement;
	

	public MethodCallExpression(MethodCallStmt method_call_statement) {
		super();
		this.method_call_statement = method_call_statement;
	}

	public MethodCallStmt getMethod_call_statement() {
		return method_call_statement;
	}

	public void setMethod_call_statement(MethodCallStmt method_call_statement) {
		this.method_call_statement = method_call_statement;
	}

	@Override
	public <T> T accept(ASTVisitor<T> v) {
		return v.visit(this);
	}

}
