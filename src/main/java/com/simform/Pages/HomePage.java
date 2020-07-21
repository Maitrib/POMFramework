package com.simform.Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.simform.Base.Page;


public class HomePage extends Page{
	
//	WebDriver driver;
//	public HomePage(WebDriver driver) {
//		this.driver=driver;
//	}
//	
	public void goToSupport(){
		
	//	driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/a[2]")).click();
		
	}
	
	public void goToSignUp(){
		
		driver.findElement(By.cssSelector(".signup")).click();
	}
	
	
	public LoginPage goToLogin() throws InterruptedException{
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/a[4]")).click();
	
		
		click("loginlink_xpath");
		
		return new LoginPage();
	}
	
	public void goToZohoEdu(){
		
		
		
	}
	
	public void goToLearnMore(){
		
		
		
	}
	
	
	public void validateFooterLinks(){
		
		
	}
}
