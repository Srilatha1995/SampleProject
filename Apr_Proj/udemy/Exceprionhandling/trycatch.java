package Exceprionhandling;

public class trycatch {

	public static void main(String[] args) {
      /*   try
         {
        	 int value = 100;
             int result = value/0;
             System.out.println(result);
         }catch(Exception e) {
        	 System.out.println(e);
        	 System.out.println("divide the result by some other value");
        	 e.printStackTrace();
         }*/
		
		try {
			String a = null;
			System.out.println(a.length());
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("Please enter some value");
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
