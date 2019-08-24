package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class GenericMethods {
	public static WebDriver driver;
	
	public static boolean launchApplication(String URL) {

		boolean status;
		try {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(URL);
			status = true;
		} 
		catch (Exception e) 
		{
			status = false;
		}
		return status;
	}
	
	public static boolean Text(String elementxpath, String Value) {
		boolean status;
		try {
			driver.findElement(By.xpath(elementxpath)).clear();
			driver.findElement(By.xpath(elementxpath)).sendKeys(Value);
			status = true;
			
		} catch (Exception e) {
			
			status = false;
		}
		return status;
	}
	
	public static boolean Click(String elementxpath) {
		boolean status;
		try {
			
			driver.findElement(By.xpath(elementxpath)).click();
			status = true;
			
		} catch (Exception e) {
			
			status = false;
		}
		return status;
	}
  public static boolean logout(String elementxpath,String linktext)
  {
	boolean status;
	try {
		driver.findElement(By.xpath(elementxpath)).click();
		driver.findElement(By.partialLinkText(linktext)).click();
		status = true;
		} 
	catch (Exception e) {
		status = false;
	}
	
	return status;
	  
  }
	

}
