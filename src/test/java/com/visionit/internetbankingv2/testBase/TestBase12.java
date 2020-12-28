package com.visionit.internetbankingv2.testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.visionit.internetbankingv2.utilty.ConfigDataProvider12;



public class TestBase12 {
public static WebDriver driver = null;


public ConfigDataProvider12 configData;
@BeforeSuite
public void setUpsuite() {
	configData= new ConfigDataProvider12();
}
	
	@Parameters("Browser")
	@BeforeMethod
	public void setUp( @Optional("Firefox")String browserName) {
		
		if(browserName.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Desktop\\selenium_library\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(browserName.equals("Firefox")) {
		System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\HP\\Desktop\\selenium_library\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();	
			
			
		}
		
		driver.get(configData.getAppUrl());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	}


