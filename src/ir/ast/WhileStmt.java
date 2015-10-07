package ir.ast;

import ir.ASTVisitor;

public class WhileStmt extends Statement {
	
    private Expression continuationCondition;
	private Statement block;
	
	public WhileStmt(Expression continuationCondition, Statement block) {
		this.continuationCondition = continuationCondition;
		this.block = block;
	}
	
	public Expression getContinuationCondition() {
		return continuationCondition;
	}

	public void setContinuationCondition(Expression continuationCondition) {
		this.continuationCondition = continuationCondition;
	}

	public Statement getBlock() {
		return block;
	}

	public void setBlock(Statement block) {
		this.block = block;
	}

	@Override
	public String toString() {
		return "while " + continuationCondition + '\n' + block.toString();
	}

	//@Override
	public <T> T accept(ASTVisitor<T> v) {
		return v.visit(this);
	}
}
