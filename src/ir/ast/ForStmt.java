package ir.ast;

import ir.ASTVisitor;

public class ForStmt extends Statement{
    
	private String id;
	private Expression assignExpr;
	private Expression stopCondition;
	private Statement block;
	
	public ForStmt(String id, Expression assignExpr, Expression stopCondition, Statement block) {
		super();
		this.id = id;
		this.assignExpr = assignExpr;
		this.stopCondition = stopCondition;
		this.block = block;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public Expression getAssignExpr() {
		return assignExpr;
	}

	public void setAssignExpr(Expression assignExpr) {
		this.assignExpr = assignExpr;
	}
	
	public Expression getStopCondition() {
		return stopCondition;
	}

	public void setStopCondition(Expression stopCondition) {
		this.stopCondition = stopCondition;
	}

	public Statement getBlock() {
		return block;
	}
	
	public void setBlock(Statement block) {
		this.block = block;
	}

	@Override
	public String toString() {
		return "for " + id + "=" + assignExpr + ", " + stopCondition + '\n' + block.toString();
	}

	@Override
	public <T> T accept(ASTVisitor<T> v) {
		return v.visit(this);
	}
}