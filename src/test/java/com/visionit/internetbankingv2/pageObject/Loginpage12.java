package com.visionit.internetbankingv2.pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Loginpage12 {
	WebDriver driver;
	//WebElement repository at page level
	
	@FindBy(name="uid")
	WebElement userid;
	
	@FindBy(name= "password")
	WebElement userPass;
	
	@FindBy(name= "btnLogin")
	WebElement login;
	
public Loginpage12(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
	
public void logindemo99(String uname, String upass) {
	
	userid.sendKeys(uname);
	userPass.sendKeys(upass);
	login.click();
	

}
	
	
	
}



