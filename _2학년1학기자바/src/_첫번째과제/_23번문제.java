package _ù��°����;

import java.util.Scanner;

public class _23������ {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("������ �Է� : ");
		int num = sc.nextInt();
		for (int i = 1; i < num+1 ; i++) {
			System.out.printf("%d * %d = %d %n",num,i,num*i);
		}
	}
}
