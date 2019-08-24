package stringmethods;

public class seperatechar {

	public static void main(String[] args){
		String str = "ABCDefgh1999@gmail.com";
		
		for(int i = 0;i<str.length();i++)
		{
			char c =str.charAt(i);
			
			/* if(Character.isDigit(c))//For retrieving digits
			 {
				 System.out.println(c);
			 }*/
		   /* if(Character.isLetter(c))//For retrieving Alphabetic letters
			{
				System.out.print(c);
			}*/
			/*	if(Character.isUpperCase(c))//For retrieving Upper case
			{
				System.out.print(c);
			}*/
		  /* if(Character.isLowerCase(c))//For retrieving Lower case
			{
				System.out.print(c);
			}*/
		  /* if(Character.isLetterOrDigit(c)) //For retrieving letters n digits
			{
				System.out.print(c);
			} */
			if(!Character.isLetterOrDigit(c)) //For retrieving Special charcters
			{
				System.out.print(c);
			}
			
		}
    }

}
