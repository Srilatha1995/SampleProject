package Stringconcept;

public class String1 {

	public static void main(String[] args) {
      String name = "Srilatha Singasani";
      String name2=" Srilatha Singasani";
      String college = " Bhoj Reddy";
      System.out.println("comparison using equals method:"+name.equals(name2));//String liters can be compared using equals method
      
     /* String name1 = new String("Srilatha");
      String name3 = new String("Srilatha");
      System.out.println("Comparison of object values: "+name1.equals(name3));//object values can also be compared using equals method
      System.out.println(name1==name3);//object values cannot be compared using comparison operator  */
      
      System.out.println("***************");
      String str = name+name2;
      System.out.println("comparison method using + operator: "+str);
      String str1 = name.concat(name2).concat(college);
      System.out.println("after concatinating: "+str1);
      System.out.println("****************");
      System.out.println("After trim: "+name.trim()+name2.trim());
      System.out.println("#############################");
      System.out.println("Length of the string is : "+name.length());
      char[] str3 = name.toCharArray();
      System.out.println("characters are :");
      for(int i=0;i<str3.length;i++)
      {
    	  System.out.println(str3[i]);
      }
    
	}

}
