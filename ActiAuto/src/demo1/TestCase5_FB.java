package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase5_FB 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","C:\\64bitAutomationSW\\geckodriver.exe");
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("https://www.facebook.com");
		Thread.sleep(3000);
		
		// ff.findElement(By.id("email")).sendKeys("sd1233@gmail.com");
		// ff.findElement(By.id("pass")).sendKeys("sd1233@gmailcom");
		// ff.findElement(By.xpath("//input[@value='Log In']")).click();
		
		
		ff.findElement(By.name("firstname")).sendKeys("FirstName");
		ff.findElement(By.name("lastname")).sendKeys("LastName");
		ff.findElement(By.name("reg_email__")).sendKeys("facebook@fb.com");
		ff.findElement(By.name("reg_email_confirmation__")).sendKeys("facebook@fb.com");
		ff.findElement(By.name("reg_passwd__")).sendKeys("password");
		ff.findElement(By.xpath("//input[@value='2']")).click();
		
		
		Select dropdown = new Select(ff.findElement(By.id("day")));
		dropdown.selectByVisibleText("18");
		
		Select dropdown1 = new Select(ff.findElement(By.id("month")));
		dropdown1.selectByVisibleText("Jun");
		
		Select dropdown2 = new Select(ff.findElement(By.id("year")));
		dropdown2.selectByVisibleText("1996");
		
		ff.findElement(By.name("websubmit")).click();
		
		
		
		// ff.close();

	}

}
