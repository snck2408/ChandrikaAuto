package ChandrikaTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement drop1=driver.findElement(By.xpath("//select[@id='country']"));
		Select sel=new Select(drop1);
		//sel.selectByValue("japan");
		sel.selectByVisibleText("United Kingdom");
		Thread.sleep(20);
		sel.selectByIndex(5);
		List<WebElement> list1=sel.getOptions();
		for(WebElement l1 : list1)
		{
			System.out.println(l1.getText());
		}
		//driver.quit();

	}

}
