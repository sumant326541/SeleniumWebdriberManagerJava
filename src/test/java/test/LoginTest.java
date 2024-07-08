package test;

/**
 * @author Sumant
 */

import data.LoginData;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.WebDriverFactory;
import java.nio.file.Paths;

public class LoginTest {
	private WebDriver driver;
	private LoginPage loginPage;


	@BeforeClass
	public void setUp() {
		driver = WebDriverFactory.createWebDriver(WebDriverFactory.BrowserType.CHROME);
		loginPage = new LoginPage(driver);

	}

	@Test(dataProvider = "loginData", dataProviderClass = LoginData.class)
	public void loginTest(String username, String password, String message) throws InterruptedException {

		String loginPageFilePath = Paths.get("src/main/resources/LoginPage.html").toAbsolutePath().toString();

		loginPage.open("file://" + loginPageFilePath);
		loginPage.login(username,password, message);
	}

	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}

