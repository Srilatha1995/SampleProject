package Exceprionhandling;

public class nestedtrycatch {

	public static void main(String[] args) {
	try {
	      //System.out.println("first try block");
          int value = 100;
          int  result = 100/2;
          
          try 
           {
        	  System.out.println("second try block");
        	int[] a = new int[3];
        	a[5]=9;  
           }catch(Exception e) {
        	   e.printStackTrace();
        	 System.out.println("second catch");  
           }
       }catch(Exception e) {
    	   e.printStackTrace();
    	   System.out.println("first catch");
       }
	
}
}