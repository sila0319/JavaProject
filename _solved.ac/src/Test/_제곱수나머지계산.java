package Test;

import java.util.Scanner;

public class _제곱수나머지계산 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = sc.nextInt();
		int mul = sc.nextInt();
		int result =11;
		int count =0;
		while(result >9 ) {
			count = n-sum;
			result = (int) Math.pow((n-sum), mul);
			n = count;
			
		}
		System.out.println(result);
	}

}
