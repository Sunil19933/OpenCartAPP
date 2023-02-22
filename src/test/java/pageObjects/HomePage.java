package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{
public HomePage(WebDriver driver) {
		super(driver);	
	}

// Elements 
@FindBy(xpath = "//span[text()='My Account']" )
WebElement lnkMyaccount;
//a[@class='btn btn-link navbar-btn']

 @FindBy(linkText = "Register") 
 WebElement lnkRegister;
 
 @FindBy(linkText = "Login") 
 WebElement linkLogin;
 
 //Actions 
 public void clickMyAccount() {
		lnkMyaccount.click();
	}
	public void clickRegister() {
		lnkRegister.click();
	}
	
	public void clickLogin()  // Step No 6 Added 
	{
		linkLogin.click();
	}
}
