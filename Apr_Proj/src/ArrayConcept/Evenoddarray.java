package ArrayConcept;

public class Evenoddarray {

	public static void main(String[] args) {
      int a[] = {0,2,3,4,5,6};
      for(int i=0;i<a.length;i++)
      {
    	 // System.out.println(a[i]);
    	  if(a[i]%2==0)
    	  {
    		  System.out.println(a[i]+ " :even nbr ");
    	  }
    	  if(a[i]%2!=0)
    	  {
    		  System.out.println(a[i]+" :odd nbr ");
    	  }
      }
      
	}

}
