package cup.example;

import java.util.LinkedList;

import ir.ast.AST;

public class TablaSimbolos {
	
	private LinkedList<AST> tabla = new LinkedList<AST>();

	public TablaSimbolos() {
		super();
	}
	
	public TablaSimbolos(LinkedList<AST> tabla) {
		super();
		this.tabla = tabla;
	}

	public LinkedList<AST> getTabla() {
		return tabla;
	}

	public void setTabla(LinkedList<AST> tabla) {
		this.tabla = tabla;
	}
	
	public void agregarSimbolo(AST simbolo){
		
	}
}
