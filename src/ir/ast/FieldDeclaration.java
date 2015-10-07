package ir.ast;

import java.util.LinkedList;

import ir.ASTVisitor;

public class FieldDeclaration extends AST{
	
	private Type type;
	private Identifier id;
	private Integer lenght;
	private LinkedList<Identifier> identifier_list;
	
	public FieldDeclaration(Type t,Identifier i,LinkedList<Identifier> il){
		type = t;
		id = i;
		identifier_list = il;
	}
	
	public FieldDeclaration(Type t,Integer l,Identifier i,LinkedList<Identifier> il){
		switch(t) {
		case INT:
			type = Type.INTARRAY;
			break;
		case FLOAT:
			type = Type.FLOATARRAY;
			break;
		case BOOLEAN:
			type = Type.BOOLEANARRAY;
			break;
		default:
			type = null;
			break;
		}
		lenght = l;
		id = i;
		identifier_list = il;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Identifier getId() {
		return id;
	}

	public void setId(Identifier id) {
		this.id = id;
	}

	public Integer getLenght() {
		return lenght;
	}

	public void setLenght(Integer lenght) {
		this.lenght = lenght;
	}

	public LinkedList<Identifier> getIdentifier_list() {
		return identifier_list;
	}

	public void setIdentifier_list(LinkedList<Identifier> identifier_list) {
		this.identifier_list = identifier_list;
	}
	
	@Override
	public <T> T accept(ASTVisitor<T> v) {
		return v.visit(this);
	}

}
