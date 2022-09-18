package testcases;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import page.LoginPage;

public class SimpliLearnLoginTest extends BaseClass {
	LoginPage loginPage;

	@Test(priority = 1)
	public void Test1() {
          test.log(LogStatus.INFO, "Test1 Execution Started");
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
		//driver.findElements(By.xpath("").)
	
		
	}
	
	
	@Test(priority = 2)
	@Parameters({"uname","pwd"})
	public void Test2(String UserName, String Password) {
		 test.log(LogStatus.INFO, "Test2 Execution Started");
		LoginPage Loginpage = new LoginPage(driver);
		Loginpage.Login(UserName,Password);
		
	}
	
	@Test
	public void Test3() {
		
		 test.log(LogStatus.INFO, "Test3 Execution Started");
		
		String UserName = sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println(UserName);
		String Password = sheet.getRow(1).getCell(1).getStringCellValue();
		
		LoginPage lp = new LoginPage(driver);
		lp.Login(UserName,Password);
	}


}
