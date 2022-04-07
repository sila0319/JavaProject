package Silver5;



import java.util.Arrays;
import java.util.Scanner;

public class ¾à¼ö_1037 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		int [] arr = new int [sum];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		if(arr.length==1) {
			System.out.println(arr[0]*arr[0]);
		}else {
			System.out.println(arr[0]*arr[arr.length-1]);
		}
		
		
	}
}

