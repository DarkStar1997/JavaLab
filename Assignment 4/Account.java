import java.util.*;
class Account
{
	String CustomerName, AccountType; int acc_no; double balance;
	Account(String a, int b, String c, double d)
	{
		CustomerName = a;
		acc_no = b;
		AccountType = c;
		balance = d;
	}
	void deposit(double amt)
	{
		balance += amt;
	}
	void display()
	{
		System.out.println("Customer Name: "+CustomerName);
		System.out.println("Accout type: "+AccountType);
		System.out.println("Account Number: "+acc_no);
		System.out.println("Balance: "+balance);
	}
}
class SavingsAccount extends Account
{
	double interest; double rate;
	SavingsAccount(String a, int b, String c, double d, double e)
	{
		super(a, b, c, d);
		rate = e;
	}
	void withdraw(double amt)
	{
		if( amt > balance )
			System.out.println("Insufficient balance!!! Cannot withdraw.");
		else
		{
			balance -= amt;
		}
	}
	void ComputeInterest()
	{
		interest = rate * balance / 100;
	}
	void display()
	{
		System.out.println("\n\n");
		super.display();
		System.out.println("Interest: "+interest);
		System.out.println("Rate: "+rate);
		System.out.println("\n\n");
	}
}
class CurrentAccount extends Account
{
	int CheckbookNumber; double ServiceCharge;
	CurrentAccount(String a, int b, String c, double d, int ch_no)
	{
		super(a, b, c, d);
		CheckbookNumber = ch_no;
		ServiceCharge = 0;
	}
	void CheckMinBalance()
	{
		if( balance < 500 )
		{
			System.out.printf("Current balance of Rs. %f is less than 500\n", balance);
			System.out.println("Service charge of Rs. 10 has been added");
			ServiceCharge += 10;
		}
	}
	void withdraw(double amt)
	{
		if( amt > balance )
			System.out.println("Insufficient balance!!! Cannot withdraw.");
		else
		{
			balance -= amt;
			CheckMinBalance();
		}
	}
	void display()
	{
		System.out.println("\n\n");
		super.display();
		System.out.println("Checkbook number: "+CheckbookNumber);
		System.out.println("Service charge: "+ServiceCharge);
		System.out.println("\n\n");
	}
}
class Test
{
	public static void main(String args[])
	{
		SavingsAccount objs = new SavingsAccount("Ram", 1234, "Savings Account", 9000, 0.1);
		objs.display();
		objs.deposit(100);
		objs.withdraw(500);
		objs.ComputeInterest();
		objs.display();
		
		CurrentAccount objc = new CurrentAccount("Sam", 3412, "Current Account", 500, 12345678);
		objc.display();
		objc.withdraw(100);
		objc.deposit(300);
		objc.display();
	}
}
