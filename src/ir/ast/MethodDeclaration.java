package ir.ast;

import java.util.LinkedList;

import ir.ASTVisitor;

public class MethodDeclaration extends AST {
	
	private Type type;
	private Identifier id;
	private LinkedList<FieldDeclaration> field_declartion_list;
	private Body body;
	
	public MethodDeclaration(Type type, Identifier id, LinkedList<FieldDeclaration> field_declartion_list, Body body) {
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
	public Identifier getId() {
		return id;
	}
	public void setId(Identifier id) {
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
	
	@Override
	public <T> T accept(ASTVisitor<T> v) {
		return v.visit(this);
	}

}
