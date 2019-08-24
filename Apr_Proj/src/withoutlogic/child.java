package withoutlogic;
 
public class child extends abtest {
	
	public void m1()        //abstract method
	{
		System.out.println("m1 method");
	}
	
	public void m2()    //abstract method
	{
		System.out.println("m2 method");
	}




	public static void main(String[] args) {
     abtest t = new child();
     t.m1();
     t.m2();
     t.m3();	//normal method
	}

}
