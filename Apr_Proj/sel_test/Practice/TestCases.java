package Practice;

import org.testng.annotations.Test;

public class TestCases extends GenericMethods{
	
	@Test
	public void TC01_Login()
	{
		boolean status;
		
		status = launchApplication("http://www.testingmasters.com/hrm");
		System.out.println("Launching Application: "+status);
		
		status = Text("//input[@id='txtUsername']", "user02");
		System.out.println("Enter UserName: "+status);
		status = Text("//input[@id='txtPassword']", "TM1234");
		System.out.println("Enter Password: "+status);
		status = Click("//input[@id='btnLogin']");
		System.out.println("Click on Login: "+status);
		
		status = logout("//a[@id='welcome']", "Logout");
		System.out.println("click on logout "+status);
		
		
	}

}
