package com.visionit.internetbankingv2.utilty;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider12 {
	public Properties prop;

	public ConfigDataProvider12() {
		
		try {
		File fs= new File ("./Config/config.properties");
		
		FileInputStream fins = new FileInputStream(fs);
		prop= new Properties();
		prop.load(fins);
		
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	}

	public String getKeyValue(String searchKey) {
		return prop.getProperty(searchKey);
	}
	
	public String getUserName() {
		return prop.getProperty("UserID");
	}
	
	public String getUserPassword() {
		return prop.getProperty("Password");
	}

	public String getAppUrl() {
		return prop.getProperty("LOGIN");
	}
}

