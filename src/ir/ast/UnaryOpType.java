package ir.ast;

public enum UnaryOpType {
	RESTA,
	NEGACION;
	
	@Override
	public String toString() {
		switch(this) {
			case RESTA:
				return "-";
			case NEGACION:
				return "!";
		}
		
		return null;
	}
}
