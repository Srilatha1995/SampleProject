package ArrayConcept;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("testing");
		hs.add("masters");
		hs.add("technologies");
		System.out.println(hs.size());
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("-----------------------");
		hs.add("testing");          //hash set will take the duplicates but it will not count at the output
		hs.add("hyderbad");
		System.out.println(hs.size());
	    itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	

	}

}
