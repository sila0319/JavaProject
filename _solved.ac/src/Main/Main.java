

package Main;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count =0;
		int result =0;
		Integer [] arr = new Integer[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr, Collections.reverseOrder());
//		for (int i : arr) {
//			System.out.println(i);
//		}
		while(true) {
			count =0;
			if(k==0) {
				break;
			}
			for (int i = 0; i < arr.length; i++) {
				if( k>=arr[i]) {
					result += k/arr[i];
					k %= arr[i];
				}
			}
		System.out.println(result);
	}
}
}