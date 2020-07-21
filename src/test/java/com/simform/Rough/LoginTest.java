package com.simform.Rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.simform.Base.Page;
import com.simform.Pages.HomePage;
import com.simform.Pages.LoginPage;
import com.simform.Pages.ZohoAppPage;
import com.simform.Pages.crm.accounts.AccountsPage;
import com.simform.Pages.crm.accounts.CreateAccountPage;

public class LoginTest extends Page{

	public static void main(String[] args) throws InterruptedException {

//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"/src/test/resources/com/simform/executables/chromedriver");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.zoho.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
		
//		HomePage home = new HomePage();
//		home.goToLogin();
//		
//		LoginPage login = new LoginPage();
//		//login.doLogin("maitri.b@simformsolutions.com", "Buoyancy@1");
//		login.doLogin("chintansimform980@gmail.com", "Chatdone*1.");
//		
//		ZohoAppPage page = new ZohoAppPage();
//		page.gotoCRM();
//		
//		Page.menu.gotoAccounts();
//		
//		AccountsPage account = new AccountsPage();
//		account.gotoCreateAccounts();
//		
//		CreateAccountPage cap = new CreateAccountPage();
//		cap.createAccount("Maitri");
		

		HomePage home = new HomePage();
		LoginPage lp= home.goToLogin();
		ZohoAppPage zp= lp.doLogin("maitri.b@simformsolutions.com", "Buoyancy@1");
		zp.gotoCRM();
//		AccountsPage account = Page.menu.gotoAccounts();
//		CreateAccountPage cap = account.gotoCreateAccounts();
//		cap.createAccount("Maitri");
		
		//driver.manage.window.maximze()

		driver.quit();
		
	}

}
