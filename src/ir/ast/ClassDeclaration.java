package ir.ast;

import java.util.LinkedList;

import ir.ASTVisitor;

public class ClassDeclaration extends AST{
	
	private Identifier id;
	private LinkedList<FieldDeclaration> field_declartion_list;
	private LinkedList<MethodDeclaration> method_declaration_list;
	
	public ClassDeclaration(Identifier i,LinkedList<FieldDeclaration> fdl, LinkedList<MethodDeclaration> mdl){
		id = i;
		field_declartion_list = fdl;
		method_declaration_list = mdl;
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

	public LinkedList<MethodDeclaration> getMethod_declaration_list() {
		return method_declaration_list;
	}

	public void setMethod_declaration_list(LinkedList<MethodDeclaration> method_declaration_list) {
		this.method_declaration_list = method_declaration_list;
	}

	@Override
	public <T> T accept(ASTVisitor<T> v) {
		return v.visit(this);
	}

}
