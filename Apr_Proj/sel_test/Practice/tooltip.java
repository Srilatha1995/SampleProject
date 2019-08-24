package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class tooltip {

	public static void main(String[] args) {
    WebDriver driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default");
    driver.findElement(By.xpath("//input[@id='username']")).click();
    Actions a= new Actions(driver);
    WebElement element = driver.findElement(By.xpath("//html/body/div[1]/div[1]/div[2]/div[1]/div[2]/form/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]"));
    a.moveToElement(element).perform();
    String s = element.getText();
    
 // Print the tooltip message just for our refrences
  System.out.println("Tooltip/ Help message is: "+s);
    
    
	}

}
