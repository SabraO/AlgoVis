package com.algovis.controller;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.algovis.domain.Algorithm;

public class TokenComparatorTest {

	private TokenComparator tokenComparator;
	
	@Before
	public void setUp() throws Exception {
		tokenComparator = new TokenComparator();
	}

	@Test
	public void testCompare() {
		List<Algorithm> inputList = new ArrayList<Algorithm>();
		
		Algorithm a = new Algorithm();
		a.setSequence("float");
		inputList.add(a);
		Algorithm b = new Algorithm();
		b.setSequence("boat");
		inputList.add(b);
		Algorithm c = new Algorithm();
		c.setSequence("gurantee");
		inputList.add(c);
		Algorithm result = tokenComparator.compare(inputList, "coat");
		
		assertEquals(b, result);
	}

}
