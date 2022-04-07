package Bronze3;


import java.util.Arrays;
import java.util.Scanner;


public class 지능형기차2_2460 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int plus , minus ;
		int people = 0;
		int [] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			minus = sc.nextInt();
			people -= minus;
			plus = sc.nextInt();
			people += plus;
			arr[i] = people;
		}
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
	}
}