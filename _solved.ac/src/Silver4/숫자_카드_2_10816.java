package Silver4;



import java.util.Scanner;
import java.util.Arrays;
import java.util.StringTokenizer;



public class 숫자_카드_2_10816 {
	private static int lowerBound(int[] arr, int key) {
		int lo = 0; 
		int hi = arr.length; 
 
		// lo가 hi랑 같아질 때 까지 반복
		while (lo < hi) {
 
			int mid = (lo + hi) / 2; // 중간위치를 구한다.
 
			/*
			 *  key 값이 중간 위치의 값보다 작거나 같을 경우
			 *  
			 *  (중복 원소에 대해 왼쪽으로 탐색하도록 상계를 내린다.)
			 */
			if (key <= arr[mid]) {
				hi = mid;
			}
 
			else {
				lo = mid + 1;
			}
 
		}
 
		return lo;
	}
 
	private static int upperBound(int[] arr, int key) {
		int lo = 0; 
		int hi = arr.length; 
 
		// lo가 hi랑 같아질 때 까지 반복
		while (lo < hi) {
 
			int mid = (lo + hi) / 2; // 중간위치를 구한다.
 
			// key값이 중간 위치의 값보다 작을 경우
			if (key < arr[mid]) {
				hi = mid;
			}
			// 중복원소의 경우 else에서 처리된다.
			else {
				lo = mid + 1;
			}
 
		}
 
		return lo;
	}
	


	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		StringBuilder sb = new StringBuilder();
		
		int m =sc.nextInt();
		for (int i = 0; i < m; i++) {
			int t = sc.nextInt();
			sb.append(upperBound(arr,t)-lowerBound(arr,t)+" ");
			
		}
		System.out.println(sb);
		
		
		
	}
}


