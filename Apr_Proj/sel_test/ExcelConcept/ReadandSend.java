package ExcelConcept;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadandSend {

	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\srinath\\Desktop\\Apr-30.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis); //.xlsx
		
		XSSFSheet sh = wb.getSheet("Apr");
		
		Row r = sh.getRow(0);
		
		String URL = r.getCell(3).getStringCellValue();
		String UserXpath = r.getCell(4).getStringCellValue();
		String PassXpath = r.getCell(5).getStringCellValue();
		String LoginXpath = r.getCell(6).getStringCellValue();
		
		String Username = r.getCell(7).getStringCellValue();
		String Password = r.getCell(8).getStringCellValue();
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.findElement(By.xpath(UserXpath)).sendKeys(Username);
		driver.findElement(By.xpath(PassXpath)).sendKeys(Password);
		driver.findElement(By.xpath(LoginXpath)).click();
		
		fis.close();
		wb.close();

	}
	
	

}
