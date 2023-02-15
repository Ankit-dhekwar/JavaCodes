package Atm_application;

import java.util.Scanner;
class atm_driver 
{
	public static void main(String[] args) 
	{
		Account a=new Account(123,111,1000);/*account ,pass,balance*/
         Scanner sc=new Scanner(System.in);
         for (; ; )
      {
          System.out.println("1.cheeck balance  2.Withdraw 3.deposit 4.exit");
          switch(sc.nextInt())
        {
         case 1:
         System.out.println(a.getBalance());
         break;
         
         case 2:
         a.setwithdraw();
         break;
 
         case 3:
         a.setDeposite();
         break;
   
         case 4:
         System.exit(0);
	
        }
       }
	}
}
