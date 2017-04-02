package Selenium;

import org.junit.After;
import org.junit.Before;

public class BasicTest {
	
	GenericWebDriver webdriver;
	
	@Before
	public void setup() throws Exception{
		
		webdriver=new GenericWebDriver();
		
		webdriver.init("http://localhost:4444/wd/hub");
	}
	
	@After
	public void tearDown(){
		webdriver.quit();
	}

}
