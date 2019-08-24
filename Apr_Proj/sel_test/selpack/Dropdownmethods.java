package selpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownmethods {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver = new FirefoxDriver();
     driver.get("https://www.facebook.com");
     driver.manage().window().maximize();
     
     Select day = new Select(driver.findElement(By.id("day")));
     day.selectByIndex(3);
     Thread.sleep(1000);
     
     Select month = new Select(driver.findElement(By.id("month")));
     month.selectByValue("3");
     Thread.sleep(1000);
     
     
     Select year = new Select(driver.findElement(By.id("year")));
     year.selectByVisibleText("1995");
     Thread.sleep(1000);
     
     //Retrieving the selected value
     
  /*   String str = month.getFirstSelectedOption().getText();
     System.out.println("Selected option is: " + str);
     Thread.sleep(1000);   
 */   
 
     
   // To get the all dropdown vales
    List<WebElement> dropdown = month.getOptions();
    for(int i=0;i<dropdown.size();i++)
    {
    	String s = dropdown.get(i).getText();
    	System.out.println("drop down values are "+s);
    }
    driver.close();
 
 
 
	}

}
