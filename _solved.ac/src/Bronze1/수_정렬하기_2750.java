package Bronze1;


	import java.util.Scanner;
	import java.util.Arrays;

	public class ��_�����ϱ�_2750 {
		public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			int n = sc.nextInt();
			int [] arr = new int [n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			
			for (int i : arr) {
				System.out.println(i);
			}
			
			
		}
	}


