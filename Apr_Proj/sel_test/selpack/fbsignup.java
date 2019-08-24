package selpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fbsignup {

	public static void main(String[] args) {
       WebDriver driver = new FirefoxDriver();
       driver.manage().window().maximize();
       driver.get("https://www.facebook.com/signup");
       driver.findElement(By.id("u_0_k")).sendKeys("testing");
       driver.findElement(By.id("u_0_m")).sendKeys("masters");
       driver.findElement(By.id("u_0_p")).sendKeys("testingmasters123@gmail.com");
       driver.findElement(By.id("u_0_s")).sendKeys("testingmasters123@gmail.com");
       driver.findElement(By.id("u_0_w")).sendKeys("TM12345");
       driver.close();
       driver.quit();
	}

}
