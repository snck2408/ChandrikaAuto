package ChandrikaTest;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class brokenlink {
	@BeforeTest
	public void bt()
	{
		System.out.println("BEFORE TEST");
	}
  @Test
  public void brokenlinks() throws IOException {
	  System.out.println(System.getProperty("user.dir")+"\\src\\test\\java\\Reports\\");
	  
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.deadlinkcity.com/");
	List<WebElement> links=driver.findElements(By.tagName("a"));
	WebElement Register= driver.findElement(By.xpath("//a[contains(@class,'btn') and text()='Register']"));
	if(links.size() > 0)
	{
		for(WebElement ln1 : links)
		{
			String getref= ln1.getAttribute("href");
			if((getref != null) || (getref == " " ))
			{
				URL ur1= new URL(getref);
				HttpURLConnection conn =  (HttpURLConnection)ur1.openConnection();
				conn.connect();
			if(conn.getResponseCode() >= 400)
			{
				System.out.println(getref +" is brokenlink");
			}
			else
			{
				System.out.println(getref +" is not brokenlink");
			}
				
			}
		}
		
	}
  } 
}
