package _20장_패키지;

import java.util.*;

public class StringTest1 {
	public static void Arraysort(String [] arr ) {
		for (int i = 0; i < arr.length; i++) {
			char chi = arr[i].charAt(0);
			for (int j = 0; j < arr.length-1; j++) {
				char chj = arr[j].charAt(0);
				if(chi  < chj) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
	}
	public static void main(String[] args) {
		String b = "Will Java change my life?";
		String c = "ABC AB A";
		Scanner sc = new Scanner(System.in);
		//String s= sc.nextLine();
		StringTokenizer st = new StringTokenizer(c);
		String [] arr = new String[st.countTokens()];
		int i =0;
		while(st.hasMoreTokens()){
			arr[i] = st.nextToken();
			i++;
			//System.out.println(st.nextToken());
		}
		Arraysort(arr);
		for (String a : arr) {
			System.out.println(a);
		}
		
		Arrays.sort(arr);
		
		for (String a : arr) {
			System.out.println(a);
		}		
		
	}
}
