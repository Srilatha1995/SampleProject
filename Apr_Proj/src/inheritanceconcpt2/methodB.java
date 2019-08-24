package inheritanceconcpt2;

public class methodB extends methodA {
     
	public void m2()
	{
		super.m1();
		System.out.println("m2 method");
		this.m3();
	}
	public void m3() {
		System.out.println("m3 method");
	}
}
