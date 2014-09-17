package com.algovis.controller;

import java.util.Vector;
import java.util.Enumeration;

public class SymbolChecker {

	Enumeration<String> keyword;
	Enumeration<String> operator;
	Enumeration<String> comparison;
	Enumeration<String> function;
	
	public SymbolChecker() {
		initializeEnum();
	}
	
	void initializeEnum(){		
		
		initilizeKeyword();
		initializeOperator();
		initializeComparison();
	}
	
	void initilizeKeyword(){
		
		Vector<String> keywords = new Vector<String>();
		keywords.add("break");
		keywords.add("case");
		keywords.add("comment");
		keywords.add("continue");
		keywords.add("default");
		keywords.add("delete");
		keywords.add("do");
		keywords.add("else");
		keywords.add("export");
		keywords.add("for");
		keywords.add("if");
		keywords.add("import");
		keywords.add("in");
		keywords.add("label");
		keywords.add("new");
		keywords.add("return");
		keywords.add("switch");
		keywords.add("this");
		keywords.add("typeof");
		keywords.add("var");
		keywords.add("while");
		keywords.add("void");
		keywords.add("with");
		
		keyword = keywords.elements();
	}
	
	void initializeOperator(){
		
		Vector<String> operators = new Vector<String>();
		operators.add("++");
		operators.add("--");
		operators.add("&");
		operators.add("&&");
		operators.add("|");
		operators.add("||");
		operators.add("~");
		operators.add(">>");
		operators.add("<<");
		operators.add("^");
				
		operator = operators.elements();
	}
	
	void initializeComparison(){
		Vector<String> comparisons = new Vector<String>();
		
		comparisons.add(">=");
		comparisons.add("<=");
		comparisons.add(">");
		comparisons.add("<");
		comparisons.add("==");
		comparisons.add("===");
		comparisons.add("!=");
		comparisons.add("!==");
		comparisons.add("=");
		comparisons.add("!");
		
		comparison = comparisons.elements();		
	}
}
