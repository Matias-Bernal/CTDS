package ir.ast;

public class Body {
	
	private boolean extern;
	private String reference;
	private Block block;
	
	public Body(Block block) {
		super();
		this.block = block;
	}
	public Body(boolean extern, String reference) {
		super();
		this.extern = extern;
		this.reference = reference;
	}
	
	public boolean isExtern() {
		return extern;
	}
	public void setExtern(boolean extern) {
		this.extern = extern;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public Block getBlock() {
		return block;
	}
	public void setBlock(Block block) {
		this.block = block;
	}

}
