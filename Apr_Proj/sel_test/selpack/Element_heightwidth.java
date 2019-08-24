package selpack;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Element_heightwidth {

	public static void main(String[] args) throws InterruptedException {
      WebDriver driver = new FirefoxDriver();
      driver.get("http://www.testingmasters.com/hrm");
      Thread.sleep(1000);
      driver.manage().window().maximize();
      
      WebElement element = driver.findElement(By.id("txtUsername"));
      
      org.openqa.selenium.Dimension d = element.getSize();
      int h = d.getHeight();
      int w = d.getWidth();
      System.out.println("Element height is:"+h+"pixels");
      System.out.println("Element width is:"+w+"pixels");
      driver.close();
      
   

      
	}

}
