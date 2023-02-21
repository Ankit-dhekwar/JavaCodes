package Hotel;

import java.util.Scanner;

public class hoteldriver {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	hotel h=new hotel();
	for(;;)
	{
		System.out.println("1:add order 2:cancel order 3:display order 4:exit");
		switch(sc.nextInt())
		{
		case 1:
		{
			System.out.println("1. veg  2.non-veg");
			switch(sc.nextInt())
			{
			case 1:
			{
			System.out.println("enter food");
		    String name=sc.next();
		    System.out.println("enter qty");
		    int qty=sc.nextInt();
		    veg v=new veg(name,qty);
		    h.addfood(v);
		    break;
			}
			case 2:
			{
				System.out.println("enter food");
			    String name=sc.next();
			    System.out.println("enter qty");
			    int qty=sc.nextInt();
			    nonveg nv=new nonveg(name,qty);
			    h.addfood(nv);
			    break;
			}
			}
		}
		
		case 2:
		{
			h.cancelorder();
			break;
		}
		case 3:
		{
			h.displayfood();
		}
		case 4:
		{
			System.exit(0);
		}
		}
	}
}
}
