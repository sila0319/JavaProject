package _첫번째과제;

import java.util.Scanner;

public class _12번문제 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("두개의 정수입력 : ");
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();
		int result =0;
		int max =0;
		if(firstNum > secondNum) {
			max=secondNum;
			secondNum=firstNum;
			firstNum=max;
		}
		for (int i = firstNum; i < secondNum+1; i++) {
			result+=i;
		}
		System.out.printf("%d부터 %d까지의 합은 %d",firstNum,secondNum,result);
	}

}
