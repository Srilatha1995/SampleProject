package TestNGconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample1 {
	
@BeforeTest
 public void username()
 {
	 WebDriver driver = new FirefoxDriver();
	 driver.get("https://www.testingmasters.com/hrm");
	 driver.findElement(By.id("txtUsername")).sendKeys("user01");;
	 driver.findElement(By.id("txtPassword")).sendKeys("TM1234");;
	 driver.findElement(By.id("btnLogin")).click();;
	 driver.close();
	 
 }
    @BeforeSuite
	public void url()
	{
		 WebDriver driver = new FirefoxDriver();
		 driver.get("https://www.google.com");
		 driver.manage().window().maximize();
		 driver.close();
		
	}
	
	
}
