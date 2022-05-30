package Silver4;



import java.util.Scanner;
import java.util.Arrays;
import java.util.StringTokenizer;



public class ����_ī��_2_10816 {
	private static int lowerBound(int[] arr, int key) {
		int lo = 0; 
		int hi = arr.length; 
 
		// lo�� hi�� ������ �� ���� �ݺ�
		while (lo < hi) {
 
			int mid = (lo + hi) / 2; // �߰���ġ�� ���Ѵ�.
 
			/*
			 *  key ���� �߰� ��ġ�� ������ �۰ų� ���� ���
			 *  
			 *  (�ߺ� ���ҿ� ���� �������� Ž���ϵ��� ��踦 ������.)
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
 
		// lo�� hi�� ������ �� ���� �ݺ�
		while (lo < hi) {
 
			int mid = (lo + hi) / 2; // �߰���ġ�� ���Ѵ�.
 
			// key���� �߰� ��ġ�� ������ ���� ���
			if (key < arr[mid]) {
				hi = mid;
			}
			// �ߺ������� ��� else���� ó���ȴ�.
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


