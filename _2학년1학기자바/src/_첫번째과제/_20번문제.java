package _ù��°����;

import java.util.Scanner;

public class _20������ {
	public static void main(String[] args) {
		System.out.println("������ �Է� : ");
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		String star= "";
		for (int i = 0; i < num ; i++) {
			star+="*";
		}
		System.out.printf("�� %d�� : %s",num,star);
	}

}
