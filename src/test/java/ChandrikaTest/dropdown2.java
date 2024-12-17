package ChandrikaTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bstackdemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//select")).click();
		List<WebElement> allOptions=driver.findElements(By.cssSelector("select option"));
		System.out.println(allOptions.size());
		for(WebElement el1 : allOptions)
		{
			if(el1.getText().equals("Lowest to highest"))
			{
				el1.click();
			}
		}

	}

}
