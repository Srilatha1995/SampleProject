package Pack1;

public class This {
	int a;
	int b;
    public void m1(int a,int b)
    {
    	this.a = a;
    	this.b = b;
    	System.out.println(a+b);
    	
    }
    public void m2()
    {
    	System.out.println(a+b);
    }
	public static void main(String[] args) {
	This t = new This();
	t.m1(100, 200);
	t.m2();

	}

}
