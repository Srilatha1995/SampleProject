package selpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linktext {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
	      driver.get("https://www.facebook.com");
	      driver.manage().window().maximize();
	     
	      List<WebElement> li = driver.findElements(By.tagName("a"));
	      System.out.println(li.size());
	      
     for(int i=0;i<li.size();i++)
     {
    	 System.out.println(li.get(i).getText());
     }
     driver.close();
	}

}
