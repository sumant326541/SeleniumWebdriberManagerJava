package pages;

/**
 * @author Sumant
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class QuestionnariePage extends BasePage {

	@FindBy(xpath = "//input[@type='radio' and @value='N']")
	private WebElement radioButtonNo;

	@FindBy(xpath = "//input[@type='radio' and @value='Y']")
	private WebElement radioButtonYes;

	@FindBy(xpath = "//input[@type='radio' and @value='Y']")
	private List<WebElement> radioButtonsListYes;


	public QuestionnariePage(WebDriver driver) {
		super(driver);
	}


	/**
	 * select 'yes' or 'No' radio button randomly
	 */
	public void selectRandomYesOrNo() {
		Random random = new Random();
		for (WebElement ele : radioButtonsListYes) {
			if (random.nextBoolean()) {
				ele.click();
			}
		}
	}
}
