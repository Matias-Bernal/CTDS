package ir.ast;

import ir.ASTVisitor;

public class WhileStmt extends Statement {
	
    private Expression continuationCondition;
	private Block block;
	
	public WhileStmt(Expression continuationCondition, Block block) {
		this.continuationCondition = continuationCondition;
		this.block = block;
	}
	
	public Expression getContinuationCondition() {
		return continuationCondition;
	}

	public void setContinuationCondition(Expression continuationCondition) {
		this.continuationCondition = continuationCondition;
	}

	public Block getBlock() {
		return block;
	}

	public void setBlock(Block block) {
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
