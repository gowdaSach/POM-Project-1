package com.cs.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cs.PageObjects.LoginPage;
import com.cs.utilities.XLUtils;

public class TC_LoginDDT_001 extends BaseTest
{
	
	@Test(dataProvider= "LoginData")
	public void LoginTest1(String userid, String password) throws InterruptedException
	{
		Thread.sleep(3000);
		logger.info("Login Test is Started");
		LoginPage lp=new LoginPage(driver);
		lp.enterUserId(userid);
		Thread.sleep(3000);
		logger.info("User Name entered");
		lp.enterPassword(password);
		logger.info("Password entered");
		lp.clickLoginButton();
	    logger.info("login button clicked");
		
		Thread.sleep(3000);
		
		if(isAlertPresent()==true)
		{
			
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
		}else
		{
			Assert.assertTrue(true);
		 lp.clickLogotButton();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		}
	}
	
	
	public boolean isAlertPresent()
	{
		try {
		driver.switchTo().alert();
		return true;
		}catch(Exception e)
		{
			return false;
		}
	}
	
	
	
	@DataProvider(name="LoginData")
	String[][] getData() throws IOException, InterruptedException
	{
		//String path=System.getProperty("user.dir")+"/src/test/java/com/cs/testData/LoginData.xlsx";
		String path="E:\\Selenium\\POM-Poject-1\\src\\test\\java\\com\\cs\\testData\\LoginData.xlsx";//Same as above
		
		Thread.sleep(3000);
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1",i,j); //1,0
			}
		}
		return logindata;
	}	
	
	// Same DataDriven Using Direct method
	
	/*@DataProvider(name="LoginData")
	String[][] getData()
	{
		String data[][] = {{"mngr428846","zeqhadh"},{"mngr432991","esEtazu"},{"2531456789","wefwscsd"},{"cSAC522","DEWw1244"}};
		return (data);
	}*/

}


		

