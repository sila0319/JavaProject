package _첫번째과제;

import java.util.Scanner;

public class _9번문제 {
	public static void main(String[] args) {
		System.out.println("정수 입력 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result =0;
		for (int i = 1; i < num+1; i++) {
			if(i%2 !=0) {
				result+=i;
			}
		}
		System.out.printf("1부터 %d까지 홀수 합 : %d %n",num, result );
	}

}
