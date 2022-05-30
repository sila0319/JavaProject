package _20장_패키지;

public class String_Buffer_Test1 {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Happiness depends upon ouselves");
		StringBuffer sb = new StringBuffer();
		StringBuffer su = new StringBuffer("10 + 20 = ");
		
		sb.append("Hello");
		
		System.out.println(sb);
		System.out.println(s);
		
		s.append(" By");
		System.out.println(s);
		s.delete(s.length()-2, s.length());
		System.out.println(s);
		
		su.append(10+20);
		su.insert(0, "수식 ");
		System.out.println(su);
		
	}

}
