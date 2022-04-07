//정수 n(0 < n < 1000)과 수의 목록이 주어졌을 때, 
//목록에 들어있는 수가 n의 배수인지 아닌지를 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 n이 주어진다. 다음 줄부터 한 줄에 한 개씩 목록에 들어있는 수가 주어진다.
//이 수는 0보다 크고, 10,000보다 작다. 목록은 0으로 끝난다.
//
//출력
//목록에 있는 수가 n의 배수인지 아닌지를 구한 뒤 예제 출력처럼 출력한다.

package Bronze3;

import java.util.Scanner;

public class 배수찾기_4504 {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//어떤 수의 배수를 찾을지를 정한다.
			
		while(true) {//무한반복한다.
			int sum = sc.nextInt();//sum값을 받아주고
			if(sum==0) {//sum값이 0일 경우에는 while문 반복을 멈춘다.
				break;
			}else if(sum%n==0) {//sum의 값을 나눈 나머지의 값이 0 일경우 sum은 n의 배수가 된다.
				System.out.println(sum+" is a multiple of "+n+".");
			}else if(sum%n!=0) {//sum의 값을 나눈 나머지의 값이 0이 아닐 경우 sum은 n의 배수가 아니다.
				System.out.println(sum + " is NOT a multiple of "+n+".");
			}
		}
			
	}
}
//이 문제 예제가 배수 3을 찾는거여서 sum%n을해야하는데 sum%3을 해버렸다. 
