package Gold4;


	import java.util.Scanner;


	public class 부분합_1806 {
		static int [] arr; 
		static int n;
		static int s;
		static int result =0;
		static int start =0;
		static int end =0;
		static int min = 210000000;
		static void check () { //두포인터로 왼쪽과 오른쪽값을 더한다. 
			while(true) {
				
				
				if(result >= s ) {
					result -= arr[start];
					min = Math.min(min, (end-start));
					start++;
				}else if(end ==n) break;
				
				else {
					result += arr[end];
					end++;
				}
			}
			if(min==210000000) min =0;
			
			
		}
		public static void main(String[] args)  {
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			s = sc.nextInt();
			arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			check();
			System.out.println(min);
			
		}
	 
	}


