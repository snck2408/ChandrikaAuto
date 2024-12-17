package ChandrikaTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windhand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		((JavascriptExecutor) driver).executeScript("window.open('https://www.google.com','_blank');");
		((JavascriptExecutor) driver).executeScript("window.open('https://www.yahoo.com','_blank');");
		((JavascriptExecutor) driver).executeScript("window.open('https://www.bing.com','_blank');");
		
		
		String parentWindow=driver.getWindowHandle();
		Set<String> allhandles=driver.getWindowHandles();
		List<String> alhands= new ArrayList<>(allhandles);
		for(String wind :allhandles)
		{
		System.out.println("set "+wind);	
		}
		for(String wind :alhands)
		{
			System.out.println("list "+wind);	
		}
		
		System.out.println(alhands.size());
		//{
			driver.switchTo().window(alhands.get(3));
			//if(driver.getTitle().toLowerCase().contains("yahoo"))
			//{
				//driver.close();
				System.out.println("3rd"+driver.getTitle());
				driver.switchTo().window(alhands.get(2));
				System.out.println("2nd"+driver.getTitle());
				driver.switchTo().window(alhands.get(1));
				System.out.println("1st"+driver.getTitle());
				driver.switchTo().window(alhands.get(0));
				System.out.println("0"+driver.getTitle());
				
			//}
		}
		
	}


