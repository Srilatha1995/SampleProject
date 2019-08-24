package com.Tm_BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class DriverClass extends CommonVariables {
	
	public String userId="user02";
	public String password="TM1234";
	
	//========================================================================
	
	@BeforeMethod
	public void startingMethod(Method method1)  throws IOException{
		
		CurrentTestCaseName = method1.getName();

		System.out.println("<<TestStart>> TestCase Name   " + CurrentTestCaseName + "  <<TestStart>>");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		/*
		 	boolean bTag = false;							
			
			File f1 = new File(TestDataPath + "HRM.xlsx");
			FileInputStream inputstream = new FileInputStream(f1);
			XSSFWorkbook wb1 = new XSSFWorkbook(inputstream);
			
			XSSFSheet ws1 = wb1.getSheet("Sheet1");									
			int rowcount = ws1.getLastRowNum()+1;
			
			for(int iRowIndex=1; iRowIndex<rowcount; iRowIndex++)
			{
				Row r1 = ws1.getRow(iRowIndex);
				String TCName = r1.getCell(1).getStringCellValue();
				if(TCName.trim().equals(CurrentTestCaseName))
				{
					userId = r1.getCell(2).getStringCellValue();
					password = r1.getCell(3).getStringCellValue();
					bTag = true;
					break;
				}				
			}	
			
			if(bTag==false)
			{
				System.out.println("Testcase nout found in Test Data file");
			}
		*/		
		}		
		

//========================================================================	

	@AfterMethod
	public void EndMethod() {
		driver.close();
		System.out.println("<<TestSuccess>> TestCase Name   " + CurrentTestCaseName + "  <<TestSuccess>>");
		System.out.println();
	}
	

	@AfterSuite
	public void toEnd() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(System.getProperty("user.dir") + "\\test-output\\index.html");
		driver.navigate().refresh();

	}
	
	//========================================================================

}
