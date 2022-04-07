package _첫번째과제;

import java.util.Scanner;

public class _20번문제 {
	public static void main(String[] args) {
		System.out.println("별숫자 입력 : ");
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		String star= "";
		for (int i = 0; i < num ; i++) {
			star+="*";
		}
		System.out.printf("별 %d개 : %s",num,star);
	}

}
