package org.dxc.ioc.Junit_Test;

import org.dxc.ioc.service.LoginService;
import org.dxc.ioc.service.LoginServiceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	CompareArray.class,
	LoginServiceTest.class,
	ExceptionDemoTest.class
	
	
})

public class JunitTestSuite {

}
