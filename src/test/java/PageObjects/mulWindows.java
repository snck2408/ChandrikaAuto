package PageObjects;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class mulWindows extends BasePage {

	public mulWindows(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(partialLinkText="Click Here")
	WebElement newWindow;

	public void ClickOnClickHere() throws InterruptedException
	{
		Thread.sleep(20);
		driver.findElement(By.partialLinkText("Click Here")).click();
		
	}
	public Set<String> getwindowsList()
	{
	return driver.getWindowHandles();	
	}
}
	

	


