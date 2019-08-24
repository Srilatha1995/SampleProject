package Encapsulation;

public class BankLoan {
	private String name;
	private int age;
	private int amount;


public void setName(String name)
{
	this.name = name;
}
public void setAge(int age)
{
	if(age>=18&&age<=60)
	this.age = age;
	else
	System.out.println("enter valid age");
}
public void setAmount(int amount)
{
	if(amount>=1000&&amount<=1000000)
	this.amount=amount;
	else
		System.out.println("Enetr valid amount");
}
public String getName()
{
	return name;
}
public int getAge()
{
	return age;
}
public int getAmount()
{
	return amount;
}

}