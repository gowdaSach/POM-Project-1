package com.cs.testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import org.testng.annotations.Parameters;

import com.cs.utilities.ReadConfig;

public class BaseTest 
{
	public WebDriver driver;
	public static Logger logger;;
		
	public ReadConfig config; 
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{ 
		config = new ReadConfig()	;
		
		logger= Logger.getLogger("Guru99");
		PropertyConfigurator.configure(config.getLog4jpath());
		
	ChromeOptions options=new ChromeOptions();	
	options.addArguments("--disable-notifications");
	
	if(br.equals("chrome"))
	{
	System.setProperty("webdriver.chrome.driver", config.getChromePath());
		 driver=new ChromeDriver(options);
	}else if(br.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", config.getFirefoxpath());
		 driver=new FirefoxDriver();
	}else
	{
		System.setProperty("webdriver.edge.driver", config.getMSEdgepath());
		 driver=new EdgeDriver();	
	}	
	driver.get(config.getUrl());
	}
	
	
		
	@AfterClass
	public void destroy()
	{
		 driver.quit(); 
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException
	{
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source= ts.getScreenshotAs(OutputType.FILE);
	File target= new File(System.getProperty("user.dir")+"/screenshots/" + tname + ".png");
	FileUtils.copyFile(source,target);
	System.out.println("Screnshot taken for the failured Case");
	}

}
