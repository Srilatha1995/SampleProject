package ArrayConcept;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

class Sample{
 public static void main(String args[]){
  //Creating HashSet and adding elements
	   //Creating HashSet and adding elements
	   ArrayList<String> list=new ArrayList<String>();
	   list.add("Ravi");
	   list.add("Vijay");
	   list.add("Ajay");
	   list.add("Ravi");
	   
	   HashSet<String> set=new HashSet(list);//Hashset will not allow duplicates using this we can delete duplicate values
	   set.add("Gaurav");
	   Iterator<String> i=set.iterator();
	   while(i.hasNext())
	   {
	   System.out.println(i.next());
	   }
	   System.out.println("************");
      TreeSet tset = new TreeSet<>(list);//tree set also doesnot allow dupliates using this we can sort the elements 
      Iterator i1 = tset.iterator();
      while(i1.hasNext())
      {
    	  System.out.println(i1.next());
      }
      
}
}
