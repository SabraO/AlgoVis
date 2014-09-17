package com.algovis.controller;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodeChecker {

	String removeElement(String code,String element){
		
		String newCode;
		Pattern r = Pattern.compile(element);
		Matcher m = r.matcher(code);
		
		newCode = m.replaceAll("");
		
		return newCode;
	}
		
	ArrayList<String> tokenize(String code){
		
		String[] arr = code.split("[({;)},]");
		
		ArrayList<String> tokensList = new ArrayList<String>();
		for(int i =0;i<arr.length;i++ ){
			if(!arr[i].isEmpty()) tokensList.add(arr[i]);
		}
				
		return tokensList;
		
	}
		
}
