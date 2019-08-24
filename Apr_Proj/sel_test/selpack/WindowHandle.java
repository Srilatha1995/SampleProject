package selpack;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
	      driver.get("http://www.testingmasters.com/hrm");
	      driver.manage().window().maximize();
	    String first = driver.getWindowHandle();
	    System.out.println(first);
	    
	    driver.findElement(By.partialLinkText("OrangeHRM, Inc")).click();
	    
	    Set<String> second = driver.getWindowHandles();
	    System.out.println(second);
	    
	    for(String s:second)
	    {
	    	if(!first.equals(s))
	    	{
	    		driver.switchTo().window(s);
	    		Thread.sleep(1000);
	    		driver.findElement(By.partialLinkText("Services")).click();
	    		driver.close();
	    	}
	    }
	      driver.switchTo().window(first);
	      driver.findElement(By.xpath("//input[@id= 'txtUsername']")).sendKeys("user02");;
	      driver.findElement(By.xpath("//input[@id= 'txtPassword']")).sendKeys("TM1234");;
	      driver.findElement(By.xpath("//input[@id= 'btnLogin']")).click();
	      driver.close();
	      
	    
	    
	}

}
