package _첫번째과제;

import java.util.Scanner;

public class _11번문제 {
	public static void main(String[] args) {
		System.out.println("정수 입력 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result =0;
		int i =1;
		while (true) {
			if(i==num+1) {
				break;
			}
			result+=i;
			i++;
		}
		System.out.printf("1부터 %d까지  합 : %d %n",num, result );
	}
}