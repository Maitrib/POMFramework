package com.simform.Testcases;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.simform.Base.Page;
import com.simform.Pages.HomePage;
import com.simform.Pages.LoginPage;
import com.simform.Pages.ZohoAppPage;
import com.simform.Pages.crm.accounts.AccountsPage;
import com.simform.Pages.crm.accounts.CreateAccountPage;
import com.simform.Utilities.TestUtil;



public class LoginTest extends BaseTest{
	
	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp")
	public void loginTest(Hashtable<String,String> data) throws InterruptedException{
		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.zoho.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		HomePage home = new HomePage();
		LoginPage lp= home.goToLogin();
		lp.doLogin(data.get("username"), data.get("password"));
		
//		LoginPage lp = home.goToLogin();
//		lp.doLogin(data.get("username"), data.get("password"));
	//	Assert.fail("Login test failed");
	
		
	}

}
