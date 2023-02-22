package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends  BasePage {
  
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	// Elements 
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtEmailAddress;

	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtPassword;

	@FindBy(xpath = "//input[@value='Login']")
	WebElement btnLogin;
	
	
	// Actions 
	
	public void setEmail(String email) {
		txtEmailAddress.sendKeys(email);
	}
	
	public void setpassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	
	public void clickLogin() {
		btnLogin.click();
	}
	
}

