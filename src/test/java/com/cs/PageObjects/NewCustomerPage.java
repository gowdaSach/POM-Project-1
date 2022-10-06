package com.cs.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomerPage {

	
	WebDriver ldriver=null;
	public NewCustomerPage(WebDriver rdriver)
	{
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//a[contains(text(),'New Customer')]")
	WebElement NewCustomerLink;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")
	WebElement Customer;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")
	WebElement gender;
	
	@FindBy(xpath="//*[@id=\"dob\"]")
	WebElement dateOfBirth;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea")
	WebElement adress;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="state")
	WebElement state;
	
	@FindBy(name="pinno")
	WebElement pin;
	
	@FindBy(name="telephoneno")
	WebElement tel;
	
	@FindBy(name="emailid")
	WebElement email;
	
	@FindBy(name="sub")
	WebElement submitButton;
	
	
	public void clickNewCustomer()
	{
		NewCustomerLink.click();
	}
	
	
	public void enterCustomerName(String customerName)
	{
		this.Customer.sendKeys(customerName);
	}
	
	public void clickGender()
	{
		this.gender.click();
	}
	
	public void enterdateOfBirth(String dateOfBirth)
	{
		this.dateOfBirth.sendKeys(dateOfBirth);
	}
	
	public void enterAddress(String adress)
	{
		this.adress.sendKeys(adress);
	}
	
	public void enterCity(String city)
	{
		this.city.sendKeys(city);
		
	}
	public void enterstate(String state)
	{
		this.state.sendKeys(state);
	}
	
	public void enterpin(String pin)
	{
		this.pin.sendKeys(pin);
	}
	public void enterTelephoneNumber(String teliphone)
	{
		tel.sendKeys(teliphone);
	}
	public void enterEmail(String email)
	{
		this.email.sendKeys(email);
	}
	
	public void clickSubmitButton()
	{
		this.submitButton.click();
	}


	
	


	
	
}
