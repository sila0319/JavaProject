package _21��_����_ó��;

import java.util.Scanner;

public class DivideByZero {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x,y;
	
	System.out.println("������ : ");
	x = sc.nextInt();
	System.out.println("��� : ");
	y = sc.nextInt();
	try {
		int result = x/y;
		System.out.println(result);
	}	catch(ArithmeticException e) {
		System.out.println("0���� ���� �� �����ϴ�.");
	}
	
	System.out.println("���α׷��� ��� ����˴ϴ�. ");
	}
}
