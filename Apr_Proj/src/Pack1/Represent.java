package Pack1;

public class Represent {
    int p = 10;
    int q = 22;
    static int t = 33;
    static int s = 44;
    public void m1(int p,int q)
    {
    	System.out.println(p+q);
    	System.out.println(this.p+this.q);
    }
    public static void m2(int t,int s)
    {
    	System.out.println(t+s);
    }
    public static void main(String[] args) {
		Represent r = new Represent();
		r.m1(11, 22);
		m2(1,2);
	}

}
