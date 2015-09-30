package ir.ast;

import java.util.LinkedList;

import ir.ASTVisitor;

public class MethodCallStmt extends Statement {

	private String id;
	private LinkedList<Expression> expression_list;
	private LinkedList<MethodDeclaration> method_declaration_list;
	
	public MethodCallStmt(String id, LinkedList<Expression> expression_list,
			LinkedList<MethodDeclaration> method_declaration_list) {
		super();
		this.id = id;
		this.expression_list = expression_list;
		this.method_declaration_list = method_declaration_list;
	}
	
	public MethodCallStmt(String id, LinkedList<Expression> expression_list) {
		super();
		this.id = id;
		this.expression_list = expression_list;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LinkedList<Expression> getExpression_list() {
		return expression_list;
	}

	public void setExpression_list(LinkedList<Expression> expression_list) {
		this.expression_list = expression_list;
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
