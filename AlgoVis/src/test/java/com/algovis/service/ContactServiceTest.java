package com.algovis.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( { "file:src/test/java/testContext.xml" })
@Transactional
public class ContactServiceTest {

	@Autowired
	private ContactService contactService;
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		
	}

}
