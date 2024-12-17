package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
	
public HomePage(WebDriver driver)
{
	super(driver);
	
	
}

@FindBy(xpath="//a[text()='Drag and Drop']")
WebElement DrogAndrop;

 @FindBy(xpath="//a[text()='Horizontal Slider']")
WebElement horizontalSlider;
 
 @FindBy(partialLinkText="Multiple Windows")
WebElement multipleWindows;



public void clickOnDragAndDrop()
{
	WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(50));
	w1.until(ExpectedConditions.visibilityOf(DrogAndrop)).click();
	
}
public void clickOnhorizontalSlider()
{
	System.out.println("yes");
	WebElement horsl=driver.findElement(By.xpath("//a[text()='Horizontal Slider']"));
	Actions act=new Actions(driver);
	act.moveToElement(horsl).click().perform();
	
}
public void clickOnmultipleWindows() throws InterruptedException
{
	Thread.sleep(20);
	driver.findElement(By.partialLinkText("Multiple Windows")).click();
		
}

}

