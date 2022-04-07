package _첫번째과제;

public class _19번문제 {
	public static void main(String[] args) {
		int result =0;
		String number ="3";
		
		for (int i = 1; i < 11; i++) {
			if(i%3==0) {
				result +=i;
				System.out.printf("<");
				for (int j = 0; j < i/3; j++) {
					System.out.printf("%s",number);
					if(j!=i/3-1) {
						System.out.printf("+");
					}
				}
				if(i!=9) {
				System.out.printf("> + ");
				}else {
					System.out.printf("> = "+result);
				}
			}
		}
	}
}