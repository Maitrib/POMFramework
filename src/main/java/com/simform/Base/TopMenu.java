/**
 * 
 */
package com.simform.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.simform.Pages.crm.accounts.AccountsPage;



/**
 * @author maitri.brahmakshatriya
 *
 */
public class TopMenu{
	
WebDriver driver;
	
	public TopMenu(WebDriver driver){
		
		this.driver = driver;
	}
	
	public void gotoHome() {

	}

	public void gotoFeeds() {

	}

	public void gotoLeads() {

	}

	public AccountsPage gotoAccounts() {
		
		Page.click("accountstab_xpath");
	//	driver.findElement(By.xpath("//*[@id=\"mainMenuTabDiv\"]/crm-menu/div[1]/crm-tab/div[2]/div[4]/a")).click();
		
	//	Page.click("accountstab_CSS");
		
	 	return new AccountsPage();
	}

	public void gotoContacts() {

	}
	
	
	public void signOut(){
		
		
	}


}
