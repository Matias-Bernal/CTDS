package ir.ast;

import ir.ASTVisitor;

public class BinOpExpression extends Expression {
	private BinOpType operator; //operator in the expr = expr operator expr
	private Expression lOperand; //left expression
	private Expression rOperand; //right expression
	
	public BinOpExpression(Expression left_operand, BinOpType operator, Expression right_operand){
		this.operator = operator;
		lOperand = left_operand;
		rOperand = right_operand;
	}
	
//	public BinOpExpr(Expression e, TempExpression t) {
//		lOperand = e;
//		operator = t.getOperator();
//		rOperand = t.getRightOperand();
//	}
	
	public BinOpType getOperator() {
		return operator;
	}

	public void setOperator(BinOpType operator) {
		this.operator = operator;
	}

	public Expression getlOperand() {
		return lOperand;
	}

	public void setlOperand(Expression lOperand) {
		this.lOperand = lOperand;
	}

	public Expression getrOperand() {
		return rOperand;
	}

	public void setrOperand(Expression rOperand) {
		this.rOperand = rOperand;
	}
	
	@Override
	public String toString() {
		return lOperand + " " + operator + " " + rOperand;
	}

	@Override
	public <T> T accept(ASTVisitor<T> v) {
		return v.visit(this);
	}
}
