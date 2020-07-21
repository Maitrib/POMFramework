package com.simform.Testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.simform.Base.Page;
import com.simform.Pages.ZohoAppPage;
import com.simform.Pages.crm.accounts.AccountsPage;
import com.simform.Pages.crm.accounts.CreateAccountPage;
import com.simform.Utilities.TestUtil;


public class CreateAccountTest {
	
	
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void createAccountTest(Hashtable<String,String> data) throws InterruptedException{
		
		ZohoAppPage zp = new ZohoAppPage();
		zp.gotoCRM();
		AccountsPage account = Page.menu.gotoAccounts();
		CreateAccountPage cap = account.gotoCreateAccounts();
		cap.createAccount(data.get("accountname"));
		Assert.fail("Create account test failed");
		
	}

}
