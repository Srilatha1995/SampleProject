package hierarchicalinherit;

public class Son1 extends Father {
	public void bike()
	{
		System.out.println("bike");
	}
    public void car()
    {
    	System.out.println("car");
    }

public static void main(String[] args) {
	Son1 s1 = new Son1();
	s1.bike();
	s1.car();
	
	s1.fields();
	s1.villas();
	
}
}