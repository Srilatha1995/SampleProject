package Multilvlinherit;

public class Grandson1 extends Son {
	public void studying()
	{
		System.out.println("studying");//here grandson inherits son properties,son inherits fathers properties--multi level inheritance
	}
   public void playing()
   {
	   System.out.println("playing");
   }
	public static void main(String[] args) {
     
		Grandson1 gs= new Grandson1();
		gs.studying();
		gs.playing();
		
		gs.house();
		gs.car();
		
		gs.property();
		gs.playing();
		
	}

}
