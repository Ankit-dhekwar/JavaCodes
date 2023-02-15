package bank_project;

import java.util.Scanner;
public class BankApplication
{
		public static void main(String[] args) 
		{
	     Scanner sc=new Scanner(System.in);
	     Bank b=new Bank();
	        for (; ; )
	      {
			System.out.println("1.Add account 2.remove account 3.Display account 4.exit");
	      
	        int c=sc.nextInt();
	        switch(c)
	      {
			case 1:
	        b.AddAccount();
	        break;

	        case 2:
	        b.RemoveAccount();
	        break;

	        case 3:
	        b.display();
	        break;
	        
	        case 4:
	        System.exit(0);
	        
	      }
	    }
	}
}

