package com.facebook.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {

	public Properties prop;
	public ConfigDataProvider() throws IOException {
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\configuration\\config.Properties");
		
		Properties prop=new Properties();
		prop.load(file);
		
	}
	
	
	
	public String getBrowser() {
		return prop.getProperty("browser");
	}
}
