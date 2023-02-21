package Hotel;

public class hotel {
	food f;
	
	public void addfood(food f)
	{
		if(this.f==null)
		{
			this.f=f;
			System.out.println("order confirmed");
			System.out.println("please wait");
		}
		else
		{
			System.out.println("not possible!!!");
		}
	}
	
	public void cancelorder()
	{
		if(f!=null)
		{
			f=null;
			System.out.println("order cancelled");
		}
		else
		{
			System.out.println("first order");
		}
	}
	public void displayfood()
	{
		if(f!=null)
		{
			if(f instanceof veg)
			{
				veg v1=(veg)f;
				System.out.println(v1.name);
				System.out.println(v1.qty);
			}
			else
			{
				nonveg nv=(nonveg)f;
				System.out.println(nv.name);
				System.out.println(nv.qty);
			}
		}
		else
		{
			System.out.println("first order");
		}
	}
}
