package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends BasePage {
	
	public MyAccount(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//h2[text()='My Account']")
	WebElement myAccount;

	@FindBy(xpath = "//div[@class='list-group']//a[text()='Logout']")
	WebElement lnkLogout;
	
	@FindBy(xpath = "//div[contains(@class,'alert')]")
	WebElement errorMessage;
	
	public Boolean isMyAccountDisplayed()
	{
		return myAccount.isDisplayed();
	}
	
	public Boolean isErrorMessageDisplayed()
	{
		return errorMessage.isDisplayed();
	}
	
	public void clickOnLogout()
	{
		
		lnkLogout.click();
	}
	
	

}
