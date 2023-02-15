package bank_project;

import java.util.Scanner;

public class Bank {
	Account a;

	Scanner sc=new Scanner(System.in);

	public void AddAccount()
	{
	System.out.println("Enter the Accountnumber");
	long Accountno=sc.nextLong();

	System.out.println("Enter the password");
	int psw=sc.nextInt();

	System.out.println("Enter the deposit");
	double balance=sc.nextDouble();

	System.out.println("Enter the name of Account holder");
	String AccountHolderName=sc.next();

	a=new Account( Accountno, psw, balance,AccountHolderName);
	System.out.println("The account is created");	
	}

	public void RemoveAccount()
	{
	a=null;	
	}

	public void display()
	{
	System.out.println("enter the password");
	int p1=sc.nextInt();  //int a=sc.nextInt();

	if (a.getpsw()==p1)
	{
	System.out.println(a.getAccountHolderName());
	System.out.println(a.getbalance());
	}
	else
	{
		System.out.println("enter the correct password");
	}	
	}
	}


