package selpack;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fileupload {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://testingmasters.com/hrm");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("user02");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("TM1234");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		//My Info
		driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']")).click();
		
		//Add button
		driver.findElement(By.xpath("//input[@id='btnAddAttachment']")).click();
		
		//Browse button
		driver.findElement(By.xpath("//input[@id='ufile']")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\srinath\\Desktop\\Fileupload1.exe");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='btnSaveAttachment']")).click();
		
	  
	      
	}

}
