package Main;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	static int n;
	static int m;
	static int result =0;
	static ArrayList<Integer> list;
	static void check() {
		
	}
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		list = new ArrayList<Integer>(m);
		for (int i = 0; i < m; i++) {
			list.add(sc.nextInt());
		}
	}    
}

//https://www.acmicpc.net/problem/1107