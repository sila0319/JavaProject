package _ù��°����;

import java.util.Scanner;

public class _28������ {
	public static void main(String[] args) {
		System.out.println("���ڸ� ������ �Է� : ");
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
