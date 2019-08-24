package selpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Apr_Sri_19\\Drivers\\chromedriver.exe");
   	 WebDriver driver = new ChromeDriver();
   	
		driver.get("http://www.testingmasters.com/hrm");
        driver.findElement(By.id("txtUsername")).sendKeys("user02");
        driver.findElement(By.id("txtPassword")).sendKeys("TM1234");
        driver.findElement(By.id("btnLogin")).click();
       // driver.close();
      //  driver.quit();
	}

}
