package ir.ast;

import ir.ASTVisitor;

public class PuntoYComaStmt extends Statement {

	public PuntoYComaStmt() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String toString(){
		return ";\n";
	}

	@Override
	public <T> T accept(ASTVisitor<T> v) {
		return v.visit(this);
	}
	
}
