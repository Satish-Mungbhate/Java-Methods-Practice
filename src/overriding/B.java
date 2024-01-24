package overriding;

public class B extends A{
	public void M1()
	{
		System.out.println("BIke");
	}
	
	public void M2()
	{
		System.out.println("Lalit");
	}
	public static void main(String[] args) {
		B b=new B();
		b.M2();
		b.m1();
		b.M1();
	}

	
}
