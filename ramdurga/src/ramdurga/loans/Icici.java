package ramdurga.loans;

public class Icici implements Rbii 
{

	public static void main(String[] args)
	{
		Icici i=new Icici();
		i.deposit();
		i.withdrawl();
	}

	@Override
	public void withdrawl()
	{
		System.out.println("i am overridden withdrawl from Icici");
	}

	@Override
	public void deposit()
	{
		System.out.println("i am overridden deposit from Icici");
		
	}

	
}

