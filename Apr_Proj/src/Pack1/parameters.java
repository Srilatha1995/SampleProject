package Pack1;

public class parameters {

	public void m1(int a ,int b)
	{
		System.out.println(a+b);
	}
	public static void m2(int c,String s)
	{
		System.out.println(c);
		System.out.println(s);
	}
	public static void main(String[] args) {
		parameters p = new parameters();
		p.m1(11, 20);
	    m2(5,"hello");

	}

}
