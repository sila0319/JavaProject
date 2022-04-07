package _첫번째과제;

import java.util.Scanner;

public class _23번문제 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("구구단 입력 : ");
		int num = sc.nextInt();
		for (int i = 1; i < num+1 ; i++) {
			System.out.printf("%d * %d = %d %n",num,i,num*i);
		}
	}
}
