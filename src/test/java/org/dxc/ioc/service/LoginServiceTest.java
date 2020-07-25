package org.dxc.ioc.service;

import static org.junit.Assert.*;

import org.dxc.ioc.model.Client;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LoginServiceTest {
    private String expectedResult;
    private String actualResult="uday";
    private LoginService login;
    private Client client;
    
	@Before
	public void setUp() throws Exception {
		login=new LoginService();
		 client=new Client("uday","uday");
	}

	
	@Test   //positive
	public void testValidateClient() {
		login.validateClient(client);
		expectedResult="uday";
		assertEquals(actualResult,expectedResult);
		
	}
	@Test   //negative
	public void testInValidateClient() {
		login.validateClient(client);
		expectedResult="uday123";
		assertNotEquals(actualResult,expectedResult);
		
	}
	@Test   //positive
	public void testPositiverClientTestCase() {
		Client client=new Client("uday","uday");
		assertTrue(login.validateClient(client));
		
	}
	@Test   //negative
	public void testNegativeClientTestCase() {
		Client client=new Client("uday","uday123");
		assertFalse(login.validateClient(client));
	}
	@After
	public void tearDown() throws Exception {
		login=null;
	}

}
