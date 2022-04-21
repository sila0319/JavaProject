package Main;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [][] arr = new String[8][8];
		int count =0;
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				arr[i][j]= sc.next().split("");
				if(i%2==0 && j%2==0 && arr[i][j].equals("F")) {
					count++;
				}else if(i%2!=0 && j%2!=0 && arr[i][j].equals("F")) {
					count++;
				}
			}
		}
		System.out.println(count);
		
	}
}