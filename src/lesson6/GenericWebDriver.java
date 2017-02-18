package lesson6;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericWebDriver {

	RemoteWebDriver webDriver;

	public GenericWebDriver() throws Exception {

		DesiredCapabilities capabilities = DesiredCapabilities.chrome();

		ChromeOptions chromeOptions = new ChromeOptions();

		chromeOptions.addArguments("start-maximized");

		chromeOptions.addArguments("use-gl");

		chromeOptions.addArguments("ignore-gpu-blacklist");

		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);

		LoggingPreferences loggingPreferences = new LoggingPreferences();

		loggingPreferences.enable(LogType.BROWSER, Level.ALL);

		capabilities.setCapability(CapabilityType.LOGGING_PREFS, loggingPreferences);

		this.webDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
	}

	public WebElement getElement(String xpath) {
		WebDriverWait wait = new WebDriverWait(webDriver, 10, 1000);

		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}

	public WebElement getParentElement(WebElement element) {
		return element.findElement(By.xpath(".."));
	}

	List<WebElement> getElementsByXpath(String xpath) {
		WebDriverWait wait = new WebDriverWait(webDriver, 10, 1000);

		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath)));
	}

}
