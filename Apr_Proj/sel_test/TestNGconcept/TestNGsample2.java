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

public class TestNGsample2 {
		@Test(priority=0)
		public void m1()
		{
			System.out.println("BS");
		}
		@Test(priority=8)
		public void m2()
		{
			System.out.println("AS");
		}
		@Test(priority=1)
		public void m3()
		{
			System.out.println("BT");
		}
		@Test(priority=7)
		public void m4()
		{
			System.out.println("AT");
		}
		@Test(priority=2)
		public void m5()
		{
			System.out.println("BC");
		}
		@Test(priority=6)
		public void m6()
		{
			System.out.println("AC");
		}
		@Test(priority=3)
		public void m7()
		{
			System.out.println("BM");
		}
		@Test(priority=5)
		public void a()
		{
			System.out.println("AM");
		}
		@Test(priority=4)
		public void m9()
		{
			System.out.println("Test");
		}
	    

	}

