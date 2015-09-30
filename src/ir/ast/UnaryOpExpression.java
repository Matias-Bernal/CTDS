package ir.ast;

import ir.ASTVisitor;

public class UnaryOpExpression extends Expression {
	
	private UnaryOpType operator;
	private Expression expression;
	
	public UnaryOpExpression(UnaryOpType op, Expression e){
		operator = op;
		expression = e;
	}
		
	public UnaryOpType getOperator() {
		return operator;
	}

	public void setOperator(UnaryOpType operator) {
		this.operator = operator;
	}

	public Expression getExpression() {
		return expression;
	}

	public void setExpression(Expression expression) {
		this.expression = expression;
	}

	@Override
	public String toString() {
		return operator + " " + expression;
	}

	@Override
	public <T> T accept(ASTVisitor<T> v) {
		return v.visit(this);
	}

}