package JUnitconcept;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A1 {
	@After
	public void FBsignup()
	{
		 WebDriver driver = new FirefoxDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.facebook.com/signup");
	       driver.findElement(By.id("u_0_k")).sendKeys("testing");
	       driver.findElement(By.id("u_0_m")).sendKeys("masters");
	       driver.findElement(By.id("u_0_p")).sendKeys("testingmasters123@gmail.com");
	       driver.findElement(By.id("u_0_s")).sendKeys("testingmasters123@gmail.com");
	       driver.findElement(By.id("u_0_w")).sendKeys("TM12345");
	       System.out.println("FBsignup-Before");
	       driver.close();
	       
	}
	@Test
	public void login()
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.testingmasters.com/hrm");
        driver.findElement(By.id("txtUsername")).sendKeys("user02");
        driver.findElement(By.id("txtPassword")).sendKeys("TM1234");
        driver.findElement(By.id("btnLogin")).click();
        System.out.println("login-Test");
        driver.close();
    
	}

}
