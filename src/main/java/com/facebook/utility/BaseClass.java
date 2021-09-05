package com.facebook.utility;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public  WebDriver driver;
	public  ExcelData excel;
	public ConfigDataProvider config;
	
	@BeforeSuite
	public void excelData() throws EncryptedDocumentException, IOException {
		excel=new ExcelData();
		config=new ConfigDataProvider();
	}
	@Parameters("browser")
	@BeforeTest
	public void setUp(String browser){
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}
