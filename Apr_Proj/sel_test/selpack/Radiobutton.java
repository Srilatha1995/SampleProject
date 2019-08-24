package selpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radiobutton {

	public static void main(String[] args) {
     WebDriver driver = new FirefoxDriver();
     driver.get("http://www.facebook.com");
     driver.manage().window().maximize();
      WebElement element = driver.findElement(By.id("u_0_9"));
      element.click();
      
     boolean a = element.isDisplayed();
     System.out.println("Element is displayed "+a);
     boolean b = element.isEnabled();
     System.out.println("Element is enabled " +b);
     boolean c = element.isSelected();
     System.out.println("Element is selected "+c);
    driver.close();
    
	}

}
