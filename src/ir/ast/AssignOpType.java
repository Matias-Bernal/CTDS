package ir.ast;

public enum AssignOpType {
	ASIGNACION_SUMA,
	ASIGNACION_RESTA,
	ASIGNACION;
	
	@Override
	public String toString() {
		switch(this) {
			case ASIGNACION_SUMA:
				return "+=";
			case ASIGNACION_RESTA:
				return "-=";
			case ASIGNACION:
				return "=";
		}
		
		return null;		
	}
}
