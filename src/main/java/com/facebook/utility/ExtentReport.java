package com.facebook.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {

	public  ExtentReports exReport;
	public static ExtentReports getExtentReport() {
	ExtentSparkReporter report=new ExtentSparkReporter(System.getProperty("user.dir")+"\\Facebook\\TestReport");
	
	report.config().setDocumentTitle("FacebookSignupPage");
	report.config().setReportName("SignupPage");
	report.config().setTheme(Theme.DARK);
	
	ExtentReports exReport=new ExtentReports();
	exReport.attachReporter(report);
	exReport.setSystemInfo("System", "Facebook");
	exReport.setSystemInfo("Browser", "Chrome");
	exReport.setSystemInfo("QA", "Sanket P.");
	
	return exReport;
	
}
}