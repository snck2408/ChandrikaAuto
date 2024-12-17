package ChandrikaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class javascriptexec {
	WebDriver driver;
	
	
	@BeforeClass @Test(groups= {"Regression","smoke","master"})
	public void launchBrowser() throws InterruptedException
	{
		
		 driver=new ChromeDriver();
		 
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(20);
		
	}
	
	
  @Test
  public void click() {
	  WebElement startBtn=driver.findElement(By.xpath("//button[text()='START']"));
	  JavascriptExecutor js= (JavascriptExecutor)driver;
	 js.executeScript("arguments[0].click()", startBtn);
	  
  }
  @Test
  public void setvalue()
  {
	  WebElement txtEnterName=driver.findElement(By.xpath("//input[@placeholder='Enter Name']"));
	  JavascriptExecutor js= (JavascriptExecutor)driver;
	  js.executeScript("arguments[0].setAttribute('value','Test')", txtEnterName);
	  
  }
  @Test()
  public void scrollpixel()
  {
	  JavascriptExecutor js= (JavascriptExecutor)driver;  
	  js.executeScript("window.scrollBy(0,3000)");
	  System.out.println(js.executeScript("return window.pageyoffset"));
  }
  
  @Test()
  public void scrolltoelement()
  {
	  WebElement txtpopupwind=driver.findElement(By.xpath("//button[text()='Popup Windows']"));
	  JavascriptExecutor js= (JavascriptExecutor)driver;  
	  js.executeScript("arguments[0].scrollIntoView()", txtpopupwind);
  
  }
  
  @Test(groups= {"Regression","smoke"})
  public void scrolltoEnd()
  {
	  WebElement txtpopupwind=driver.findElement(By.xpath("//button[text()='Popup Windows']"));
	  JavascriptExecutor js= (JavascriptExecutor)driver;  
	  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
  
  }
  @AfterClass
  public void closeBrowser()
  {
driver.close();
  }
}
