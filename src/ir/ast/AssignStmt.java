package ir.ast;

import ir.ASTVisitor;

public class AssignStmt extends Statement {
	private Location location;
	private Expression expression;
	private AssignOpType operator;

	public AssignStmt(Location l, AssignOpType o, Expression e) {
		location = l;
		operator = o;
		expression = e;
	}
	
	public void setLocation(Location l) {
		location = l;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public void setExpression(Expression e) {
		expression = e;
	}
	
	public Expression getExpression() {
		return expression;
	}
	
	public AssignOpType getOperator() {
		return operator;
	}

	public void setOperator(AssignOpType o) {
		operator = o;
	}
	
	@Override
	public String toString() {
		return location + " " + operator + " " + expression;
	}

	@Override
	public <T> T accept(ASTVisitor<T> v) {
		return v.visit(this);
	}
}
