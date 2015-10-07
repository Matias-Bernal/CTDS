package ir.ast;

import java.util.LinkedList;

import ir.ASTVisitor;

public class ArrayLocation extends Location {
	
	private Identifier blockId;
	private Expression expression;
	private LinkedList<Identifier> identifier_list;
	
	public ArrayLocation(String id, Expression expression) {
		this.id = id;
		this.expression = expression;
	}
	
	public ArrayLocation(Identifier blockId, Expression expression, LinkedList<Identifier> identifier_list) {
		super();
		this.blockId = blockId;
		this.expression = expression;
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

	public Expression getExpression() {
		return expression;
	}

	public void setExpression(Expression expression) {
		this.expression = expression;
	}

	public LinkedList<Identifier> getIdentifier_list() {
		return identifier_list;
	}

	public void setIdentifier_list(LinkedList<Identifier> identifier_list) {
		this.identifier_list = identifier_list;
	}
}