package _10��_�迭;

import java.util.Scanner;

public class ArrayTest1 {
	public static void main(String[] args) {
		final int STUDENTS =5;
		int total =0;
		Scanner sc = new Scanner(System.in);
		int [] scores  = new int [STUDENTS];
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println("������ �Է��Ͻÿ�");
			scores[i] = sc.nextInt();
			total += scores[i];
		}
		System.out.printf("��� ������ %d �Դϴ�.", total/STUDENTS);
		
	}

}
