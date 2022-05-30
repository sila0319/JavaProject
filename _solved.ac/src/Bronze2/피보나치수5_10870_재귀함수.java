package Bronze2;


	import java.util.Scanner;


	public class 피보나치수5_10870_재귀함수 {
		public static int Function(int n) {
			int result =0;
			if(n==1) {
				result =1;
			}else if(n==2) {
				result = 1;
			}
			else if(n >= 3){
				result = Function(n-2)+ Function(n-1);
				
			}
			return result;
			
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			System.out.println(Function(n));
		}
	}


