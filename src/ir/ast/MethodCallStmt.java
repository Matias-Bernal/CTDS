package ir.ast;

import java.util.LinkedList;

import ir.ASTVisitor;

public class MethodCallStmt extends Statement {

	private String id;
	private LinkedList<Expression> expression_list;
	private LinkedList<Identifier> identifier_list;
	
	public MethodCallStmt(String id, LinkedList<Expression> expression_list,
			LinkedList<Identifier> identifier_list) {
		super();
		this.id = id;
		this.expression_list = expression_list;
		this.identifier_list = identifier_list;
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
