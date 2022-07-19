package 카카오엔터프라이즈B;

import java.util.Scanner;

public class _2새로운_숫자 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int n = sc.nextInt();
	sc.nextLine();
	String [] arr = sc.nextLine().split("");
	String result = "";
	
	for (int i = 0; i < arr.length-1; i++) {
		String s = arr[i]+arr[i+1];
		if(s.equals("qw")) result+="1";
		else if(s.equals("as")) result+="2";
		else if(s.equals("zx")) result+="3";
		else if(s.equals("we")) result+="4";
		else if(s.equals("sd")) result+="5";
		else if(s.equals("xc")) result+="6";
		else if(s.equals("er")) result+="7";
		else if(s.equals("df")) result+="8";
		else if(s.equals("cv")) result+="9";
		else if(s.equals("ze")) result+="0";
	}
	System.out.println(result);
}
}
