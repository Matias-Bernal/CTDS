package ir.ast;

public enum Type {
	INT,
	INTARRAY,
	FLOAT,
	FLOATARRAY,
	BOOLEAN,
	BOOLEANARRAY,
	VOID, /* Lo agrego aca o en el .cup */
	UNDEFINED;	/* No esta en la especificacion del lenguaje lo agrego?? */
	
	@Override
	public String toString() {
		switch(this) {
			case INT:
				return "int";
			case FLOAT:
				return "float";
			case BOOLEAN:
				return "boolean";
			case VOID:
				return "void";
			case UNDEFINED:
				return "undefined";
			case INTARRAY:
				return "int[]";
			case FLOATARRAY:
				return "float[]";
			case BOOLEANARRAY:
				return "boolean[]";

		}
		
		return null;
	}
	
	public boolean isArray() {
		return (this == Type.INTARRAY || this == Type.FLOATARRAY || this == Type.BOOLEANARRAY );
	}
}
