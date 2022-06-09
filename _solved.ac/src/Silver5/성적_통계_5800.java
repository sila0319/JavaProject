package Silver5;


	import java.util.Scanner;
	import java.util.Arrays;

	public class 성적_통계_5800 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int k = sc.nextInt();
			
			for (int i = 0; i < k; i++) {
				int n = sc.nextInt();
				int[] arr = new int[n];
				int max =0;
				for (int j = 0; j < arr.length; j++) {
					arr[j]= sc.nextInt();
				}
				Arrays.sort(arr);
				
				for (int j = 0; j < arr.length-1; j++) {
					if(arr[j+1]-arr[j]>max) {
						max = arr[j+1]-arr[j];
					}
				}
				
				
				
				
				
				System.out.println("Class "+(i+1));
				System.out.println("Max "+arr[arr.length-1]+", Min "+arr[0]+", Largest gap "+max);
				
			}
			
		}
	}


