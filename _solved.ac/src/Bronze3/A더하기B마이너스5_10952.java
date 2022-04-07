//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//
//입력
//입력은 여러 개의 테스트 케이스로 이루어져 있다.
//
//각 테스트 케이스는 한 줄로 이루어져 있으며, 
//각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//
//입력의 마지막에는 0 두 개가 들어온다.
//
//출력
//각 테스트 케이스마다 A+B를 출력한다.

package Bronze3;

import java.util.Scanner;

public class A더하기B마이너스5_10952 {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		while (true) {//무한반복한다.
			int a = sc.nextInt();//a값을받는다
			int b = sc.nextInt();//b값을받는다
			if(a==b&&a==0) {//a와b가 둘다 0일경우 멈춘다
				break;
			}else {
				System.out.println(a+b);//아닐경우 a+b의 값을 말한다.
			}
		}
	}
}
