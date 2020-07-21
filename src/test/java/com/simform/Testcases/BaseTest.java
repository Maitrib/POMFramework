package com.simform.Testcases;

import org.testng.annotations.AfterSuite;

import com.simform.Base.Page;

public class BaseTest {
	
	
	@AfterSuite
	public void tearDown(){
		
		Page.quit();
		
	}

}
