package WebTableConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RowsandColumnscount {

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
      
      //column count
      List<WebElement> col = driver.findElements(By.xpath("//table/tbody/tr[2]/td"));
      int c = col.size();
      System.out.println("nbr of columns: "+c);
      
      //to get particular cell value
       String cellvalue =   driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]")).getText();
      System.out.println("cell value is: "+cellvalue);
      driver.close();
      
      
      
	}

}
