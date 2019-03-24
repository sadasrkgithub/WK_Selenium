package demo1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","C:\\64bitAutomationSW\\geckodriver.exe");
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("https:\\Users\\K SADA SIVA REDDY\\Desktop\\MyWebPage.html");
		
	}

}
