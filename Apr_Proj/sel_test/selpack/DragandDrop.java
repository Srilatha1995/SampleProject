package selpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver = new FirefoxDriver();
     driver.get("http://jqueryui.com");
     driver.manage().window().maximize();
     
     driver.findElement(By.partialLinkText("Droppable")).click();
     driver.switchTo().frame(driver.findElement(By.className("demo-frame"))) ;
     WebElement source = driver.findElement(By.id("draggable"));
     WebElement target = driver.findElement(By.id("droppable"));
     Thread.sleep(1000);
     Actions a = new Actions(driver);
     a.dragAndDrop(source, target).build().perform();
     
     
     //                             (or)
    // a.clickAndHold(source).moveToElement(target).build().perform(); 
     
     
     //to come out of the frame we use defaultcontent() method
     driver.switchTo().defaultContent();
     driver.findElement(By.partialLinkText("Datepicker")).click();
     driver.close();    
    		   
     
   }

}
