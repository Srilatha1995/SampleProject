package Collectionconcept;

import java.util.HashSet;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
    HashSet hs = new HashSet<>();
    hs.add(10);
    hs.add(23);
    hs.add("Aarush");
   // hs.add(10);
    hs.add(29);
    System.out.println(hs);
    boolean h = hs.contains(10);
   System.out.println(h);
   hs.remove(22);
   System.out.println(h);
  }

}
