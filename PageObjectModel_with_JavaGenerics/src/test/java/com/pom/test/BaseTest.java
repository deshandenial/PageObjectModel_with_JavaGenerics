package com.pom.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import com.pom.pages.Parentpage;

public class BaseTest 
{
	WebDriver driver;
	WebDriverWait wait;
	Parentpage parentpage;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 15);
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		// create the object of the page class : Instantiate Page Class
		parentpage = new Parentpage(driver,wait);
		
	}

	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		
	}
	
}
