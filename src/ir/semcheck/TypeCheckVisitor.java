package ir.semcheck;

import java.util.List;

import ir.ASTVisitor;
import ir.ast.*;
import error.Error; // define class error


// type checker, concrete visitor 
public class TypeCheckVisitor implements ASTVisitor<Type> {
	
	private List<Error> errors;

	@Override
	public Type visit(AssignStmt stmt) { 
		return null; //aca va los chequeos
	}

	private void addError(AST a, String desc) {
		errors.add(new Error(a.getLineNumber(), a.getColumnNumber(), desc));
	}

	public List<Error> getErrors() {
		return errors;
	}

	public void setErrors(List<Error> errors) {
		this.errors = errors;
	}

	@Override
	public Type visit(ReturnStmt stmt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type visit(IfStmt stmt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type visit(BinOpExpression expr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type visit(VarLocation loc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type visit(Block block) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type visit(UnaryOpExpression unaryOpExpression) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type visit(ForStmt forStmt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type visit(WhileStmt whileStmt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type visit(BreakStmt breakStmt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type visit(ContinueStmt continueStmt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type visit(PuntoYComaStmt puntoYComaStmt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type visit(MethodCallStmt methodCallStmt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type visit(ArrayLocation arrayLocation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type visit(Program program) {
		for(int i=0;i<program.getLista_declaracion_clases().size();i++){
			program.getLista_declaracion_clases().get(i).accept(this);
		}
		return null;
	}

	@Override
	public Type visit(ClassDeclaration classDeclaration) {
		for(int i=0;i< classDeclaration.getField_declartion_list().size();i++){
			classDeclaration.getField_declartion_list().get(i).accept(this);
		}
		for(int i=0;i<classDeclaration.getMethod_declaration_list().size();i++){
			classDeclaration.getMethod_declaration_list().get(i).accept(this);
		}
		classDeclaration.getId().accept(this);
		return null;
	}

	@Override
	public Type visit(FieldDeclaration fieldDeclaration) {
		for(int i=0;i< fieldDeclaration.getIdentifier_list().size();i++){
			fieldDeclaration.getIdentifier_list().get(i).accept(this);
		}
		fieldDeclaration.getId().accept(this);
		return null;
	}

	@Override
	public Type visit(Identifier identifier) {
//		identifier.accept(this);
		return null;
	}

	@Override
	public Type visit(MethodDeclaration methodDeclaration) {
		for(int i=0;i< methodDeclaration.getField_declartion_list().size();i++){
			methodDeclaration.getField_declartion_list().get(i).accept(this);
		}
		methodDeclaration.getBody().accept(this);
		methodDeclaration.getId().accept(this);
		return null;
	}

	@Override
	public Type visit(Body body) {
		body.getBlock().accept(this);
		return null;
	}

	@Override
	public Type visit(BooleanLiteral booleanLiteral) {
		return Type.BOOLEAN;
	}

	@Override
	public Type visit(IntegerLiteral integerLiteral) {
		return Type.INT;
	}

	@Override
	public Type visit(FloatLiteral floatLiteral) {
		return Type.FLOAT;
	}

	@Override
	public Type visit(MethodCallExpression methodCallExpression) {
		return methodCallExpression.getMethod_call_statement().accept(this);
	}
}
