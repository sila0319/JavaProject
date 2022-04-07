package _세번쨰과제;

import java.util.Scanner;

public class _7번째별찍기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = 0;
		
		
		for (int i = 1; i < n+1; i++) {
			for (int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i+s; j++) {
				System.out.print("*");
			}
			s+=1;
			System.out.println("");		
		}
		s=n-1;
		for (int i =0; i < n-1; i++) {
			for (int j = 0; j < n-s; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*s-1; j++) {
				System.out.print("*");
			}
			s-=1;
			System.out.println("");
		}
	
		}
		
		}


