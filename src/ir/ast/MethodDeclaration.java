package ir.ast;

import java.util.LinkedList;

public class MethodDeclaration {
	
	private Type type;
	private String id;
	private LinkedList<FieldDeclaration> field_declartion_list;
	private Body body;
	
	public MethodDeclaration(Type type, String id, LinkedList<FieldDeclaration> field_declartion_list, Body body) {
		super();
		this.type = type;
		this.id = id;
		this.field_declartion_list = field_declartion_list;
		this.body = body;
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
	public LinkedList<FieldDeclaration> getField_declartion_list() {
		return field_declartion_list;
	}
	public void setField_declartion_list(LinkedList<FieldDeclaration> field_declartion_list) {
		this.field_declartion_list = field_declartion_list;
	}
	public Body getBody() {
		return body;
	}
	public void setBody(Body body) {
		this.body = body;
	}
	
}
