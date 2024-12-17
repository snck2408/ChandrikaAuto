package PageTests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.HomePage1;
import PageObjects.LoginPage;
import PageObjects.MyAccount;
import utilities.dataprovider;
//@Listeners(utilities.extentUtilty.class)
public class TC001LoginData extends BaseTest {

	@Test(dataProvider="Login",dataProviderClass=dataprovider.class)
	public void runLogin(String username,String password,String res) throws InterruptedException
	{

		HomePage1 h1=new HomePage1(driver);
		DesiredCapabilities d1=new DesiredCapabilities();
		
		h1.clickOnMyaccount();
		h1.clickOnLogin();
		LoginPage l1=new LoginPage(driver);
		l1.EnterUserName(username);
		l1.EnterPassword(password);
		l1.clickOnSubmit();
		Thread.sleep(20);
		MyAccount acc1=new MyAccount(driver);
		if(res.equals("Valid"))
		{
			System.out.println("HICC"+acc1.isMyAccountDisplayed());
			if(acc1.isMyAccountDisplayed())
			{
				Assert.assertTrue(acc1.isMyAccountDisplayed());
				acc1.clickOnLogout();	
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		else
		{
			System.out.println("YESinvalid");
			if(acc1.isErrorMessageDisplayed())
			{

			System.out.println("YES123");
			Assert.assertTrue(true);
			
			}
			
			/*if(acc1.isMyAccountDisplayed())
			{
				System.out.println("YES1");
				

				acc1.clickOnLogout();
				Assert.assertTrue(false);

			}*/
			

		}
	}
}
