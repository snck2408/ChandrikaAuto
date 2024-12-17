package PageTests;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Properties;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class BaseTest {
	 public WebDriver driver;
	 
	@BeforeClass
	@Parameters({"os","browser"})
	public void LoginSetUp(String os,String browser) throws IOException
	{
		FileReader f1=new FileReader("C:\\Users\\snagachandrika\\eclipse-workspace_maven\\ChandrikaAuto\\src\\test\\resources\\config.properties");
		Properties prop=new Properties();
		ChromeDriver drv=new ChromeDriver();
		prop.load(f1);
		System.out.println("url "+ prop.getProperty("url"));
		System.out.println("YES");
		System.out.println(browser);
		if(prop.getProperty("execution_env").equals("remote"))
				{
			DesiredCapabilities cap=new DesiredCapabilities();
			cap.setPlatform(Platform.WIN10);
			cap.setBrowserName(browser);
			driver=new RemoteWebDriver (new URL("http://10.31.30.95:4444"),cap);
			
				}
		else
		{
		switch(browser.toLowerCase())
		{
		case "chrome" : driver = new ChromeDriver();break;
		case "edge" : driver = new EdgeDriver();break;
		default : System.out.println("invalid browser");return;
		
		}
		}
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get(prop.getProperty("url"));
			
driver.manage().window().maximize();
	}
	
	@AfterClass
	public void tearDown()
	{
//driver.quit();
	}
	
	
 
}
