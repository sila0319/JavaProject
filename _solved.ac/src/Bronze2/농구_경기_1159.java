package Bronze2;



import java.util.Scanner;

public class ³ó±¸_°æ±â_1159 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count =0;
		int [] arr = new int[26];
		final int MAX = 5;
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			char ch = s.charAt(0);
			arr[ch-97]++;
			
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] >=MAX) {
				count++;
				System.out.print((char)(i+97));
			}
		}
		if(count==0) {
			System.out.println("PREDAJA");
		}
	}

}
