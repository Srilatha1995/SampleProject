package selpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getmethods {

	public static void main(String[] args) {
      WebDriver driver = new FirefoxDriver();
      driver.get("http://www.testingmasters.com/hrm");
      driver.manage().window().maximize();
      
     //Title of the window 
/*     String str = driver.getTitle();
     System.out.println("Title is " + str);
     driver.close();     */
     
     //Current url of the application
    String str = driver.getCurrentUrl();
     System.out.println("Current url is: " + str);
     
     if(str.contains("login"))
     {
    	 System.out.println("pass");
     }
     else
     {
    	 System.out.println("fail");
     }
       //Capturing Tagname
 /*     String s = driver.findElement(By.id("txtUsername")).getTagName();
      System.out.println("Tagname is: " + s);
      
     //Capturing texts(used for links)
      String text = driver.findElement(By.tagName("a")).getText();
      System.out.println("link text is: " + text);       */
      
      //Capturing attribute value
      driver.findElement(By.id("txtUsername")).sendKeys("user02");
      String s = driver.findElement(By.id("txtUsername")).getAttribute("value");//entered text
      System.out.println("Attribute value is:"+s);
      
      
      //capturing link value
      String hreftext = driver.findElement(By.tagName("a")).getAttribute("href");
      System.out.println("hreftext is:"+hreftext);
      
      //Capturing Css value
      String s1 = driver.findElement(By.id("txtPassword")).getCssValue("color");
      System.out.println("Css value is:"+s1);
      
      driver.close();
    
     
	}

}
