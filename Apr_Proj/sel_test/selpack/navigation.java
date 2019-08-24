package selpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class navigation {

	public static void main(String[] args) throws InterruptedException {
      WebDriver driver = new FirefoxDriver();
     
      driver.get("https://www.google.com ");
      driver.manage().window().maximize();
      driver.navigate().to("https://www.facebook.com");
      driver.navigate().back();
      Thread.sleep(1000);
      driver.navigate().forward();
      Thread.sleep(1000);
      driver.navigate().refresh();
      driver.close();    
	}

}
