package ArrayConcept;

import java.util.Arrays;

public class minmaxofarrey {

	public static void main(String[] args) {
     int a[] = {50,20,30,40,-50};
     Arrays.sort(a);
     System.out.println("minimum = "+a[0]);
     System.out.println("maximum= "+a[a.length-1]);
	}

}

