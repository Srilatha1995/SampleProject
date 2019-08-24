package Interface;

public class Display2 implements Student{
	
	public void displaystudent() {
		
		System.out.println("Srivani");
	}

	public void collegeinfo() {
		System.out.println("College name is GNIT");
	}

	public void branch() {
		System.out.println("branch is ECE");
		
	}


public static void main(String[] args) {
	Student s1 = new Display2();
	Student s2 = new Display();
	
	s1.displaystudent();
	s1.collegeinfo();
	s1.branch();
	
	System.out.println("***********************");
	s2.displaystudent();
	s2.collegeinfo();
	s2.branch();

}
}