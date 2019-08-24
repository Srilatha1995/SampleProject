package WebTableConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DatePicker {

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
	      
	      //calender icon
	     driver.findElement(By.xpath("//form[@id='frmFilterLeave']/fieldset/ol/li[1]/img")).click();
	      
	    //Select Month
	     WebElement month = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[1]/div[1]/select[1]"));
	     Select sel_month = new Select(month);
	     sel_month.selectByVisibleText("Apr");
	     
	     //Select Year
	     WebElement year = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[1]/div[1]/select[2]"));
	     Select sel_year = new Select(year);
	     sel_year.selectByVisibleText("2019");
	     
	     //Select Day
	     List<WebElement> row = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']/table/tbody/tr"));
	     int rowcount = row.size();
	     System.out.println("row count is "+rowcount);
	     
	     for(int i=1; i<=rowcount; i++)
	     {
	    	 List<WebElement> col = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']/table/tbody/tr["+i+"]/td"));
		     int colscount = col.size();
		     for(int j=1;j<=colscount; j++)
		     {
		    	 WebElement element = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/table/tbody/tr["+i+"]/td["+j+"]"));
		    	 String day =  element.getText();
		    	 if(day.contains("11"))
		    	 {
		    		 driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/table/tbody/tr["+i+"]/td["+j+"]/a")).click();
		    	 }
		     }
		    
	     }
	     
	     
	}

}
