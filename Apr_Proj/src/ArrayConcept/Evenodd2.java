package ArrayConcept;

import java.util.Scanner;

public class Evenodd2 {

	public static void main(String[] args) {
     int n;
     Scanner s = new Scanner(System.in);
     System.out.println("Enter nbr  of elements in array");
     n = s.nextInt();
     int a[] = new int[n];
     System.out.println("Enter all elements");
     for(int i=0;i<n;i++)
     {
    	 a[i] = s.nextInt();
    	// System.out.println("odd nbrs are:");
    	 if(a[i]%2!=0)
    	 {
    		 System.out.println("odd nbr is "+a[i]);
    	 }
    	// System.out.println("even nbrs are");
    	 if(a[i]%2==0)
    	 {
    		 System.out.println("even nbr is "+a[i]);
    	 }
     }
	}

}
