package Main;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int result =n ;
		int num = n;
		for (int i = 1; i < n; i++) {
			result = (num-i)*result;
		}
		if(n==0) {
			System.out.println(1);
		}else {
			System.out.println(result);
		}
		
		
	}
	
}

		
		
			
