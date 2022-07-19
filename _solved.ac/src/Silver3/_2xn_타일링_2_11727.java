package Silver3;


	import java.util.Scanner;

	
	/*
	 * DP의 문제에서는 규칙을 찾아서 로직을 작성하면 된다.
	 * 기본적으로는 dp[n-1]+ dp[n-2]의 구성으로 이루어져있다.
	 * 아래의 문제에서는 이를 활용하여서 dp[n] = ((dp(n-1) + 2*dp(n-2) )으로 로직을 구성해야 규칙이 성립이된다.
	 * 로직을 작성하기전에 규칙을 찾고 문제를 풀어야한다는게 중요한점이다. 
	 * 
	 * */
	public class _2xn_타일링_2_11727 {
		static int [] d = new int[1001];
		static int dp(int n) {
			if(n==1) return 1;
			if(n==2) return 3;
			if(d[n] !=0) return d[n];
			return d[n] = ((dp(n-1) + 2*dp(n-2) )%10007);
			
			
		}
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			System.out.println(dp(n));
		}
			
	}

