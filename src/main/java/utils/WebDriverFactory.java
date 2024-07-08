package utils;

/**
 * @author Sumant
 */
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

	public  enum BrowserType {
		CHROME,
		FIREFOX
	}

	public static WebDriver createWebDriver(BrowserType browserType) {
		WebDriver driver = null;

		switch (browserType) {
			case CHROME:
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			case FIREFOX:
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			default:
				throw new IllegalArgumentException("Unsupported browser: " + browserType);
		}
		driver.manage().window().maximize();
		return driver;
	}

}
