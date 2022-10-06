package com.cs.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cs.PageObjects.LoginPage;

public class LoginTest extends BaseTest
{
	
		 @Test
			public void loginTest1() throws IOException
			{
			 
			 logger.info("Login Test is Started");
							 
				 LoginPage loginPage=new LoginPage(driver);
				 
				 loginPage.enterUserId(config.getUserName());
				 logger.info("UserdId is Entered");
				 loginPage.enterPassword(config.getPassword());
				 logger.info("Password is Entered");
				 loginPage.clickLoginButton();
				 logger.info("Login Button Clicked");
				 String actualTitle= driver.getTitle();
				 String expectedTitle="GTPL Bank Manager HomePage123";
				 if (actualTitle.equals(expectedTitle))
				 {
					 Assert.assertTrue(true);
					 logger.info("Test Case Passed");
				 }else
				 {
					 logger.info("Test Case Failed");
					 captureScreen(driver, "loginTest1");
					 Assert.assertTrue(false);
				 }
				 
				 logger.info("Login Test is Compleated");
			}
			
	
}
