package com.facebook.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.facebook.pageObject.SignupPage;
import com.facebook.utility.BaseClass;
import com.facebook.utility.LibraryUDF;

public class SignupPageTestClass extends BaseClass {

	public SignupPage page;
	
	@BeforeClass
	public void pageFactory(){
		page=PageFactory.initElements(driver, SignupPage.class);
		
	}
	@Test
	public void signupPageTxtBoxTest() {
		LibraryUDF.sendKeys(page.nameTxtBox(), excel.getExcelData("Signup", 1, 0), "firstName");
		LibraryUDF.sendKeys(page.surnameTxtBox(), excel.getExcelData("Signup", 1, 1), "lastName");
		LibraryUDF.sendKeys(page.emailTxtBox(), excel.getExcelData("Signup", 1, 2), "emailID");
		LibraryUDF.sendKeys(page.passwordTxtBox(), excel.getExcelData("Signup", 1, 3), "password");
	}
	
	@Test(enabled=false)
	public void verifyRadioBtn() throws InterruptedException {
		LibraryUDF.select(page.maleRadioBtn(), "2");
		Assert.assertTrue(page.maleRadioBtn().isSelected());
		Thread.sleep(2000);
		LibraryUDF.select(page.femaleRadioBtn(), "1");
		Assert.assertTrue(page.femaleRadioBtn().isSelected());
		Thread.sleep(2000);
		LibraryUDF.select(page.cutomRadioBtn(), "-1");
		Assert.assertTrue(page.cutomRadioBtn().isSelected());
	}
}
