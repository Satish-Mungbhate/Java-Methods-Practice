package string;

public class SC {

	public static void main(String[] args) {
		String s= "  Satish  ";
		System.out.println(s.startsWith("  Sat"));
		System.out.println(s.startsWith("ish  "));
		
		System.out.println(s.endsWith("ish  "));
		System.out.println(s.endsWith("  sat"));
		
		System.out.println(s.replace('a', 'i'));
		
		System.out.println(s.trim());
		
		s=s.concat("mungbhate");
		System.out.println(s);

	}

}
