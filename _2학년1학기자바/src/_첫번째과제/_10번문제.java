package _ù��°����;

import java.util.Scanner;

public class _10������ {
	public static void main(String[] args) {
		System.out.println("���? : ");
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d %n",num, i, num*i);
		}
	}

}
