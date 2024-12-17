package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class slidePage extends BasePage {
	

	public slidePage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//div[@class='sliderContainer']/input[@type='range']")
	 private WebElement slidebar;
	public void getDirections()
	{
		WebElement el1=driver.findElement(By.xpath("//div[@class='sliderContainer']/input[@type='range']"));
		System.out.println("HO");
		
		  Point str2=el1.getLocation();
		  Actions act=new Actions(driver);
		  act.dragAndDropBy(el1, 50, 0).perform();
		  
	}

}
