package TestNGconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Sample2 {
	@AfterSuite
	public void leave()
	{
		 WebDriver driver = new FirefoxDriver();
	     driver.get("https://www.google.com");
	     driver.findElement(By.linkText("Gmail")).click();
	     driver.close();
		
	}
	@Test(enabled=false)
	public void a()
	{
		System.out.println("a");
	}

}
