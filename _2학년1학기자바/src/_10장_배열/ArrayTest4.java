package _10장_배열;

import java.util.Scanner;

public class ArrayTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total =0;
		int size = sc.nextInt();
		int [] scores = new int[size];
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println("성적을 입력하시오");
			scores[i] = sc.nextInt();
			total += scores[i];
		}
		System.out.printf("평균 성적은 %d 입니다.",total/scores.length);
		
	
		
	}

}
