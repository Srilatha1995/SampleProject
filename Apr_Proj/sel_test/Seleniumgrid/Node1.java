package Seleniumgrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Node1 {
  @Test
  public void Application1() throws MalformedURLException, InterruptedException
  {
	  DesiredCapabilities capability = DesiredCapabilities.firefox();
	  capability.setBrowserName("firefox");
	  capability.setPlatform(Platform.WIN10);
	  
	  WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.104:1111/wd/hub"),capability);
	  driver.manage().window().maximize();
	  driver.get("http://www.testingmasters.com/hrm");
      driver.findElement(By.id("txtUsername")).sendKeys("user02");
      driver.findElement(By.id("txtPassword")).sendKeys("TM1234");
      driver.findElement(By.id("btnLogin")).click();
     // System.out.println("login-Test");
      Thread.sleep(2000);
      driver.close();
  }   
      @Test
	  public void Application2() throws MalformedURLException, InterruptedException
		{
			DesiredCapabilities capability = DesiredCapabilities.chrome();
			capability.setBrowserName(BrowserType.CHROME);
			capability.setPlatform(Platform.WIN10);
			
			 WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.104:2222/wd/hub"),capability);
			 driver.manage().window().maximize();
	  		 driver.get("https://www.nopcommerce.com/");	
			 driver.findElement(By.xpath("//div[@id='header']/div[2]/div[1]/ul/li[1]/a")).click();
			 Thread.sleep(2000);
			 driver.close();
				
		
  }
   @Test(enabled=false)
   public void Application3() throws MalformedURLException
   {
	   DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
	   capability.setBrowserName(BrowserType.IE);
	   capability.setPlatform(Platform.WIN10);
	   
	   WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.104:3333/wd/hub"),capability);
	   driver.get("http://www.testingmasters.com/hrm");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("user02");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("TM1234");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		driver.close();
   }
	  	
}