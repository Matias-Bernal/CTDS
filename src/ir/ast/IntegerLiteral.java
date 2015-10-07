package ir.ast;

import ir.ASTVisitor;

public class IntegerLiteral extends Literal {
	
	private Integer value;
	
	public IntegerLiteral(Integer value) {
		super();
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	@Override
	public Type getType() {
		return Type.INT;
	}

	@Override
	public String toString() {
		return value.toString();
	}

	@Override
	public <T> T accept(ASTVisitor<T> v) {
		return v.visit(this);
	}
}
