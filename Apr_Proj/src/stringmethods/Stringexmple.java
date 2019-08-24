package stringmethods;

public class Stringexmple {

	public static void main(String[] args) {
    String str = "srilatha singasani aarush riya" ;
    System.out.println("length of the sting:"+str.length());
    String[] arr = str.split(" ");
    System.out.println(arr.length);
   /* for(int i = 0;i<arr.length;i++)//to split the string from left to right
    {
    	System.out.println(arr[i]);
    }*/
    for(int i = arr.length-1;i>=0;i--)//to split the string from right to left
    {
    	System.out.println(arr[i]);
    }
	}

}
