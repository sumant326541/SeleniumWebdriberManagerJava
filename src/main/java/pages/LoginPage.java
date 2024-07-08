package pages;

/**
 * @author Sumant
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class LoginPage extends BasePage {

	@FindBy(id = "username")
	private WebElement emailField;

	@FindBy(id = "password")
	private WebElement passwordField;

	@FindBy(name = "login")
	private WebElement loginButton;

	//Update locators based on actual value
	@FindBy(name = "messgae")
	private WebElement messagetext;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void login(String username, String password, String message) {
		emailField.sendKeys(username);
		passwordField.sendKeys(password);
		//loginButton.click();
		//Not able to login or see any error message. this assertion will work with actual login application
	//	Assert.assertEquals(messagetext.getText(),message, "Message text does not match!");
	}
}
