package _ù��°����;

import java.util.Scanner;

public class _2������ {
	public static void main(String[] args) {
		System.out.println("�μ��� �Է��Ͻÿ�<�� 100, 15 > : 70.13");
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
