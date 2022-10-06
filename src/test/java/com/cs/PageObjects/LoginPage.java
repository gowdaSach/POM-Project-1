



package com.cs.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver=null;
	public LoginPage(WebDriver rdriver)
	{
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(name="uid")
	WebElement userIdField;
	
	@FindBy(name="password")
	WebElement passwordField;
	
	@FindBy(name="btnLogin")
	WebElement loginButton;
	
	@FindBy(xpath="//a[text()='Log out']")
	WebElement logoutButton;
	
	public void enterUserId(String userId)
	{
		userIdField.sendKeys(userId);
	}
	
	public void enterPassword(String password)
	{
		this.passwordField.sendKeys(password);
	}
	
	public void clickLoginButton()
	{
		loginButton.click();
	}
	public void clickLogotButton()
	{
		logoutButton.click();
	}
	
}
	