package _10장_배열;

import java.util.Scanner;

public class ArrayTest5 {
	final static int STUDENTS =5;
	private static void getValues(int[] array) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("성적을 입력하시오");
			array[i] = sc.nextInt();
		}
	}
	
	private static void getAverage(int[] array) {
		int total =0;
		for (int i = 0; i < array.length; i++) {
			total +=array[i];
		}
		System.out.printf("평균 성적은 %d 입니다.",total/array.length);
	}
	public static void main(String[] args) {
		int [] scores = new int[STUDENTS];
		getValues(scores);
		getAverage(scores);
	
	}
	

}
