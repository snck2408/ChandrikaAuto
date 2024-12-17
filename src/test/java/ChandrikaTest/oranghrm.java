package ChandrikaTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class oranghrm {
	WebDriver driver;
	
	@BeforeClass 
	@Parameters({"browser"})
	public void launchapp (String browser)
	{
	switch(browser)
	{
	case "chrome" : driver = new ChromeDriver();break;
	case "edge" : driver = new EdgeDriver();break;
	default : System.out.println("INVALID BROWSER");return;
	
	}
	 
	
	}
  @Test
  
  public void geturl() {
	  driver.get("https://www.orangehrm.com/");
	  System.out.println(driver.getTitle());
	 // driver.close();
  }
}

