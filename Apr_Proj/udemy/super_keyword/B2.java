package super_keyword;

public class B2 extends B1 {
	B2()                      //child class constructor no need to call the consructor using object default constructor is called
	                      //The same way parent class constructor is also called without any object as the child constructor called
	{
		super.a=a;
		System.out.println("B2 constructor");
	}
	
	public void snake()
	{
		super.b=b;
		super.Animal();
		System.out.println("Snake method");
		this.cat();
	}
    public void cat()
    {
    	System.out.println("Cat method");
    }
	public static void main(String[] args) {
		B2 b = new B2();
		b.snake();
		B1 bb = new B1();
		bb.Bird();

	}

}
