package Bronze3;

import java.util.Scanner;

public class ���丮��_10872 {

	static int result =1;
	public static void cal(int n) {
		if(n==0) {
			return;
		}
		result *= n;
		n--;
		cal(n);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n!=0) {
			cal(n);
			System.out.println(result);
		}else {
			System.out.println(1);
		}
		
	}

}
