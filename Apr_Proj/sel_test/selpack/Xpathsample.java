package selpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpathsample {

	public static void main(String[] args) {
      WebDriver driver = new FirefoxDriver();
      driver.get("https:www.facebook.com");
      driver.manage().window().maximize();
      driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Srilatha");
      driver.findElement(By.xpath("//input[@name='lastname' or @id='u_0_l']")).sendKeys("Singasani");
      driver.close();
      }

}
