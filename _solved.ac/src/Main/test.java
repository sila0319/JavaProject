package Main;

import java.util.Scanner;

public class test {
	
	public static void spin (int n, int p, int[][]arr) { 
	int temp =0;
	if(p==1) {
		temp = arr[n][7];
		arr[n][7] = arr[n][6];
		arr[n][6] = arr[n][5];
		arr[n][5] = arr[n][4];
		arr[n][4] = arr[n][3];
		arr[n][3] = arr[n][2];
		arr[n][2] = arr[n][1];
		arr[n][1] = arr[n][0];
		arr[n][0] = temp;
	}else if(p==-1) {
		temp = arr[n][0];
		arr[n][0] = arr[n][1];
		arr[n][1] = arr[n][2];
		arr[n][2] = arr[n][3];
		arr[n][3] = arr[n][4];
		arr[n][4] = arr[n][5];
		arr[n][5] = arr[n][6];
		arr[n][6] = arr[n][7];
		arr[n][7] = temp;
	}
}

public static void main(String[] args)  {
Scanner sc = new Scanner(System.in);
int p = 0;
int n = 0; 
int [][] arr = new int[4][8];

for (int i = 0; i < 4; i++) {
	String [] s = sc.nextLine().split("");
	for (int j = 0; j < 8; j++) {
		arr[i][j] = Integer.parseInt(s[j]);
	}
}
int k = sc.nextInt();
for (int i = 0; i < k; i++) {
	 n = sc.nextInt();
	 p = sc.nextInt();
}
//int n = 1;
//int p = 1;
spin(n,p,arr);

for (int i = 0; i < 4; i++) {
	for (int j = 0; j < 8; j++) {
		System.out.print(arr[i][j]+" ");
	}
	System.out.println();
}



}}