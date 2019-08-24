package Polymorphism;

public class overload {
	 int a;
	 static int b = 100;
	 public void add(int a,int b)
	 {
		 System.out.println(a+b);
		 System.out.println(this.a);
	 }
	 public void add(int a,int b,int c)
	 {
		 System.out.println(a+b+c);
	 }

	public static void main(String[] args) {
         overload l  =new overload();
         l.add(10, 20);
         l.add(1, b, 3);
	}

}