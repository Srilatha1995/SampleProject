package ArrayConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class Arraylist {

	public static void main(String[] args) {
		List mylist = new ArrayList();
		mylist.add("P");
		mylist.add("R");
		mylist.add("Q");
		mylist.add("S");
		System.out.println(mylist.size());
		System.out.println("valueis: " + mylist.get(2));
		
		for(int i=0;i<mylist.size();i++)
		{
			System.out.println(mylist.get(i));
		}  
		System.out.println("----------------");
        mylist.remove(3);
        
        for(int i=0;i<mylist.size();i++)
		{
			System.out.println(mylist.get(i));
		}
        System.out.println("------------------");
        mylist.clear();
        
        for(int i=0;i<mylist.size();i++)
		{
			System.out.println(mylist.get(i));
		}
         System.out.println("----------------------");
        mylist.add("Hyderabad");                      //Array list will accept duplicate values
        mylist.add("Banglore"); 
        System.out.println(mylist.size());
        
        for(int i=0;i<mylist.size();i++)
		{
			System.out.println(mylist.get(i));
		}
        System.out.println("***************************");
        mylist.set(1, "mumbai");                    //set method inserts data into array list
        System.out.println(mylist.size());

        for(int i=0;i<mylist.size();i++)
		{
			System.out.println(mylist.get(i));
		}
        
	}

}
