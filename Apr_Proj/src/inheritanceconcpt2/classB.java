package inheritanceconcpt2;

public class classB extends classA {
	
	int a = 10;
	int b = 20;
	
	public void m1(int a, int b)
	{
		System.out.println(a+b);
		System.out.println(this.a+this.b);
		System.out.println(super.a+super.b);
	}

	public static void main(String[] args) {
		classB b = new classB();
		b.m1(100, 200);
		
		
	}

}
