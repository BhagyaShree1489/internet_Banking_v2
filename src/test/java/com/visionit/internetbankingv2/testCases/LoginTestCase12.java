package com.visionit.internetbankingv2.testCases;

import org.testng.annotations.Test;

import com.visionit.internetbankingv2.pageObject.Loginpage12;
import com.visionit.internetbankingv2.testBase.TestBase12;

public class LoginTestCase12 extends TestBase12 {

	@Test
	public void logindemo99Test() {
		Loginpage12 login = new Loginpage12(driver);
		

		login.logindemo99(configData.getUserName(),configData.getUserPassword());

		}
		}
	
	 


