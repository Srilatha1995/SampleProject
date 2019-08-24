package Abstraction;

public class A2 extends A1 {

	public void ATM() {
	System.out.println("withdraw money using ATM");	
	}
	public void mobilebanking() {
		System.out.println("Transfer money using mobiile banking");
	}
	
	public static void main(String[] args)
	{
		A1 a = new A2();
		a.ATM();
		a.mobilebanking();
		a.withdraw();
	}


}
