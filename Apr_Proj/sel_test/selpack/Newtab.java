package selpack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Newtab {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
	      driver.get("https://www.google.com");
	      driver.manage().window().maximize();
	      
	      //New tab
	      driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
	      
	      driver.get("http://www.testingmasters.com/hrm");
	    
	      //Switching bw tabs tab
	      driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"\t");
	      
	      driver.switchTo().defaultContent();
	      driver.findElement(By.linkText("Gmail")).click();
	}

}
