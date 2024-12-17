package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage1 extends BasePage {
	WebDriver driver;
	public HomePage1(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//span[text()='My Account']")
	public WebElement myAccount;
	
	@FindBy(linkText="Login")
	WebElement Login;
	
	public void clickOnMyaccount()
	
	{
		//WebElement mnr=driver.findElement(By.xpath("//span[text()='My Account']"));
		myAccount.click();
		
	}
	public void clickOnLogin()
	{
		Login.click();	
	}


}
