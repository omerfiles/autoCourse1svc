package Selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericWebDriver {

	RemoteWebDriver webdriver;

	// remote url=address of node/grid
	public void init(String remoteUrl) throws Exception {
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();

		URL url = new URL(remoteUrl);

		webdriver = new RemoteWebDriver(url, capabilities);

	}

	// navigates to a url
	public void openUrl(String url) {
		webdriver.get(url);
	}

	public void quit() {
		webdriver.quit();
	}

	public WebElement getElementByXpath(String xpath) {
		WebDriverWait wait = new WebDriverWait(webdriver, 10, 1000);

		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		
		return element;
	}

}
