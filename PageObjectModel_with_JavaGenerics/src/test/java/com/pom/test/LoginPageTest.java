package com.pom.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pom.pages.LoginPage;

public class LoginPageTest extends BaseTest
{
	
	@Test(priority=1)
	public void verifyLoginPageTitleTest()
	{
		String title = parentpage.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println("Print Login Page Title :" + title);
		Assert.assertEquals(title, "Facebook – log in or sign up");
		
	}
	
	@Test(priority=2)
	public void loginTest()
	{
		parentpage.getInstance(LoginPage.class).doLogin("deshan","deshan@123");
	}

}
