package ArrayConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylist2 {

	public static void main(String[] args) {
		List mylist = new ArrayList();
		
		mylist.add("P");
		
		mylist.add("R");
		
		mylist.add("Q");
		
		mylist.add("S");
		
		System.out.println("Size is:"+mylist.size());
		
		for(int i=0;i<mylist.size();i++)
		{
			System.out.println(mylist.get(i));
		}  
		System.out.println("----------------");
       Collections.sort(mylist);
       for(int i=0;i<mylist.size();i++)
		{
			System.out.println(mylist.get(i));
		}
	}

}
