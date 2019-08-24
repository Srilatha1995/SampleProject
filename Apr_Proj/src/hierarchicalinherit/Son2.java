package hierarchicalinherit;

public class Son2  extends Father{

	 public void gold() 
	 {
		 System.out.println("gold");// Here son1 extends father properties and son2 also extends father properties -- hierarchical inheritance
	 }
	 
	 public void diamond()
	 {
		 System.out.println("diamond");
	 }
	public static void main(String[] args) {
       Son2 s2 = new Son2();
       
       s2.gold();
       s2.diamond();
       
       s2.villas();
       s2.fields();
       
       
	}

}
