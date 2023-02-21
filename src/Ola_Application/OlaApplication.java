package Ola_Application;

public class OlaApplication {
public static void main(String[] args) {
	ola o=new ola();
	for(;;)
	{
		System.out.println("1:make a ride  2:cancel ride 3:make a payment 4:exit");
		switch(o.sc.nextInt())
		{
		case 1:
		{
			o.makeride();
			break;
		}
		case 2:
		{
			o.cancelride();
			break;
		}
		case 3:
		{
			o.makeApayment();
		}
		case 4:
		{
			System.exit(0);
		}
		}
	}
}
}
