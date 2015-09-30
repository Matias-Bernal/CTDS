package ir.ast;

import java.util.LinkedList;

public class ClassDeclaration {
	
	private String id;
	private LinkedList<FieldDeclaration> field_declartion_list;
	private LinkedList<MethodDeclaration> method_declaration_list;
	
	public ClassDeclaration(String i,LinkedList<FieldDeclaration> fdl, LinkedList<MethodDeclaration> mdl){
		id = i;
		field_declartion_list = fdl;
		method_declaration_list = mdl;
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

	public LinkedList<MethodDeclaration> getMethod_declaration_list() {
		return method_declaration_list;
	}

	public void setMethod_declaration_list(LinkedList<MethodDeclaration> method_declaration_list) {
		this.method_declaration_list = method_declaration_list;
	}

}
