package selpack;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
     
	 WebDriver driver = new FirefoxDriver();
    driver.get("http://www.testingmasters.com/hrm");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//input[@id= 'txtUsername']")).sendKeys("user02");;
    driver.findElement(By.xpath("//input[@id= 'txtPassword']")).sendKeys("TM1234");;
    driver.findElement(By.xpath("//input[@id= 'btnLogin']")).click();
    List<WebElement> tabs = driver.findElements(By.xpath("//div[@id='wrapper']/div[2]/ul/li/a"));
    for(int i=0; i<tabs.size();i++)
    {
    	String taburl = tabs.get(i).getAttribute("href");
    	System.out.println(taburl);
    	if(taburl!=null)
    	{
    		URL url = new URL(taburl);
    	    HttpURLConnection connection = (HttpURLConnection)url.openConnection();
    	    connection.connect();
    	    int responsecode = connection.getResponseCode();
    	    System.out.println(tabs.get(i).getText()+"url response code is "+responsecode);
    	    
    	    //if response code found is 200 then url is not broken
    	    //if url code found is 404 or 505 then url is not broken
    	    
    	    if(responsecode==200)
    	     {
    	    	System.out.println(tabs.get(i).getText()+"url is not broken");
    	     }
    	    else
    	     { 
    	    	System.out.println(tabs.get(i).getText()+"url is not broken");
    	     }  
    		
    	}
    	else
  	  {
  		  System.out.println("taburl is null");
  	  }
    	
    }

}

}