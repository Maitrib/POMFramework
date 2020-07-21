package com.simform.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.simform.Base.Page;
import com.simform.Pages.crm.CRMHomePage;



public class ZohoAppPage extends Page{
	
	
	public void gotoChat(){
		
	//	driver.findElement(By.xpath("")).click();
		
	}
	
	public CRMHomePage gotoCRM() throws InterruptedException{
	
	//driver.findElement(By.xpath("//*[@id=\\\"zl-myapps\\\"]/div[1]/div[6]/div/a/span")).click();
	click("crmlink_xpath");
	Thread.sleep(5000);
	//driver.findElement(By.xpath("//*[@id=\"trialExpiryDiv\"]/div/div[4]/input")).click();
	
//	driver.findElement(By.xpath("//*[@id=\"networkContainer\"]/div[2]/div[2]/ul/li[2]/input")).click();
//	driver.findElement(By.xpath("//*[@id=\"zcNetworkName\"]")).sendKeys("Simform");
	
//	driver.findElement(By.xpath("//*[@id=\"showCompanyInfoBtn\"]")).click();
//	Thread.sleep(10000);
//	driver.findElement(By.xpath("//*[@id=\"orgName\"]")).sendKeys("Manifest");
//	driver.findElement(By.xpath("//*[@id=\"orgPhone\"]")).sendKeys("1111111111");
	
		//*[@id="zl-myapps"]/div[1]/div[6]/div/a/span
		//click("crmlink_CSS");
		
		return new CRMHomePage();
	}
	
	
	public void gotoSalesIQ(){
		
	//	driver.findElement(By.xpath("")).click();
		
	}

}
