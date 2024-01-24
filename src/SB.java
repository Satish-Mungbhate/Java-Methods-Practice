
public class SB {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Satish");
		
		System.out.println(sb.length());
		
		System.out.println(sb.capacity());
		
		System.out.println(sb.charAt(4));
		
		sb.setCharAt(2, 'u');
		System.out.println(sb);
		
		sb.setLength(3);
		System.out.println(sb);
		
		sb.append(true);
		System.out.println(sb);
		
		System.out.println(sb.insert(5, 'i'));
		
		System.out.println(sb.reverse());
		
		sb.delete(0, 3);
		System.out.println(sb);
		
		sb.trimToSize();
		System.out.println(sb);
		System.out.println(sb.capacity());

	}

}
