package com.actiTIME.WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerInformation 
{
	@FindBy(xpath="//input[@value='Delete This Customer']")
	private WebElement deleteTheCustomer;
	
	public EditCustomerInformation()
	{
		PageFactory.initElements(com.actiTIME.Generics.SuperTestScript.driver, this);
		
	}
	public void deleteThisCustomer() 
	{
		deleteTheCustomer.click();
	}
	
}
