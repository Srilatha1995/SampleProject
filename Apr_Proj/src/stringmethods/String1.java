package stringmethods;

public class String1 {

	public static void main(String[] args) {
      String s1 = "Testing";
      String s2 = "tesTing";
      if(s1.equals(s2))
      {
    	  System.out.println("Equals");
      }
      else
      {
    	  System.out.println("Not Equals");
      }
      if(s2.contains("ting"))
      {
    	  System.out.println("Exists");
      }
      else
      {
    	  System.out.println("Not Exists");
      }
      if(s1.equalsIgnoreCase(s2))
      {
    	  System.out.println("Both are Equal");
      }
      else
      {
    	  System.out.println("Both are not Equal");
      }
	}

}
