package Exceprionhandling;

public class multicatch {

	public static void main(String[] args) {
	try
	{
      int value = 100;
      int result = 100/0;
	}catch(ArithmeticException e)
	{
		System.out.println("this is the specific exception");
		e.printStackTrace();
	}
	catch(Exception e)
	{
		System.out.println("This is generic exception");
		e.printStackTrace();
	}
	}

}
