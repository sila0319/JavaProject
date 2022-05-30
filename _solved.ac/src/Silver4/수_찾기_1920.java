package Silver4;



import java.util.Scanner;
import java.util.Arrays;




public class ��_ã��_1920 {
	
	public static int binarySearch(int arr[], int find) {
		  int mid;
		  int left = 0;
		  int right = arr.length - 1;

		  // �迭�� ũ�Ⱑ 1�� �� ������ �ݺ�.
		  while (left <= right) {
		    mid = (right + left) / 2;

		    // ���ϴ� ���� ã�Ҵٸ� �� ��ġ�� ��ȯ.
		    if (arr[mid] == find) {
		      return 1;
		    }

		    if (find < arr[mid]) {
		      right = mid - 1;
		    } else {
		      left = mid + 1;
		    }
		  }

		  // ���ϴ� ���� ã�� ����.
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