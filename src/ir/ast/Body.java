package ir.ast;

import ir.ASTVisitor;

public class Body extends AST {
	
	private boolean extern;
	private Block block;
	
	public Body(Block block) {
		super();
		this.block = block;
	}
	public Body(boolean extern) {
		super();
		this.extern = extern;
	}
	
	public boolean isExtern() {
		return extern;
	}
	public void setExtern(boolean extern) {
		this.extern = extern;
	}
	public Block getBlock() {
		return block;
	}
	public void setBlock(Block block) {
		this.block = block;
	}
	
	@Override
	public <T> T accept(ASTVisitor<T> v) {
		return v.visit(this);
	}


}
