package selpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class verifyElement {

	public static void main(String[] args) {
      WebDriver driver = new FirefoxDriver();
      driver.get("https://www.facebook.com");
      driver.manage().window().maximize();
      
      WebElement element = driver.findElement(By.id("u_0_9"));
      element.click();
      
  /*    boolean b = element.isDisplayed();
      element.click();
      if(b)
      {
    	  System.out.println("webelemnt displayed");
      }
      else
      {
    	  System.out.println("webelement not displayed");
      }
      boolean c = element.isEnabled();
      if(c)
      {
    	  System.out.println(" enabled");
      }webelemnt
      else
      {
    	  System.out.println("webelement not enabled");
      }
      boolean d = element.isSelected();
      if(d)
      {
    	  System.out.println("webelemnt selected");
      }
      else
      {
    	  System.out.println("webelement not selected");
      }          */
      
            //(or)
      
     boolean a = element.isDisplayed();
     boolean b = element.isEnabled();
     boolean c = element.isSelected();
     
     System.out.println(a);
     System.out.println(b);
     System.out.println(c);
     
     driver.close();
      
	}

}
