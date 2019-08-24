package WebTableConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Gettingparticularcell {

	public static void main(String[] args) {
		  WebDriver driver = new FirefoxDriver();
	      driver.get("http://www.testingmasters.com/hrm");
	      driver.manage().window().maximize();
	      driver.findElement(By.xpath("//input[@id= 'txtUsername']")).sendKeys("user02");;
	      driver.findElement(By.xpath("//input[@id= 'txtPassword']")).sendKeys("TM1234");;
	      driver.findElement(By.xpath("//input[@id= 'btnLogin']")).click();
	      
	      //Leave tab
	      WebElement leave = driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']"));
	      Actions act = new Actions(driver);
	      act.moveToElement(leave).build().perform();
	      
	      //myleave
	      driver.findElement(By.xpath("//a[@id='menu_leave_viewMyLeaveList']")).click();
	      
	      List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr"));
	      int r = row.size();
	      System.out.println("nbr of rows: "+r);
	      
	      
	      
	      
	      
	      
	      
	      
	    	}

}
