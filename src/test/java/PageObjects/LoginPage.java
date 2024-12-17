package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(id="input-email")
	WebElement inputEmail;
	@FindBy(id="input-password")
	WebElement inputPassword;
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	
	public void EnterUserName(String email)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].setAttribute(email)", inputEmail);
		inputEmail.sendKeys(email);
		
	}
	public void EnterPassword(String password)
	{
		inputPassword.sendKeys(password);
	}
	public void clickOnSubmit()
	{
		
		submit.click();
		
	}
	
	

}
