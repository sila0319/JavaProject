package Silver3;


	import java.util.Scanner;

	
	/*
	 * DP�� ���������� ��Ģ�� ã�Ƽ� ������ �ۼ��ϸ� �ȴ�.
	 * �⺻�����δ� dp[n-1]+ dp[n-2]�� �������� �̷�����ִ�.
	 * �Ʒ��� ���������� �̸� Ȱ���Ͽ��� dp[n] = ((dp(n-1) + 2*dp(n-2) )���� ������ �����ؾ� ��Ģ�� �����̵ȴ�.
	 * ������ �ۼ��ϱ����� ��Ģ�� ã�� ������ Ǯ����Ѵٴ°� �߿������̴�. 
	 * 
	 * */
	public class _2xn_Ÿ�ϸ�_2_11727 {
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

