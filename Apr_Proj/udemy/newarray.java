
public class newarray {

	public static void main(String[] args) {
      int arr[] = {10,9,2,5,4,7};
      int min = arr[0];
      for(int i=1;i<arr.length;i++)
      {
    	  if(min>arr[i])
    	  {
    		  min=arr[i];
    	  }
      }
      System.out.println("minimum value  is"+min);
	}

}
