package �����佺�׳׽���_ü;

import java.util.Scanner;

public class �����佺�׳׽���_ü1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k =0;
		
		int [] arr = new int [100];
		arr[0]=2;
		
		for (int i = 3; i <=n; i+=2) 
		{
			int sw =0;
			//System.out.println("�ٱ�����");
			for (int j = 0; j <=k; j++) 
			{
				//System.out.println("�� ����");
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
