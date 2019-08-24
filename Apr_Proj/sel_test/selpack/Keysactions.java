package selpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Keysactions {

	public static void main(String[] args) {
      WebDriver driver = new FirefoxDriver();
      driver.get("https://www.google.com");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     
      WebElement element = driver.findElement(By.linkText("Gmail"));
      
      Actions act = new Actions(driver);
        //   New window
    //  act.contextClick(element).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).click().perform();
      
      //      Google Apps       
      act.contextClick(element).sendKeys(Keys.ESCAPE)
      .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
      driver.close();
  
      
	}

}
