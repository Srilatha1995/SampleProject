package Encapsulation;

public class ICICIBank extends BankLoan {

	public static void main(String[] args) {
    BankLoan b = new BankLoan();
    
    b.setName("John");
    b.setAge(50);
    b.setAmount(6000);
  
    System.out.println("Name is: "+b.getName());
    System.out.println("Age is:"+b.getAge());
    System.out.println("Amount is:"+b.getAmount());
  }

}
