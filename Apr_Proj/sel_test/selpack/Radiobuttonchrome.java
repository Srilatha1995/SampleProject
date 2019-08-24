package selpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radiobuttonchrome {

	public static void main(String[] args)  {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srinath\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	      driver.get("https://www.facebook.com");
	      driver.manage().window().maximize();
	      
	      List<WebElement> li = driver.findElements(By.name("sex"));
		  li.get(1).click();
		  driver.close();   
	}

}
