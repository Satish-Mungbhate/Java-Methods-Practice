package constructor;

public class D {
	D()
	{
		System.out.println("I am Satish");
	}
	
	D(int x)
	{
		System.out.println("I am Student");
	}
	public static void main(String[] args) {
		  D d=new D();
		  D d1=new D(20);
	}

}
