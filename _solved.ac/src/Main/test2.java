package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;


public class test2 {
	static int [] arr;
	static int x;
	static int result =0;
	static int n;
	static void check() {
		int start =0;
		int end =arr.length-1;
		while(start < end) {
			
			if(arr[start]+arr[end]==x) {
				result++;
				start++;
				end--;
			}else if(arr[start]+arr[end]<x) {
				start++;
			}else if(arr[start]+arr[end]>x) {
				end--;
			}
		}
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine());
		arr = new int [n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		x = Integer.parseInt(br.readLine());
		Arrays.sort(arr);
//		for(int i : arr) {
//			System.out.print(i+" ");
//		}
		check();
		System.out.println(result);
		
		

	

	}
}

//https://www.acmicpc.net/problem/5525