package stringmethods;

public class Splitmethod {

	public static void main(String[] args) {
      String str = "Software Development Engineer testing";
      System.out.println("length of the string " +str.length());
      String[] arr = str.split(" ");
      System.out.println(arr.length);
      for(int i=0;i<arr.length;i++)
      {
    	  System.out.println(arr[i]);
      }
	}

}
