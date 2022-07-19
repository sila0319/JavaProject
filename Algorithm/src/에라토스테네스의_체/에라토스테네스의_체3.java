package 에라토스테네스의_체;

import java.util.Scanner;

public class 에라토스테네스의_체3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n+1];
		arr[0]=arr[1] = 1;
		
		for (int i = 2; i*i <= n; i++) {
			if(arr[i]==0) {
				for (int j = i+i; j <=n; j+=i) {
					arr[j] = 1;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==0) System.out.print(i+" ");
		}
		//for(int i : arr) System.out.println(arr[i]);
	}

}
