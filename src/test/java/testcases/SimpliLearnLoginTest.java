package testcases;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.LoginPage;

public class SimpliLearnLoginTest extends BaseClass {
	

	@Test(priority = 1)
	public void Test1() {

		LoginPage Loginpage = new LoginPage(driver);
		Loginpage.Login("abc@xyz.com", "Test@123");
		// Step6: Validate the error message on screen
		WebElement Error = driver.findElement(By.id("msg_box"));

		String ActError = Error.getText();
		String ExpError = "The email or password you have entered is invalid.";

		Assert.assertTrue(Error.isDisplayed());
		Assert.assertEquals(ActError, ExpError);
		/*
		 * if (ActError.equals(ExpError)) { System.out.println("TC PAssed"); } else {
		 * System.out.println("Tc Failed"); }
		 */
	
		
	}
	
	
	@Test(priority = 2)
	public void Test2() {
		LoginPage Loginpage = new LoginPage(driver);
		Loginpage.Login("qa.mohsink@gmail.com","IlsaSimmi@1");
		
	}

}
