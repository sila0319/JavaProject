package _10장_배열;

import java.util.Scanner;

public class ArrayTest1 {
	public static void main(String[] args) {
		final int STUDENTS =5;
		int total =0;
		Scanner sc = new Scanner(System.in);
		int [] scores  = new int [STUDENTS];
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println("점수를 입력하시오");
			scores[i] = sc.nextInt();
			total += scores[i];
		}
		System.out.printf("평균 성적은 %d 입니다.", total/STUDENTS);
		
	}

}
