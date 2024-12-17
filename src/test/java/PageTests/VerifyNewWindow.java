package PageTests;

import java.time.Duration;
import java.util.Iterator;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.mulWindows;

public class VerifyNewWindow extends BaseTest  {


  @Test
  public void v1() throws InterruptedException {
	  HomePage h1=new HomePage(driver);
	  
	  h1.clickOnmultipleWindows();
	  String childWindow=driver.getWindowHandle();
	  //System.out.println(childWindow);
	  mulWindows m1=new mulWindows(driver);
	  m1.ClickOnClickHere();
	  
	  System.out.println("par"+driver.getTitle());
	  String mainWindowHandle = driver.getWindowHandle();
	  Iterator<String> iterator = m1.getwindowsList().iterator();

      // Here we will check if child window has other child windows and will fetch the heading of the child window
      while (iterator.hasNext()) {
          String ChildWindow = iterator.next();
              if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
              driver.switchTo().window(ChildWindow);
            Assert.assertEquals(driver.getTitle(),"New Window");
              System.out.println("Heading of child window is " + driver.getTitle());
          }

			  
		  }
      driver.switchTo().window(mainWindowHandle);
      Assert.assertEquals(driver.getTitle(),"The Internet");
		  
	  }
}
	  
  

