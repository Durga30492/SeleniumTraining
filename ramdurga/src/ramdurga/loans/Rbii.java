package ramdurga.loans;

public interface Rbii { 
	
 public void withdrawl();
public void deposit();
public static void main(String[] args) {
	
	Rbii i;
	i=new Hdfc();
	i.withdrawl();
	i.deposit();
	i=new Icici();
	i.withdrawl();
	i.deposit();
}
}