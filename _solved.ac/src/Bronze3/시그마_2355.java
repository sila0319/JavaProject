//두 정수 A와 B가 주어졌을 때, 두 정수 사이에 있는 수의 합을 구하는 프로그램을 작성하시오. 사이에 있는 수들은 A와 B도 포함한다.
//첫째 줄에 두 정수 A, B가 주어진다. (-2,147,483,648 ≤ A, B ≤ 2,147,483,647)
//첫째 줄에 답을 출력한다. (-2,147,483,648 ≤ 답 ≤ 2,147,483,647)

package Bronze3;

import java.util.Scanner;

public class 시그마_2355 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();//a값을 받는다.
		long b = sc.nextLong();//b값을 받는다.
		
		if(a <= b) { //b가 a보다 크거나 같을경우
			System.out.println(((b-a+1)*(b+a))/2);
			//b=6,a=3 이면 (6-3+1) * (6+3) /2 = (4) * (9) /2 = 18이 나온다.
			//b=3,a=1 이면 (3-1+1) * (3+1) /2 = 3 * 4 /2 = 6이 나온다.
			
		}else {
			System.out.println(((a-b+1)*(a+b))/2);
			//b가 a보다 작을경우에는 위의 수식을 반대로 적어주면된다.
		}
		
		

	}

}
