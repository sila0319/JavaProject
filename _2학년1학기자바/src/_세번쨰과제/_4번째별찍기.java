package _세번쨰과제;


	import java.util.Scanner;
	public class _4번째별찍기 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int sum = sc.nextInt();
			
			for (int i = 0; i < sum; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < sum-i; j++) {
					System.out.print("*");
					
				}
				
				System.out.println("");
			}
			
		
			
		}
		}



