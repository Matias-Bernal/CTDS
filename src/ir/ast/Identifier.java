package ir.ast;

import ir.ASTVisitor;

public class Identifier extends AST {
	
	private String id;
	
	public Identifier(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public <T> T accept(ASTVisitor<T> v) {
		return v.visit(this);
	}

	
}
