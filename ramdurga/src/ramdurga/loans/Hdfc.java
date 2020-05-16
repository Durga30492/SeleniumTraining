package ramdurga.loans;

public class Hdfc implements Rbii
{

	public static void main(String[] args) 
	{
		Hdfc H=new Hdfc();
		H.withdrawl();
		H.deposit();
	}

	@Override
	public void withdrawl() {
		System.out.println("i am overridden withdrawl from Hdfc");
		
	}

	@Override
	public void deposit() {
		System.out.println("i am overridden withdrawl from Hdfc");
		
	}

	
}
