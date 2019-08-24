package WebTableConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingTable {

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
	      
	      //row count
	      List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr"));
	      int r = row.size();
	      System.out.println("nbr of rows: "+r);
	      
	       //cols count
	      for(int i=1; i<=r; i++)
	      {
	         List<WebElement> cols = driver.findElements(By.xpath("//table/tbody/tr["+i+"]/td"));
	         int colscount = cols.size();
	         System.out.println("row nbr is  "+i+ " column count is "+colscount);
	      
	         //to get the table rows and cols data
	         for(int j=1;j<=colscount; j++)
	          {
	    	    WebElement element = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]"));
	    	    String str = element.getText();
	    	    System.out.println(str);
	          }
	      }     
	}
}
