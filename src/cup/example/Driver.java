package cup.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import ir.ast.Program;
import ir.semcheck.TypeCheckVisitor;
import java_cup.runtime.*;

class Driver {

	public static void main(String[] args) throws Exception {
		try{
			Parser parser = new Parser();
			parser.file = new File(args[0]);
			parser.parse();
			System.out.println("Parser: Pass");
		}catch (Exception e) {
			System.out.println("Parser: Fail");
			e.printStackTrace();
		}	
	}
	
}