package com.cs.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig 
{
	Properties prop;

public ReadConfig() 
{
	try
	{
		prop=new Properties();
	File f=new File("E:\\Selenium\\POM-Poject-1\\config\\config.properties");
	FileInputStream fis= new FileInputStream(f);
	prop.load(fis);
	}catch(Exception e)
	{
		System.out.println("e.getMessage");
	}
}

public String getUrl()
{
	return prop.getProperty("url");
}

public String getUserName()
{
	return prop.getProperty("username");
}

public String getPassword()
{
	return prop.getProperty("password");
}

public String getChromePath()
{
	return prop.getProperty("chromepath");
}

public String getLog4jpath()
{
	return prop.getProperty("log4jpath");
}

public String getFirefoxpath() 
{
	return prop.getProperty("firefoxpath");
	
}

public String getMSEdgepath() 
{
	return prop.getProperty("msedgepath");
}
}
