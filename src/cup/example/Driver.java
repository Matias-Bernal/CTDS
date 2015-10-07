package cup.example;

import ir.ast.Program;
import ir.semcheck.TypeCheckVisitor;
import java_cup.runtime.*;

class Driver {

	public static void main(String[] args) throws Exception {
		Parser parser = new Parser();
		Program p = (Program) parser.parse().value;
		
		//Aca pongo todos los visitors
		
		TypeCheckVisitor t = new TypeCheckVisitor();
		t.visit(p);
	}
	
}