package ExcelConcept;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Writestatus {
	
	String URL;
	String Userxpath;
	String Passxpath;
	String Loginxpath;
	String Username;
	String Password;
	XSSFSheet sh;
	int i;
	

	public void read() throws IOException  
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\srinath\\Desktop\\Book1.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis); //.xlsx
		
		
		sh = wb.getSheet("April");
		
		int row = sh.getLastRowNum();
		
		for(i=1; i<=row; i++)
		{
			 URL = sh.getRow(i).getCell(1).getStringCellValue();
			 Userxpath = sh.getRow(i).getCell(2).getStringCellValue();
			 Passxpath = sh.getRow(i).getCell(3).getStringCellValue();
					 
			  Loginxpath = sh.getRow(i).getCell(4).getStringCellValue();
			 Username = sh.getRow(i).getCell(5).getStringCellValue();
			 Password = sh.getRow(i).getCell(6).getStringCellValue();
			 
			app();
		}
		
		FileOutputStream fout = new FileOutputStream("C:\\Users\\srinath\\Desktop\\Book1.xlsx");
		wb.write(fout);
		fout.flush();
		wb.close();
		
		
	}
	
	public void app()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get(URL);
		driver.findElement(By.xpath(Userxpath)).sendKeys(Username);
		driver.findElement(By.xpath(Passxpath)).sendKeys(Password);
		driver.findElement(By.xpath(Loginxpath)).click();
		
		String currenturl = driver.getCurrentUrl();
		
		if(currenturl.contains("dashboard"))
		{
			System.out.println("Login successfully");
			sh.getRow(i).createCell(7).setCellValue("Pass");
			driver.close();
			
		}
		else
		{
			System.out.println("Login Failed");
			sh.getRow(i).createCell(7).setCellValue("Fail");
			driver.close();
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		
		Writestatus wr = new Writestatus();
		wr.read();
	}

}

