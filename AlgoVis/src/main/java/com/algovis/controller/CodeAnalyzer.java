package com.algovis.controller;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.algovis.controller.SymbolChecker;
import com.algovis.controller.Token;

public class CodeAnalyzer {

	CodeChecker c;
	ArrayList<Token> tokenlist;
	String sequence;
	ArrayList<Integer> percentagelist;
	
	public ArrayList<Token> getTokenlist() {
		return tokenlist;
	}

	public String getSequence() {
		return sequence;
	}

	public ArrayList<Integer> getPercentagelist() {
		return percentagelist;
	}

	public void setValues(String code) {
		
		/* analyze code
		 * remove whitespaces, var keyword and new line
		 * */
				
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		c = (CodeChecker) context.getBean("codechecker");
		
		String str1 = c.removeElement(code," ");
		String str2 = str1.replaceAll("[\n\r]", "");
		String str3 = c.removeElement(str2,"var");	
		
		ArrayList<String> codetokens = c.tokenize(str3);
		
		//create sequence of expression tokens
		sequence = "";
		for(int i = 0; i<codetokens.size();i++){
			sequence = sequence + codetokens.get(i) + " ";
		}
		
		tokenlist = new ArrayList<Token>();//create the token list (expression and type)
		
		int Kcount=0,Ccount=0,Ocount=0,Icount=0;
		
		//inserting tokens for the token list
		for(int i =0; i<codetokens.size();i++){
			SymbolChecker sym = new SymbolChecker();
			String token = codetokens.get(i);
			Token tk = new Token();
			boolean typeSet = false;
			tk.expression = token;
			
			//check if comparison operator
			if(!typeSet){
				while(sym.comparison.hasMoreElements()){
					String word = sym.comparison.nextElement();
					if(token.contains(word)){
						tk.type= "C";
						Ccount++;
						typeSet = true;
						break;
					}
				}
			}
			//check if operator
			if(!typeSet){
				while(sym.operator.hasMoreElements()){
					String word = sym.operator.nextElement();
					if(token.contains(word)){
						tk.type= "O";
						Ocount++;
						typeSet = true;
						break;
					}
				}
			}
			//check if keyword
			if(!typeSet){
				while(sym.keyword.hasMoreElements()){
					String word = sym.keyword.nextElement();
					if(token.contains(word)){
						tk.type= "K";
						Kcount++;
						typeSet = true;
						break;
					}
				}
			}
			
			if(!typeSet){
				tk.type = "I";
				Icount++;
				typeSet=true;
			}
			tokenlist.add(tk);
		}	
		
		//create array list and enter data
		percentagelist = new ArrayList<Integer>();
		
		int Kper=0,Cper=0,Oper=0,Iper=0;
		if(tokenlist.size()!=0){
			Kper = (int)(Kcount*100/tokenlist.size());
			Cper = (int)(Ccount*100/tokenlist.size());
			Oper = (int)(Ocount*100/tokenlist.size());
			Iper = (int)(Icount*100/tokenlist.size());
		}
		percentagelist.add(Kper);
		percentagelist.add(Cper);
		percentagelist.add(Oper);
		percentagelist.add(Iper);
	}
	
}


