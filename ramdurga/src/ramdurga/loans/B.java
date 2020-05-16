package ramdurga.loans;

public class B {
	public void m2() {
		System.out.println("i am m2 from class B");
	}

	public static void main(String[] args)
	{
		B obj=new B();
		obj.m2();
		A obj1=new A();//has a relationship
		obj1.m1();
	}

}
