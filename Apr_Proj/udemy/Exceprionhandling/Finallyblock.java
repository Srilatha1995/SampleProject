package Exceprionhandling;

public class Finallyblock {

	public static void main(String[] args) {
		try {
               String name = "Srilatha";
               System.out.println(name);
               
               
               String a =null;
               System.out.println(a.length()); 
	     	}
		 catch(Exception e)
		{
	        	e.printStackTrace();
		}
		finally
		{
		  System.out.println("This is finally block");
		}
	}
}
