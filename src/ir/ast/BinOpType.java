package ir.ast;

public enum BinOpType {
	SUMA, // Arithmetic
	RESTA,
	MULTIPLICACION,
	DIVISION,
	PORCENTAJE,
	MENOR, // Relational
	MENOR_IGUAL,
	MAYOR,
	MAYOR_IGUAL,
	DESIGUAL, // Equal
	IGUAL, 
	CONJUNCION, // Conditional
	DISYUNCION;
	
	@Override
	public String toString() {
		switch(this) {
			case SUMA:
				return "+";
			case RESTA:
				return "-";
			case MULTIPLICACION:
				return "*";
			case DIVISION:
				return "/";
			case PORCENTAJE:
				return "%";
			case MENOR:
				return "<";
			case MENOR_IGUAL:
				return "<=";
			case MAYOR:
				return ">";
			case MAYOR_IGUAL:
				return ">=";
			case IGUAL:
				return "==";
			case DESIGUAL:
				return "!=";
			case CONJUNCION:
				return "&&";
			case DISYUNCION:
				return "||";
		}
		
		return null;
	}
}
