package _첫번째과제;

import java.util.Scanner;

public class _28번문제 {
	public static void main(String[] args) {
		System.out.println("두자리 정수를 입력 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while (true) {
			if(num <=0) {
				break;
			}
			System.out.print(num+" ");
			num -= (num/10 + num%10);
		}
	}
}
