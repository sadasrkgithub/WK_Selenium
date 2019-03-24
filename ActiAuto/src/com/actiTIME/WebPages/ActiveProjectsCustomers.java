package com.actiTIME.WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiveProjectsCustomers 
{
	@FindBy(linkText="Projects & Customers")
	private WebElement ProjectsAndCutomers;
	
	@FindBy(xpath="//input[@value='Add New Customer']")
	private WebElement clickOnAddNewCustomer;
	
	
	@FindBy(className="successmsg")
	private WebElement customerCreatedSuccessfuly;
	
	@FindBy(linkText="OLAM")
	private WebElement cutomerOLAM;
	
	
	public ActiveProjectsCustomers()
	{
		PageFactory.initElements(com.actiTIME.Generics.SuperTestScript.driver, this);
		
	}
  
	public void clickOnProjectsAndCutomers()
	{
		ProjectsAndCutomers.click();
	}
	
	public void clickOnAddNewCutomer()
	{
		clickOnAddNewCustomer.click();
	}
	
	public void clickonOLAMCustomer() 
	{
		cutomerOLAM.click();
	}
	
	
	public String retrieveSuccessMessage()
	{
	
		String data = customerCreatedSuccessfuly.getText();
		return data;
	}
	
	 
	
}
