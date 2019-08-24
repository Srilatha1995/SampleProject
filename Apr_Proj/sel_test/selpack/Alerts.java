package selpack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new FirefoxDriver();
	      driver.get("https://www.rediff.com");
	      driver.manage().window().maximize();
	      driver.findElement(By.partialLinkText("Sign in")).click();
	      driver.findElement(By.name("proceed")).click();
	      Thread.sleep(1000);
	      Alert a = driver.switchTo().alert();
	      System.out.println(a.getText());
	      a.accept();
	     
	}

}
