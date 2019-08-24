package ArrayConcept;

import java.util.Hashtable;
import java.util.Map;


public class Hashmap {

	public static void main(String[] args) {
		Hashtable<Integer, String> t = new Hashtable<>();
		t.put(101, "Sri");
		t.put(102, "Latha");
		t.put(103,"Vani");
		t.put(104, "Aarush");
		for(Map.Entry<Integer, String> m : t.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue()+" ");//Ascending order
		}
		t.remove(101);
		System.out.println(t);
	    boolean b =	t.contains("Sri");
		System.out.println(b);
		t.put(101, "Mouna");
		t.hashCode();
		System.out.println(t);
	}

}
