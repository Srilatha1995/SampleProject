
public class Array {
	public static void A1(int arr[]) {      //Passing array to method
		int min = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min = arr[i];
			}
		}
		System.out.println("minimum element is "+min);
	}
	
	public static int[] getArray() {          //1returning array from the method
		return new int[] {10,20,30,40,11,12,9,8,7};
	}

	public static void main(String[] args) {
		Array a = new Array();
		int arr1[] = {12,13,4,1,8,9,6};
		a.A1(arr1);
			
 		int arr2[] = a.getArray();
 		System.out.println("Array element is "+arr2[4]);
  
	}

}
