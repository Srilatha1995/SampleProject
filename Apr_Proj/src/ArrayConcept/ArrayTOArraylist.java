package ArrayConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayTOArraylist {

	public static void main(String[] args) {
		String a[] = {"Sri","sai","technologies","limited"};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Array Elements are: "+a[i]);	
		}
		//Converting array to array list
		
		//Method1
		
		/*  List<String> Al = new ArrayList<String>(Arrays.asList(a));
		System.out.println("After convertion:"+Al);
		Al.add("Hyderabad");
		Al.add("India");
		System.out.println("After adding :"+Al); */
		
		//Method2
		
	/*	List<String> A1 = new ArrayList<String>();
		Collections.addAll(A1,a);
		System.out.println(A1);      */
		
		//Method3
		
		List<String> A2 = new ArrayList<String>();
		for(String AA : a)  
		{
			A2.add(AA);
		}
        System.out.println("Arraylist elements are: "+A2);			
			
		
		
		
		
		
		
     
	}

}
