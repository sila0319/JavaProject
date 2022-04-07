package _세번쨰과제;


	import java.util.Scanner;

	public class _5번째과제 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int s = 1;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}for (int j = 0; j < 2*n-s; j++) {
					System.out.print("*");
				}
				System.out.println("");
				s += 2;
			}
			
		}
	}

