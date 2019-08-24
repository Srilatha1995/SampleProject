package selpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TabsOrder {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
	      driver.get("http://www.testingmasters.com/hrm");
	      driver.manage().window().maximize();
	      driver.findElement(By.xpath("//input[@id= 'txtUsername']")).sendKeys("user02");;
	      driver.findElement(By.xpath("//input[@id= 'txtPassword']")).sendKeys("TM1234");;
	      driver.findElement(By.xpath("//input[@id= 'btnLogin']")).click();
	      
	      String[] tabsorder = {"Leave","Time","My Info","Performance","Dashboard","Directory"};
	      
	      List<WebElement> listtabs = driver.findElements(By.xpath("//div[@id='wrapper']/div[2]/ul/li/a/b"));
	      
	      for(int i=0; i<listtabs.size(); i++)
	      {
	    	  String tabstext = listtabs.get(i).getText();
	    	//  System.out.println(tabstext);
	    	  if(tabsorder[i].equals(tabstext))
	    	  {
	    		  System.out.println(tabstext+ " is verified");
	    	  }
	    	  else
	    	  {
	    		  System.out.println(tabstext+ " is not verified");
	    	  }
	      }
	      driver.close();
	}

}
