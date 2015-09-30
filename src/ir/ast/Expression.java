package ir.ast;

public abstract class Expression extends AST {
	protected Expression expr;
	protected Type type;
	
	public Type getType() {
		return type;
	}
	
	public void setType(Type t) {
		type = t;
	}
}
