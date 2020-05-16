package ramdurga.loans;



public class Emploans {
	int eno;
	String name;
	public Emploans()
	{
		System.out.println("i am default constructor");
	}
	public Emploans(int eno,String name)
	{
		this.eno=eno;
		this.name=name;
	}
	
	
	
	
	public static void main(String[] args) {
		
		Emploans e1 =new Emploans(); 
		
	    System.out.println(e1.eno);
	    System.out.println(e1.name);
	    Emploans e2 =new Emploans(1745,"durga");
	   
	    System.out.println(e2.eno);
	    System.out.println(e2.name);
	   
	    
	}

}
