package seleniumLesson5;

import lesson6.GenericWebDriver;

public class LoginPage extends GenericPageObject {

	public LoginPage(GenericWebDriver webDriver) {
		super(webDriver);
	}
	
	public void enterUserName(String username){
		webDriver.getElement("//div[@id='username']").sendKeys(username);;
	}

}
