package com.algovis.controller;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class CodeCheckerTest {
	
	private CodeChecker codeChecker;

	@Before
	public void setUp() throws Exception {
		codeChecker = new CodeChecker();		
	}

	@Test
	public void testRemoveElement() {
		String codeInput = "var len     = items.length, value,  i,  j;  for (i=0; i < len; i++)      items[j+1] = value; }";
		String elementInput = " ";
		
		String result = codeChecker.removeElement(codeInput, elementInput);
		assertEquals("varlen=items.length,value,i,j;for(i=0;i<len;i++)items[j+1]=value;}", result);
	}

	@Test
	public void testTokenize(){
		String codeInput= "j;for(i=0;i<len;i++)items[j+1]=value;}";
		
		ArrayList<String> resultList = codeChecker.tokenize(codeInput);
		
		ArrayList<String> expectedList = new ArrayList<String>();
		expectedList.add("j");
		expectedList.add("for");
		expectedList.add("i=0");
		expectedList.add("i<len");
		expectedList.add("i++");
		expectedList.add("items[j+1]=value");
		assertEquals(expectedList,resultList);
	}
}
