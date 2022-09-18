package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(linkText = "Log in")
	WebElement LoginLink;

	@FindBy(name = "user_login")
	WebElement UserName;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(className = "rememberMe")
	WebElement checkbox;

	@FindBy(name = "btn_login")
	WebElement LoginBtn;

	

	WebDriver driver;

	// Page factory it willl support @Find By - you need to mention your driver and
	// class name
	public LoginPage(WebDriver basedriver) {
		this.driver = basedriver;
		PageFactory.initElements(basedriver, this);
	}

	public void Login(String Username, String Password) {

		// Step1. Click on Login Link

		LoginLink.click();

		// Step 2 Enter Username

		UserName.sendKeys(Username);

		// Step 3 Enter Password

		password.sendKeys(Password);

		// Step 4 Click remember me checkbox

		checkbox.click();

		// Step 5 Click on Login Button

		LoginBtn.click();

	}



}
