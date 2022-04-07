package _첫번째과제;

public class _8번문제 {
	public static void main(String[] args) {
		int result =0;
		for (int i = 1; i < 101; i++) {
			if(i%2==0) {
			result +=i;
			}
		}
		System.out.println("1부터 100까지 짝수 합 : " + result);
	}
}
