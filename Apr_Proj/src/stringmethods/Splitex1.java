package stringmethods;

public class Splitex1 {

	public static void main(String[] args) {
          String str1="January Febraury March April May";
          String str2="June July August September";
          System.out.println("Length of the first string "  +  str1.length());
          System.out.println("Length of the second string "  +  str2.length());
          String[] arr1 = str1.split(" ");
          System.out.println("length of the frst array " + arr1.length);
          for(int i = 0;i<arr1.length;i++)
          {
        	  System.out.println(arr1[i]);
          }
          String[] arr2 = str2.split(" ");
          System.out.println("length of the 2nd array " + arr2.length);
          for(int i=arr2.length-1;i>=0;i--)
          {
        	  System.out.println(arr2[i]);
          }
	}

}
