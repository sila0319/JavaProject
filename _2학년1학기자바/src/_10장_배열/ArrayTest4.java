package _10��_�迭;

import java.util.Scanner;

public class ArrayTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total =0;
		int size = sc.nextInt();
		int [] scores = new int[size];
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println("������ �Է��Ͻÿ�");
			scores[i] = sc.nextInt();
			total += scores[i];
		}
		System.out.printf("��� ������ %d �Դϴ�.",total/scores.length);
		
	
		
	}

}
