package Ola_Application;

import java.util.Scanner;

public class ola {
cab c;
Scanner sc=new Scanner(System.in);
public void makeride()
{
	System.out.println("1.Mini ---2.Prime ---3.sweden");
	switch(sc.nextInt())
	{
	case 1:
	{
		System.out.println("please enter your location");
		String x=sc.next();
		System.out.println("please enter your destination"); 
		String y=sc.next();
		System.out.println("please enter the distance between them");
		int km=sc.nextInt();
		
		c=new mini(x,y,km);
		System.out.println("your cab is on the way!");
		break;
	}
	
	case 2:
	{
		System.out.println("please enter your location");
		String x=sc.next();
		System.out.println("please enter your destination"); 
		String y=sc.next();
		System.out.println("please enter the distance between them");
		int km=sc.nextInt();
		
		c=new prime(x,y,km);
		System.out.println("your cab is on the way!");
		break;
	}
	case 3:
	{
		System.out.println("please enter your location");
		String x=sc.next();
		System.out.println("please enter your destination"); 
		String y=sc.next();
		System.out.println("please enter the distance between them");
		int km=sc.nextInt();
		
		c=new sweden(x,y,km);
		System.out.println("your cab is on the way!");
		break;	
	}
	}
}

public void cancelride()
{
	c=null;
	System.out.println("your ride is cancelled");
}

 public void makeApayment()
 {
	 if(c instanceof mini)
	 {
		 mini m=(mini)c;
		 System.out.println("from="+m.from);
		 System.out.println("To="+m.to);
		 System.out.println("money="+m.km*m.price);
		 
		 Double pay=sc.nextDouble();
		 if(pay>=m.km*m.price)
		 {
		 System.out.println("payment sucessful");
		 }
		 else
		 {
			 System.out.println("insufficient balance");
		 }
	 }
	 else if(c instanceof prime)
	 {
		 prime p=(prime)c;
		 System.out.println("from="+p.from);
		 System.out.println("To="+p.to);
		 System.out.println("money="+p.km*p.price);
		 
		 Double pay=sc.nextDouble();
		 if(pay>=p.km*p.price)
		 {
		 System.out.println("payment sucessful");
		 }
		 else
		 {
			 System.out.println("insufficient balance");
		 }
	 }
	 else if(c instanceof sweden)
	 {
		 sweden s=(sweden)c;
		 System.out.println("from="+s.from);
		 System.out.println("To="+s.to);
		 System.out.println("money="+s.km*s.price);
		 
		 System.out.println("please enter the amount ");
		 Double pay=sc.nextDouble();
		 if(pay>=s.km*s.price)
		 {
		 System.out.println("payment sucessful");
		 }
		 else
		 {
			 System.out.println("insufficient balance");
		 }
	 }
	 }
 }


