package _ù��°����;

import java.util.Scanner;

public class _25������ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ΰ��� ������ �Է� : ");
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();
		int result = firstNum*secondNum;
		int [] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] =i+1;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[j]<i*result) {
					continue;
				}else if(arr[j]== i*result) {
					System.out.print(i*result+" ");
				}
			}
		}
	}
}