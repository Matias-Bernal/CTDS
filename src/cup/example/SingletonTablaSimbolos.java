package cup.example;

public class SingletonTablaSimbolos {
	
	protected Singleton singleton;	
	protected static TablaSimbolos tablaSimbolos;

	public SingletonTablaSimbolos() {
		singleton = Singleton.getInstance();
		tablaSimbolos = new TablaSimbolos();
	}

	public static TablaSimbolos getTablaSimbolos() {
		return tablaSimbolos;
	}

	public static void setTablaSimbolos(TablaSimbolos ts) {
		SingletonTablaSimbolos.tablaSimbolos = ts;
	}
	
}
