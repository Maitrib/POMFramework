package com.simform.Listeners;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.SkipException;

import com.simform.Base.Page;


import com.simform.Utilities.TestConfig;
import com.simform.Utilities.TestUtil;
import com.relevantcodes.extentreports.LogStatus;


public class CustomListeners extends Page implements ITestListener, ISuiteListener{

	public String messageBody;
	public void onTestStart(ITestResult result) {
		
		test = rep.startTest(result.getName().toUpperCase());
		
//		//runmode - Y
//		if(!TestUtil.isTestRunnable(result.getName(), excel)) {
//			
//			throw new SkipException("Skipping the test "+result.getName().toUpperCase()+" as runmode is not true");
//		}
//		
	}

	public void onTestSuccess(ITestResult result) {
		
		test.log(LogStatus.PASS, result.getName().toUpperCase()+"PASS");
		rep.endTest(test);
		rep.flush();
		
	}

	public void onTestFailure(ITestResult result) {
		System.setProperty("org.uncommons.reportng.escape-output", "false");

		try {
			TestUtil.captureScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		test.log(LogStatus.FAIL, result.getName().toUpperCase()+" Failed with exception : "+result.getThrowable());
		test.log(LogStatus.FAIL, test.addScreenCapture(TestUtil.screenshotName));
		
		Reporter.log("Capturing Screenshot");
		Reporter.log("Log in successfully executed");
		Reporter.log("<a target=\"_blank\" href="+TestUtil.screenshotName+">Screenshot</a>");
		Reporter.log("<br>");
		Reporter.log("<a target=\"_blank\" href="+TestUtil.screenshotName+"> <img src="+TestUtil.screenshotName+" height=200 width=200></img> </a>");
		rep.endTest(test);
		rep.flush();
		
	}

	public void onTestSkipped(ITestResult result) {
		
		test.log(LogStatus.SKIP, result.getName().toUpperCase()+" Skipped the test as the Run mode is No");
		rep.endTest(test);
		rep.flush();
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ISuite suite) {
		
//		MonitoringMail mail = new MonitoringMail();
//
//		try {
//			messageBody = "http://"+InetAddress.getLocalHost().getHostAddress()+":8080/job/PageObjectModel/Extent_20Report/";
//		} catch (UnknownHostException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	
//	try {
//		mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, messageBody);
//	} catch (AddressException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} catch (MessagingException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	}
	

}
