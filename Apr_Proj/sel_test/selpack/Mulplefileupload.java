package selpack;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mulplefileupload {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.zamzar.com");
		driver.findElement(By.xpath("//div[@id='uploader-tool-step-1']/div[1]/div[1]/p/button")).click();
		Runtime.getRuntime().exec("C:\\Users\\srinath\\Desktop\\Fileupload2.exe");
		Thread.sleep(5000);
		
		
	}

}
