package PageTests;

import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.slidePage;

public class VerifyHorizontalSlide extends BaseTest{
	@Test
	public void verifySlide()
	{
		HomePage h1=new HomePage(driver);
		h1.clickOnhorizontalSlider();
		slidePage sl1=new slidePage(driver);
		sl1.getDirections();
		
		
	}

}
