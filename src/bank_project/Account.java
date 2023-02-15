package bank_project;

public class Account {
	 private long Accountno;
	 private int psw;
	 private double balance;
	 private String AccountHolderName; 
	Account(long Accountno,int psw,double balance,String AccountHolderName)
	{
		this.Accountno=Accountno;
	    this.psw=psw;
	    this.balance=balance;
	    this.AccountHolderName=AccountHolderName;
	}

	public long getAccountno()
	{
		return Accountno;
	}

	public void setAccountno(long Accountno)
	{
		this.Accountno=Accountno;
	}

	public int getpsw()
	{
		return psw;
	}
	public void setpsw(int psw)
	{
		this.psw=psw;
	}

	public double getbalance()
	{
		return balance;
	}

	public void setbalance(double balance)
	{
		this.balance=balance;
	}

	public String getAccountHolderName()
	{
		return AccountHolderName;
	}

	public void setAccountHolderName(String AccountHolderName)
	{
		this.AccountHolderName=AccountHolderName;
	}

}
