package com.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage
{

	public LoginPage(WebDriver driver, WebDriverWait wait)
	{
		super(driver,wait);
	}
	
 // page locators
	
	By Username =By.xpath("//input[@id='email']");
	
	By Password = By.xpath("//input[@id='pass']");
	
	By Loginsubmit = By.xpath("//input[@id='u_0_b']");
	

 // page action
	
	public String getLoginPageTitle()
	{
	return driver.getTitle();
	}
	
	public void doLogin(String username , String password)
	{
		doClick(Username);
		doSendKeys(Username, username);
		doSendKeys(Password, password);
		doClick(Loginsubmit);
		
	}
	
	public void doGetText()
	{
		doGetText();
	}
}
