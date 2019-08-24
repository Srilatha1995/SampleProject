package selpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Movetoelement_Mouseover {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver = new FirefoxDriver();
     driver.get("http:www.testingmasters.com/hrm");
     driver.manage().window().maximize();
     
     driver.findElement(By.id("txtUsername")).sendKeys("user02");
     driver.findElement(By.id("txtPassword")).sendKeys("TM1234");
     driver.findElement(By.id("btnLogin")).click();
     
     WebElement element = driver.findElement(By.id("menu_leave_viewLeaveModule"));
     Thread.sleep(1000);
     Actions act = new Actions(driver);
     act.moveToElement(element).build().perform();
    // Thread.sleep(5000);
    driver.close();
     
     
	}

}
