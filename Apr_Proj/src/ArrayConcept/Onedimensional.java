package ArrayConcept;

public class Onedimensional {

	public static void main(String[] args) {
   int[]  a = new int[3];
    a[0]=1;
    a[1]=2;
    a[2]=3;
    System.out.println("array value is " +a[2]);
    for(int i=0;i<a.length;i++)
    {
    	System.out.println(a[i]);
    }
    int sum = a[0]+a[1]+a[2];
    System.out.println("------------");
    System.out.println(sum);
   
	}

}
