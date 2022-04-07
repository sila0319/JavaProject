package _첫번째과제;

import java.util.Scanner;

public class _21번문제 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num =0;
		while (true) {
		System.out.println("별숫자 입력 : ");
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
			System.out.printf("별 %d개 : %s...",num,star);
		}
		
		
		else {
			for (int i = 0; i < num ; i++) {
				star+="*";
				}
			System.out.printf("별 %d개 : %s",num,star);
		}
	}
}

