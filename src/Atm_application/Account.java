package Atm_application;

import java.util.Scanner;
class Account 
{
  private int acctno;
  private int psw;
  private double bal;
  Scanner sc=new Scanner(System.in);
  
	Account(int acctno,int psw,double bal)
	{
    this.acctno=acctno;
    this.psw=psw;
    this.bal=bal;
	}
//for initiliaing non static memeber

    public double getBalance()   //for accessing initialize data
    {
		System.out.println("Enter the password");
        int psw=sc.nextInt();
 
        if (psw==this.psw)
        {
           return bal;
        }
        else 
        {
			System.out.println("Enter the correct password");
           return 0.0;
        }
    }
     
    public void setDeposite()  //reinitialize
    {
		System.out.println("enter the money");
        double money=sc.nextDouble();
        bal=bal+money;
    }

    public void setwithdraw()    //reinitilaize
    {
		System.out.println("Enter the password");
        int psw=sc.nextInt();

        if (psw==this.psw)
          {
			System.out.println("Enter the money");
            double money=sc.nextDouble();
              if (money<=bal)
              {
                bal=bal-money;
              }
              else
              {
				System.out.println("Insuffcient funds");
              }
          }
         else
           {
			System.out.println("Incorrect password");
           }
        
     } 
}
