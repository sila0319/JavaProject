package _ù��°����;

import java.util.Scanner;

public class _11������ {
	public static void main(String[] args) {
		System.out.println("���� �Է� : ");
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
		System.out.printf("1���� %d����  �� : %d %n",num, result );
	}
}