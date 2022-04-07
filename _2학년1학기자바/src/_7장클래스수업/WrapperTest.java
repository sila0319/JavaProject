package _7장클래스수업;

public class WrapperTest {
	public static void main(String[] args) {
		int i = 0;
		String s = "123";
		
		i = Integer.parseInt(s);
		System.out.println(i);
		
		String a = Integer.toBinaryString(i);
		System.out.println(a);
		a = Integer.toOctalString(i);
		System.out.println(a);
		a = Integer.toHexString(i);
		System.out.println(a);
		
		System.out.println(new Integer(75).doubleValue());
	
	}
}
