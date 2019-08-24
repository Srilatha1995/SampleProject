package selpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class Radiobuttons {

	public static void main(String[] args) {
		 WebDriver driver = new FirefoxDriver();
	      driver.get("https://www.facebook.com");
	      driver.manage().window().maximize();
	      
	   //   driver.findElement(By.name("sex")).click();
	      List<WebElement> li = driver.findElements(By.name("sex"));
	    		  li.get(1).click();
	    		  driver.close();
	      
	      
	}

}
