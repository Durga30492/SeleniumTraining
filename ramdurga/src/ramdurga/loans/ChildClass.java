package ramdurga.loans;

public class ChildClass extends FirstAbstract {

	public static void main(String[] args) {
		ChildClass c=new ChildClass();
		c.m2();
		//c.m1();

	}

	@Override
	public void m2() {
		System.out.println("i am m2 overridden in childclass");
		
	}

}
