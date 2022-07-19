package 에라토스테네스의_체;

import java.util.Scanner;

public class 에라토스테네스의_체1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k =0;
		
		int [] arr = new int [100];
		arr[0]=2;
		
		for (int i = 3; i <=n; i+=2) 
		{
			int sw =0;
			//System.out.println("바깥포문");
			for (int j = 0; j <=k; j++) 
			{
				//System.out.println("안 포문");
				if(i%arr[j]==0) 
				{
					sw=1; 
					break;
				}
			}
			if(sw==0) 
			{
				k++;
				arr[k] = i;
			}
			
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0) System.out.println(arr[i]);
		}
	}

}
