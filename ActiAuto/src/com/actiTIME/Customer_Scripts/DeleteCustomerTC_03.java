package com.actiTIME.Customer_Scripts;

import org.testng.annotations.Test;

import com.actiTIME.Generics.ExcelOperation;
import com.actiTIME.Generics.SuperTestScript;
import com.actiTIME.Generics.ValidationOperation;
import com.actiTIME.WebPages.ActiveProjectsCustomers;
import com.actiTIME.WebPages.EditCustomerInformation;
import com.actiTIME.WebPages.LoginPage;
import com.actiTIME.WebPages.OpenTaskPage;

public class DeleteCustomerTC_03 extends SuperTestScript
{
	@Test
	public void testDeleteCustomerTC_03() throws InterruptedException 
	{
		
	//Step1 fetch all necessary data
	String username=ExcelOperation.readData("TC_03",1,1);
	String password=ExcelOperation.readData("TC_03",1,2);
// 	String customerName = ExcelOperation.readData("TC_02",1,10);
  	String expectedResult=ExcelOperation.readData("TC_03",1,3);
	//Step 2 create objects
	
	LoginPage lp=new LoginPage();
	ActiveProjectsCustomers apc = new ActiveProjectsCustomers();
// 	AddNewCustomer anc = new AddNewCustomer();
	OpenTaskPage otp=new OpenTaskPage();
	EditCustomerInformation eci = new EditCustomerInformation();
//sTep 3 covert test case into TestSCript
	
	lp.enterUsername(username);
    lp.enterPassword(password);	
    lp.clickOnLoginButton();
    
     
    apc.clickOnProjectsAndCutomers();
    
    apc.clickonOLAMCustomer();
    
    eci.deleteThisCustomer();
    
   // Alert rv1 = driver.switchTo().alert();
// 	rv1.accept();
	
    driver.switchTo().alert().accept();
    
    apc.retrieveSuccessMessage();
    
   //  apc.clickOnAddNewCutomer();
    
   //  anc.enterCustomername(customerName);
    
    // anc.clickOnCreateCustomerButton();
    
    String actualResult = apc.retrieveSuccessMessage();
    
    otp.clickOnLogoutButton();
    
    
	
    
  //Step 4 validation
   String status = ValidationOperation.verify(expectedResult, actualResult);
  //Step write data into excel
    ExcelOperation.writeData("TC_03",1,4,actualResult);
    ExcelOperation.writeData("TC_03",1,5,status);
		
	}

}
