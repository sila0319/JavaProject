package _ù��°����;

import java.util.Scanner;

public class _21������ {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num =0;
		while (true) {
		System.out.println("������ �Է� : ");
		num = sc.nextInt();
		if(num>0) {
			break;
			}
		}
		
		String star= "";
		if(num<50) {
			for (int i = 0; i < 50 ; i++) {
			star+="*";
			}
			System.out.printf("�� %d�� : %s...",num,star);
		}
		
		
		else {
			for (int i = 0; i < num ; i++) {
				star+="*";
				}
			System.out.printf("�� %d�� : %s",num,star);
		}
	}
}

