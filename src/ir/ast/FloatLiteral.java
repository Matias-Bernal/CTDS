package ir.ast;

import ir.ASTVisitor;

public class FloatLiteral extends Literal{

	private Float value;
	
	public FloatLiteral(Float value) {
		super();
		this.value = value;
	}

	public Float getValue() {
		return value;
	}

	public void setValue(Float value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value.toString();
	}
   
    @Override
    public Type getType() {
        return Type.FLOAT;
    }

    @Override
    public <T> T accept(ASTVisitor<T> v) {
        return v.visit(this);
    }
    
}
