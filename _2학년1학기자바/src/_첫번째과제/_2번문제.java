package _첫번째과제;

import java.util.Scanner;

public class _2번문제 {
	public static void main(String[] args) {
		System.out.println("두수를 입력하시오<예 100, 15 > : 70.13");
		Scanner sc = new Scanner(System.in);
		double firstNum= sc.nextDouble();
		double secondNum=sc.nextDouble();
		
		System.out.printf("%.0f + %.0f = %.0f %n",firstNum, secondNum, firstNum+secondNum );
		System.out.printf("%.0f - %.0f = %.0f %n",firstNum, secondNum, firstNum-secondNum );
		System.out.printf("%.0f * %.0f = %.0f %n",firstNum, secondNum, firstNum*secondNum );
		System.out.printf("%.0f / %.0f = %.0f %n",firstNum, secondNum, firstNum/secondNum );
		System.out.printf("%.0f %% %.0f = %.0f %n",firstNum, secondNum, firstNum%secondNum );
		
		
	}

}
