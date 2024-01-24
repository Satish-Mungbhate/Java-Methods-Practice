package overloading;

public class A {
	public void M1()
	{
		System.out.println("hello");
	}
	
	public void M1(int x)
	{
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		A a=new A();
		a.M1();
		a.M1(10);
	}

}
