package com.cs.testcases;

import org.testng.annotations.Test;

import com.cs.PageObjects.LoginPage;
import com.cs.PageObjects.NewCustomerPage;
@Test
public class NewCustomerPageTest extends BaseTest
{
	public void CreateNewCustomerPageTest() throws Exception
	{
		driver.get(config.getUrl());
		 
		 LoginPage loginPage=new LoginPage(driver);
		 loginPage.enterUserId(config.getUserName());
		 loginPage.enterPassword(config.getPassword());
		 loginPage.clickLoginButton();
		

	
	///driver.get("https://demo.guru99.com/V1/html/addcustomerpage.php");
	NewCustomerPage npg =new NewCustomerPage(driver);
    Thread.sleep(3000);
	driver.manage().window().maximize();
	npg.clickNewCustomer();
	logger.info("Customer Link clicked");
	npg.enterCustomerName("vishnu");
	logger.info("Customer Name Entered");
	npg.clickGender();
	logger.info("Gender Clicked");
	npg.enterdateOfBirth("27/04/96");
	logger.info("Date of Birth Entered");
	npg.enterAddress("Bangalore");
	logger.info("Adress Entered");
	npg.enterCity("Bangalore");
	logger.info("City Entered");
	npg.enterstate("Karnataka");
	logger.info("State Entered");
	npg.enterpin("560067");
	logger.info("Pin Code Entered");
	npg.enterTelephoneNumber("6360350267");
	logger.info("Phone Number Entered");
	npg.enterEmail("sachingowda270496@gmail.com");
	logger.info("Gmail Id Entered");
	npg.clickSubmitButton();
	logger.info("Submitt Button Clicked");
	}

	

}
