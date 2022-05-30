package Silver5;


	import java.util.Scanner;

	public class 수들의_합_1789 {
		public static void main(String[] args)  {
			Scanner sc = new Scanner(System.in);
			long n = sc.nextLong();
			long count =0L;
			long result =0L;
			
			for (long i = 1L; i <= n; i++) {
				result +=i;
				count++;
				if(result==n) {
					break;
				}else if(result > n) {
					count--;
					break;
				}
			}
			
			System.out.println(count);

			
		}

	}	



