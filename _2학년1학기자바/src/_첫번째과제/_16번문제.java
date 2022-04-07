package _첫번째과제;

public class _16번문제 {
	public static void main(String[] args) {
		int result =0;
		for (int i = 1; i < 11; i++) {
			if(i!=10) {
			System.out.print(i + " + ");
			}else {
				System.out.print(i + " = " );
			}
			result +=i;
		}System.out.println(result);
	}

}
