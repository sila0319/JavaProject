package _첫번째과제;

public class _30번문제 {
	public static void main(String[] args) {
		int count =9;
		for (int i = 1; i < 101; i++) {
			if(i%10==0) {
				System.out.println();
			}else if(i%10==count&&i!=9) {
				System.out.print(" ");
				count--;
				System.out.printf("*");
			}else {
				System.out.printf("*");
			}
		}
		
	}
}	