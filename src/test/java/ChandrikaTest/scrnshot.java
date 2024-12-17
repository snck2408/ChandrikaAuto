package ChandrikaTest;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class scrnshot {
	@BeforeTest
	public void bt()
	{
		System.out.println("BEFORE TEST");
	}
	
	@Test(groups= {"Regression","smoke","master"})
	public void takscreenShot()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://stackoverflow.com/questions/31717639/how-does-all-annotations-work-in-testng-without-main-method");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File tarfile= new File("C:\\Users\\snagachandrika\\eclipse-workspace_maven\\ChandrikaAuto\\TestData\\fullpage.png");
		src.renameTo(tarfile);
		WebElement ele1=driver.findElement(By.xpath("//a[contains(text(), 'Ask Question')]"));
		File src1=ele1.getScreenshotAs(OutputType.FILE);
		File  tar1=new File(System.getProperty("user.dir")+"\\TestData\\elementscrshot.png");
		src1.renameTo(tar1);
		
		driver.close();
		
		
		;
		
		
	}
	

}
