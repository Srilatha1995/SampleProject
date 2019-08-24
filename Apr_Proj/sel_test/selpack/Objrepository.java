package selpack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Objrepository {

	public static void main(String[] args) throws IOException {
       FileInputStream fis = new FileInputStream("D:\\Apr_Sri_19\\Apr_Proj\\sel_test\\selpack\\obj.properties");
       Properties p = new Properties();
       p.load(fis);
       
       WebDriver driver = new FirefoxDriver();
       driver.get(p.getProperty("URL"));
       driver.manage().window().maximize();
       driver.findElement(By.id(p.getProperty("UID"))).sendKeys(p.getProperty("User"));
       driver.findElement(By.id(p.getProperty("PID"))).sendKeys(p.getProperty("Pass"));
       driver.findElement(By.id(p.getProperty("LID"))).click();
       driver.close();
	}

}
