package Bronze1;

import java.util.Scanner;

public class 이항_계수_1_11050 {
	public static int fatorial(int a) {//재귀함수를 통하여 팩토리얼을 구현하였다. 
		if(a ==0) {
			return 1;
		}
		return a *fatorial(a-1);
	}
	
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		//n팩토리얼 / (k팩토리얼*n-k 팩토리얼)을 계산하면 된다. 
		System.out.println(fatorial(n) / (fatorial(k) *fatorial(n-k)));
		
	}
}
