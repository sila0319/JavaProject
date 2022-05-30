package Silver4;



import java.util.Scanner;
import java.util.Arrays;




public class 수_찾기_1920 {
	
	public static int binarySearch(int arr[], int find) {
		  int mid;
		  int left = 0;
		  int right = arr.length - 1;

		  // 배열의 크기가 1이 될 때까지 반복.
		  while (left <= right) {
		    mid = (right + left) / 2;

		    // 원하는 값을 찾았다면 그 위치를 반환.
		    if (arr[mid] == find) {
		      return 1;
		    }

		    if (find < arr[mid]) {
		      right = mid - 1;
		    } else {
		      left = mid + 1;
		    }
		  }

		  // 원하는 값을 찾지 못함.
		  return 0;
		}
	


	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		int m =sc.nextInt();
		for (int i = 0; i < m; i++) {
			int t = sc.nextInt();
			System.out.println(binarySearch(arr,t));
			
		}
		
		
		
		
	}
}