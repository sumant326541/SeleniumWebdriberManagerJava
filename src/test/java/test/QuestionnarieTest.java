package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.QuestionnariePage;
import utils.WebDriverFactory;

import java.nio.file.Paths;

public class QuestionnarieTest {
	private WebDriver driver;
	private QuestionnariePage questionnariePage;

	@BeforeClass
	public void setUp() {
		driver = WebDriverFactory.createWebDriver(WebDriverFactory.BrowserType.CHROME);
		questionnariePage = new QuestionnariePage(driver);
	}

	@Test
	public void selectRandomRadioButton() throws InterruptedException {
		String questionariePageFilePath = Paths.get("src/main/resources/QuestionnariePage.html").toAbsolutePath().toString();
		questionnariePage.open("file://" + questionariePageFilePath);
		questionnariePage.selectRandomYesOrNo();
		Thread.sleep(1000);

	}

	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
