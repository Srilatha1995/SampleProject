package Pack1;

public class sample {
   static int a=30;
    public void m1()
    {
    	int abc = 45;
    	System.out.println(abc+a);
    }
    public void m2()
    {
    	System.out.println(a);
    }
	public static void main(String[] args)
	{
		
		 sample s = new sample();
		 s.m1();
		 System.out.println(sample.a);
	}

}

