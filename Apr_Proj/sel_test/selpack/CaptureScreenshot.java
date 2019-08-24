package selpack;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureScreenshot {
	public static void main(String[] args) throws IOException {
		
      WebDriver driver = new FirefoxDriver();
      driver.get("https://www.google.com");
      driver.manage().window().maximize();
      
      File sf = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(sf, new File("C:\\Users\\srinath\\Desktop\\Google.jpeg"));
      driver.close();
      
      

	}

}
