package Stringconcept;

public class String2 {

	public static void main(String[] args) {
   String str = "He is jon He is good boy";
   String[] str2 = str.split(" ");
   for(int i=0;i<str2.length;i++)
   {
	   System.out.println(str2[i]);
   }
   String[] join = {"ABCD","EFGH","1234"};
   String ex = String.join(" ", join);
   System.out.println(ex);
   
   
   
   
   
   
	}

}
