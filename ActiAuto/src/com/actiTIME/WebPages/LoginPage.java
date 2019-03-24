package com.actiTIME.WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	@FindBy(name="username")
	private WebElement usernameTextField;
	
	@FindBy(name="pwd")
	private WebElement passwordTextField;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement loginButton;
	
	
	public LoginPage()
	{
		PageFactory.initElements(com.actiTIME.Generics.SuperTestScript.driver, this);
		
	}
  
	
	public void enterUsername(String username)
	{
		usernameTextField.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		passwordTextField.sendKeys(password);
	}
	public void clickOnLoginButton()
	{
		loginButton.click();
	}

}
