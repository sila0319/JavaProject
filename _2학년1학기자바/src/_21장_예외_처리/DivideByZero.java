package _21장_예외_처리;

import java.util.Scanner;

public class DivideByZero {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x,y;
	
	System.out.println("피젯수 : ");
	x = sc.nextInt();
	System.out.println("잿수 : ");
	y = sc.nextInt();
	try {
		int result = x/y;
		System.out.println(result);
	}	catch(ArithmeticException e) {
		System.out.println("0으로 나눌 수 없습니다.");
	}
	
	System.out.println("프로그램은 계속 진행됩니다. ");
	}
}
