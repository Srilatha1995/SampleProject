package Pack1;

public class methodCall {
	 public void m1(int a,int b) 
	 {
	   System.out.println("m1 method");
	   System.out.println(a*b);
	   m2(5,4);
	  
	 }
    public void m2(int p,int q)
    {
    	System.out.println("m2 method");
    	System.out.println(p-q);
    	m3("hello","world");
    	
    }
    public void m3(String r, String s)
    {
        System.out.println("m3 method");
        System.out.println(r+s);
    }
   public static void main(String[] args) {
		methodCall m = new methodCall();
		m.m1(3, 4);
	}

}
