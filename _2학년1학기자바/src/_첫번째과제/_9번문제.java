package _ù��°����;

import java.util.Scanner;

public class _9������ {
	public static void main(String[] args) {
		System.out.println("���� �Է� : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result =0;
		for (int i = 1; i < num+1; i++) {
			if(i%2 !=0) {
				result+=i;
			}
		}
		System.out.printf("1���� %d���� Ȧ�� �� : %d %n",num, result );
	}

}
