package com.actiTIME.WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomer 
{
	@FindBy(name="name")
	private WebElement customerNameTextField;
	
	@FindBy(xpath="//input[@value='Create Customer']")
	private WebElement  createCustomerButton;
	
	
	public AddNewCustomer()
	{
		PageFactory.initElements(com.actiTIME.Generics.SuperTestScript.driver, this);
		
	}
	
	public void enterCustomername(String customerName)
	{
		customerNameTextField.sendKeys(customerName);
	}
	
	public void clickOnCreateCustomerButton()
	{
		createCustomerButton.click();
	}
	
	
	
}
