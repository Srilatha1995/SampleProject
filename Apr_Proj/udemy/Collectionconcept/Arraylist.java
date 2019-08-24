package Collectionconcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class Arraylist {

	public static void main(String[] args) {
     List<Integer> al = new ArrayList<Integer>();
     al.add(10);
     al.add(20);
     al.add(10);
     al.add(39);
     al.add(28);
     System.out.println("Arraylist elements are"+al);
  /*   List al1 = new ArrayList<>();
     al1.addAll(al);
     System.out.println(al1);
     System.out.println("************");
     Iterator itr = al1.iterator();    //iterator method
     while(itr.hasNext())
     {
      	 System.out.println(itr.next());
     }
     al1.remove(3);  //remove method
     System.out.println(al1);
     System.out.println(al.get(2));   //get method
     al1.set(3, "Sri");     //set method
     System.out.println(al1);
     
   */    //Arraylist to array
  /*   System.out.println("Array elements are");
     Object o[] = al.toArray();
     for(Object oo:o)
     {
    	 System.out.println(oo);
     }*/
     
     //Converting list to treeset
     TreeSet<Integer> ts = new TreeSet<Integer>(al);
     Iterator i = ts.iterator();
     while(i.hasNext())
     {
    	 System.out.println(i.next());
     }
     
    }
	
	

}
