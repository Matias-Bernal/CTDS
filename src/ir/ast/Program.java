package ir.ast;

import java.util.LinkedList;
import ir.ASTVisitor;

public class Program extends AST{
	
	private LinkedList<ClassDeclaration> lista_declaracion_clases;

	public Program(LinkedList<ClassDeclaration> ldc){
		lista_declaracion_clases = ldc;
	}

	public LinkedList<ClassDeclaration> getLista_declaracion_clases() {
		return lista_declaracion_clases;
	}

	public void setLista_declaracion_clases(LinkedList<ClassDeclaration> lista_declaracion_clases) {
		this.lista_declaracion_clases = lista_declaracion_clases;
	}

	@Override
	public <T> T accept(ASTVisitor<T> v) {
		return v.visit(this);
	}

}