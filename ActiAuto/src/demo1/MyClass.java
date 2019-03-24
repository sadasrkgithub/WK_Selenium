package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyClass 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","C:\\64bitAutomationSW\\geckodriver.exe");
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("http://srk:81/login.do");
		ff.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		ff.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		ff.findElement(By.xpath("//input[@type='submit']")).click();
		String s = ff.getTitle();
		System.out.println(s);
		Thread.sleep(3000);
		ff.findElement(By.className("logoutImg")).click();
		Thread.sleep(2000);
		ff.close();
	}

}
