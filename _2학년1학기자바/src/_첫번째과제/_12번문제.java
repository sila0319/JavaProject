package _ù��°����;

import java.util.Scanner;

public class _12������ {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("�ΰ��� �����Է� : ");
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
		System.out.printf("%d���� %d������ ���� %d",firstNum,secondNum,result);
	}

}
