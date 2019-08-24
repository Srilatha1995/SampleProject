package selpack;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Elementlocation {

	public static void main(String[] args) {
      WebDriver driver = new FirefoxDriver();
      driver.get("http://www.testingmasters.com/hrm");
      driver.manage().window().maximize();
      
      WebElement element = driver.findElement(By.id("btnLogin"));
      
      Point p = element.getLocation();
       int x = p.getX();
       int y = p.getX();
       System.out.println("x-coordinate value:"+x+"pixels");
       System.out.println("y-coordinate value:"+y+"pixels");
       driver.close();
	}

}
