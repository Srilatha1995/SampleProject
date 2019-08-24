package JUnitconcept;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JUnitsample {
	@BeforeClass
	public static void m1()
	{
		System.out.println("BC");
	}
    @AfterClass
    public static void m2()
    {
    	System.out.println("AC");
    }
    @Before
    public void m3()
    {
    	System.out.println("Before");
    }
    @After
    public void m4()
    {
    	System.out.println("After");
    }
    @Test
    public void m5()
    {
    	System.out.println("Test");
    }
    @Ignore
    public void m6()
    {
    	System.out.println("Ignore");
    }
}

