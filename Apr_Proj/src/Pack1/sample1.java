package Pack1;

public class sample1 {
	static int a =10;
	static int b = 20;
	 public void m1()
	 {
		 System.out.println(a+b);
	 }

	 public void m2()
	 {
		 System.out.println(b-a);
	 }
	 public static void m3()
	 {
		 System.out.println(a*b);
	 }
	public static void main(String[] args) {
		sample1 s = new sample1();
		s.m1();
        s.m2();
        sample1.m3();
        
	}

}
