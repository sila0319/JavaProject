package _10��_�迭;

import java.util.Scanner;

public class ArrayTest5 {
	final static int STUDENTS =5;
	private static void getValues(int[] array) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("������ �Է��Ͻÿ�");
			array[i] = sc.nextInt();
		}
	}
	
	private static void getAverage(int[] array) {
		int total =0;
		for (int i = 0; i < array.length; i++) {
			total +=array[i];
		}
		System.out.printf("��� ������ %d �Դϴ�.",total/array.length);
	}
	public static void main(String[] args) {
		int [] scores = new int[STUDENTS];
		getValues(scores);
		getAverage(scores);
	
	}
	

}
