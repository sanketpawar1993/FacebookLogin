package com.facebook.utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotClass extends BaseClass {

	public String getScreenshot() {
		
		String file=((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		return file;
	}
}
