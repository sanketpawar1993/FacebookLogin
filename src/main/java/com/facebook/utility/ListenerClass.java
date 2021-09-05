package com.facebook.utility;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ListenerClass implements ITestListener {

	ExtentReports exReport=ExtentReport.getExtentReport();

	ThreadLocal<ExtentTest>test1=new ThreadLocal<ExtentTest>();
	
	
	ScreenshotClass screenshot=new ScreenshotClass();
	
	public void onTestStart(ITestResult result) {
		ObjectRepo.test=exReport.createTest(result.getTestClass().getName()+" "+result.getMethod().getMethodName());
		test1.set(ObjectRepo.test);
	}

	public void onTestSuccess(ITestResult result) {
		ObjectRepo.test.log(Status.PASS, "TestCase Passed");
	}

	public void onTestFailure(ITestResult result) {
		ObjectRepo.test.log(Status.FAIL, "TestCase Failed");
		test1.get().addScreenCaptureFromBase64String(screenshot.getScreenshot());
	}

	public void onTestSkipped(ITestResult result) {
		ObjectRepo.test.log(Status.SKIP, "TestCase Skipped");
	}

	public void onTestFinish(ITestResult result) {
		exReport.flush();
	}

	
}
