package ir.ast;

import java.util.LinkedList;

import ir.ASTVisitor;

public class VarLocation extends Location {
	
	private Identifier blockId;
	private LinkedList<Identifier> identifier_list;

	public VarLocation(String id) {
		this.id = id;
	}
	
	public VarLocation(Identifier blockId, LinkedList<Identifier> identifier_list) {
		super();
		this.blockId = blockId;
		this.identifier_list = identifier_list;
	}

	public Identifier getBlockId() {
		return blockId;
	}

	public void setBlockId(Identifier blockId) {
		this.blockId = blockId;
	}
	
	@Override
	public String toString() {
		return id;
	}

	@Override
	public <T> T accept(ASTVisitor<T> v) {
		return v.visit(this);
	}

	public LinkedList<Identifier> getIdentifier_list() {
		return identifier_list;
	}

	public void setIdentifier_list(LinkedList<Identifier> identifier_list) {
		this.identifier_list = identifier_list;
	}
}
