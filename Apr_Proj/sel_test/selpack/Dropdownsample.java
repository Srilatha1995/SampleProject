package selpack;

import java.util.List;
import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.thoughtworks.selenium.webdriven.commands.Click;

public class Dropdownsample {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver = new FirefoxDriver();
     driver.get("http://newtours.demoaut.com/index.php");
     driver.manage().window().maximize();
     
     driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
     driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
     driver.findElement(By.xpath("//input[@name='login']")).click();
     
     List<WebElement> li = driver.findElements(By.name("tripType"));
     li.get(1).click();
     Select pass = new Select(driver.findElement(By.name("passCount")));
     pass.selectByIndex(2);
     Thread.sleep(1000);
     Select from = new Select(driver.findElement(By.name("fromPort")));
     from.selectByVisibleText("London");
     Select month = new Select(driver.findElement(By.name("fromMonth")));
     month.selectByIndex(4);	
     Select day = new Select(driver.findElement(By.name("fromDay")));
     day.selectByVisibleText("11");
     Select in = new Select(driver.findElement(By.name("toPort")));
     in.selectByVisibleText("Paris");
     Select month1 = new Select(driver.findElement(By.name("toMonth")));
     month1.selectByIndex(6);	
     Select day1 = new Select(driver.findElement(By.name("toDay")));
     day1.selectByVisibleText("14");
     
     List<WebElement> li1 = driver.findElements(By.name("servClass"));
     li1.get(2).click();
     Thread.sleep(1000);
     
     Select Airline = new Select(driver.findElement(By.name("airline")));
     Airline.selectByVisibleText("No Preference");	
     driver.findElement(By.name("findFlights")).click();
     
     
     
     
     
     
    
     
     
     
     
	}

}
