package ir.ast;

import ir.ASTVisitor;
public class BooleanLiteral extends Literal {

    private boolean value;

    public BooleanLiteral(boolean value) {
		super();
		this.value = value;
	}
    
	public boolean isValue() {
		return value;
	}

	public void setValue(boolean value) {
		this.value = value;
	}

	@Override
    public String toString() {
    	return String.valueOf(value);
    }
    
    @Override
	public <T> T accept(ASTVisitor<T> v) {
		return v.visit(this);
	}

    @Override
    public Type getType() {
        return Type.BOOLEAN;
    }

}