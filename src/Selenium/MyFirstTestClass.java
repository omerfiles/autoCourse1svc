package Selenium;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class MyFirstTestClass extends BasicTest {
	
	@Test
	public void myFirstSeleniumTest(){
		webdriver.openUrl("http://www.google.co.il");
		
	
		
		webdriver.getElementByXpath("//input[@name='q']").sendKeys("baaaa");

		webdriver.getElementByXpath("//input[@name='q']").sendKeys(Keys.ENTER);
		
		System.out.println("ddd");
	}
	
	

}
