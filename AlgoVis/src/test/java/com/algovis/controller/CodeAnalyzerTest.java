package com.algovis.controller;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class CodeAnalyzerTest {

	private CodeAnalyzer codeAnalyzer;
	
	@Before
	public void setUp() throws Exception {
		codeAnalyzer = new CodeAnalyzer();
		codeAnalyzer.setValues("for (var i = 0; i < a.length; i++) {\nvar k = a[i];\nfor (var j = i; j > 0 && k < a[j - 1]; j--)\na[j] = a[j - 1];\na[j] = k;\n}");
	}

	@Test
	public void testGetSequence() {
		String result = codeAnalyzer.getSequence();
		assertEquals("for i=0 i<a.length i++ k=a[i] for j=i j>0&&k<a[j-1] j-- a[j]=a[j-1] a[j]=k ", result);
	}

	@Test
	public void testGetPercentagelist() {
		ArrayList<Integer> percentagelist = new ArrayList<Integer>(Arrays.asList(new Integer[]{18,63,18,0}));
		ArrayList<Integer> resultList = codeAnalyzer.getPercentagelist();
		assertEquals(percentagelist, resultList);
	}

}
