package _첫번째과제;

public class _18번문제 {
	public static void main(String[] args) {
		int result =0;
		String number ="1";
		
		for (int i = 1; i < 11; i++) {
			if(i%2!=0) {
				result +=i;
				System.out.printf("<");
				for (int j = 0; j < i; j++) {
					System.out.printf("%s",number);
					if(j+1!=i) {
						System.out.printf("+");
					}
				}
				if(i!=9) {
				System.out.printf("> + ");
				}else {
					System.out.printf("> = ");
				}
			}
		}System.out.println(" "+result);
	}
}