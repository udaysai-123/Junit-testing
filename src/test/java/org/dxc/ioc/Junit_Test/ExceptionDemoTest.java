package org.dxc.ioc.Junit_Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ExceptionDemoTest {
private ExceptionDemo demo;
  @Before
  public void init() {
	  demo=new ExceptionDemo();
	  
  }
  @Test(expected=ArithmeticException.class)
  public void testArthimeticException() {
	  demo.ArthimeticCaluclation();
	  
  }

}
