package Bronze1;


	import java.util.Scanner;

	public class ¹úÁý_2292 {
		
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int result =1;
			int cnt =0;
			long first =2L;
			long last =7L;
			
			while(n!=1) {
				result++;
				if(first<= n && n <= last) {
					break;
				}
				first += result-1*6;
				last += result * 6; 
				
				
			}
			
			System.out.println(result);
			
			
			
			
			
		}
	}


