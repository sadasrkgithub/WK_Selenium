package com.actiTIME.WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenTaskPage
{
	@FindBy(className="logoutImg")
	private WebElement logoutButton;
	
		
	public OpenTaskPage()
	{
		PageFactory.initElements(com.actiTIME.Generics.SuperTestScript.driver, this);
	}
	public String retrieveTitleOfWebPage()
	{
	
		String data = com.actiTIME.Generics.SuperTestScript.driver.getTitle();
		return data;
		
	}
	
	
	public void clickOnLogoutButton(){
		
		logoutButton.click();
		
		
	}
	

}
