package com.actiTIME.LoginLogout_Scripts;

import org.testng.annotations.Test;

import com.actiTIME.Generics.ExcelOperation;
import com.actiTIME.Generics.SuperTestScript;
import com.actiTIME.Generics.ValidationOperation;
import com.actiTIME.WebPages.LoginPage;
import com.actiTIME.WebPages.OpenTaskPage;

public class LoginLogoutTC_01 extends SuperTestScript
{
	@Test
	public void testLoginLogoutTC_01() 
	{
		
		//Step1 fetch all necessary data
	String username=ExcelOperation.readData("TC_01",1,1);
	String password=ExcelOperation.readData("TC_01",1,2);
	String expectedResult=ExcelOperation.readData("TC_01",1,3);
	//Step 2 create objects
	
	LoginPage lp=new LoginPage();
	OpenTaskPage otp=new OpenTaskPage();
	
//sTep 3 covert test case into TestSCript
	
	lp.enterUsername(username);
    lp.enterPassword(password);	
     lp.clickOnLoginButton();
    String actualResult = otp.retrieveTitleOfWebPage();
    otp.clickOnLogoutButton();
    
  //Step 4 validation
    String status = ValidationOperation.verify(expectedResult, actualResult);
  //Step write data into excel
    ExcelOperation.writeData("TC_01",1,4,actualResult);
    ExcelOperation.writeData("TC_01",1,5,status);
		
	}

}
