package TestNGconcept;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGsample {
	@BeforeSuite
	public void m1()
	{
		System.out.println("BS");
	}
	@AfterSuite
	public void m2()
	{
		System.out.println("AS");
	}
	@BeforeTest
	public void m3()
	{
		System.out.println("BT");
	}
	@AfterTest
	public void m4()
	{
		System.out.println("AT");
	}
	@BeforeClass
	public void m5()
	{
		System.out.println("BC");
	}
	@AfterClass
	public void m6()
	{
		System.out.println("AC");
	}
	@BeforeMethod
	public void m7()
	{
		System.out.println("BM");
	}
	@AfterMethod
	public void m8()
	{
		System.out.println("AM");
	}
	@Test
	public void m9()
	{
		System.out.println("Test");
	}
    
}
