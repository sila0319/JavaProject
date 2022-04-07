package _첫번째과제;

import java.util.Scanner;

public class _14번문제 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int count =0;
		double result =0;
		while (true) {
			System.out.println("점수를 입력<종료 : -1> ");
			int num = sc.nextInt();
			if(num==-1) {
				break;
			}
			
			result += num;
			count++;
		}
		double avg =result/count;
		System.out.printf("총점 : %.0f, 입력횟수 : %d, 평균 : %.2f",result, count, avg);
	}
}
