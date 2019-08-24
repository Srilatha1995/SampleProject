
package Polymorphism;

public class Test extends classA {
	public void m1()   //overriding method
	{
		System.out.println("mango");
	}
	public void m3()
	{
		System.out.println("child  class m3 method");
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.m2();
		t.m3();
		System.out.println("################");
		
		classA c = new Test();
		c.m1();
		c.m2();
		

	}

}
