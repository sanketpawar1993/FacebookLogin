package com.facebook.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;

public class LibraryUDF extends BaseClass{

	public static void click(WebElement element ,String field) {
		try {
			element.click();
			ObjectRepo.test.log(Status.PASS, "element to be click:" +field);
		}catch(Exception e) {
			ObjectRepo.test.log(Status.FAIL, "Unable to click:"+field);
		}
	}
	
	public static void sendKeys(WebElement element,String value,String field) {
		try {
			element.sendKeys(value);
			ObjectRepo.test.log(Status.PASS, "Value enter to:"+field+"::"+value);
		}catch(Exception e) {
			ObjectRepo.test.log(Status.FAIL, "Unabled to enter value:"+field+"::"+value);
		}
	}
	
	public static void select(WebElement element, String value) {
		Select s=new Select(element);
		s.selectByValue(value);
		
	}
}
