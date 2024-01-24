package constructor;

public class FF {
	FF()
	{
		System.out.println("hello i am satish");
	}
	
	FF(int x)
	{
		this(10.81);
		System.out.println(x);
	}
	
	FF(double d)
	{
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		FF f=new FF('z');
	}

}
