package com.simform.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.simform.Base.Page;



public class LoginPage  extends Page{
	
	
	
	
	public ZohoAppPage doLogin(String username,String password) throws InterruptedException{
		
//		driver.findElement(By.xpath("//*[@id=\"login_id\"]")).sendKeys(username);
//		driver.findElement(By.xpath("//*[@id=\"nextbtn\"]/span")).click();
	//	driver.switchTo().frame("vtsiframe");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html/body/div[5]/div[3]/div[2]/form/div[2]/div[2]/div[2]/input")).sendKeys(password);
//		driver.findElement(By.xpath("//*[@id=\"nextbtn\"]/span")).click();
	//	Thread.sleep(10000);
		type("email_xpath",username);
		click("nextBtn");

		type("password_xpath",password);
		click("signIn");
	//	
		return new ZohoAppPage();
	}
	
	
	public void gotoSalesandMarketing(){
		
		
	}
	
	public void gotoFinance(){
		
		
	}
	
	
}
