package data;

import org.testng.annotations.DataProvider;

/**
 * @author Sumant
 */
public class LoginData {


	@DataProvider(name = "loginData")
	public Object[][] loginDataProvider() {
		return new Object[][]{
				{"xxx","yyy", "successful login"},
				{"yyy", "yyy", "invalid email"},

		};
	}
}
