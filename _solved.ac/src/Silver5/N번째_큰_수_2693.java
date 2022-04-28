




package Silver5;



import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;


public class N번째_큰_수_2693 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] arr = new int [8][2];
		int [] arr1 = new int [5];
		int result =0;
		int max =0;
		for (int i = 0; i < arr.length; i++) {
				arr[i][0] = sc.nextInt();
				arr[i][1] = i+1;
			
		}
		Arrays.sort(arr,new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0])
					return o2[0]-o1[0];
				else
					return o2[0]-o1[0];
			}
		});
		
		for (int i = 0; i < 5; i++) {
			result += arr[i][0];
			arr1[i]= arr[i][1];
		}
		Arrays.sort(arr1);
		System.out.println(result);
		
		for (int i : arr1) {
			System.out.print(i +" ");
		}
		
		
		
		
		
	}

}
