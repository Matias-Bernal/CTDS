package ir.ast;

import java.util.LinkedList;

public class FieldDeclaration {
	
	private Type type;
	private String id;
	private Integer lenght;
	private LinkedList<Identifier> identifier_list;
	
	public FieldDeclaration(Type t,String i,LinkedList<Identifier> il){
		type = t;
		id = i;
		identifier_list = il;
	}
	
	public FieldDeclaration(Type t,Integer l,String i,LinkedList<Identifier> il){
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

}
