package _ù��°����;

import java.util.Scanner;

public class _14������ {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int count =0;
		double result =0;
		while (true) {
			System.out.println("������ �Է�<���� : -1> ");
			int num = sc.nextInt();
			if(num==-1) {
				break;
			}
			
			result += num;
			count++;
		}
		double avg =result/count;
		System.out.printf("���� : %.0f, �Է�Ƚ�� : %d, ��� : %.2f",result, count, avg);
	}
}
