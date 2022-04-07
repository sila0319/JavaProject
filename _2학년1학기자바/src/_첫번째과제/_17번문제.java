package _첫번째과제;

public class _17번문제 {
	public static void main(String[] args) {
		int result =0;
		
		for (int i = 1; i < 11; i++) {
			if(i%2==0) {
				result +=i;
				if(i!=10) {
					System.out.printf("%d + ",i);
				}else {
					System.out.printf("%d = %d",i,result );
				}
			}
		}
	}

}
