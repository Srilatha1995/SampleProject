package singlelvlinherit;

public class son extends Father {
	public void house()
	{
		System.out.println("house");
	}
   public void car()
   {
	   System.out.println("car");
   }

	public static void main(String[] args) {  //Here son extends fathers properties --single level inheritance
       son s=new son();
       s.house();
       s.car();
       
       s.property();
       s.fame();
       
       
       
	}
	

}
