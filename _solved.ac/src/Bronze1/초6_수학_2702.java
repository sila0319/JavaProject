//두 정수 a와 b 최소공배수는 두 수의 공통된 배수 중 가장 작은 수이고, 
//최대공약수는 두 수의 공통된 약수중 가장 큰 수이다.
//
//a와 b가 주어졌을 때, 최소공배수와 최대공약수를 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 테스트 케이스의 개수 T(1<=T<=1,000)가 주어진다. 
//각 테스트 케이스는 두 정수 a와 b로 이루어져 있고, 공백으로 구분되어 있다. (1 <= a,b <= 1,000)
//
//출력
//각 테스트 케이스에 대해 최소공배수와 최대공약수를 차례대로 출력한다.

package Bronze1;

import java.util.Scanner;

public class 초6_수학_2702 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//n번만큼 반복한다. 반복횟수를 입력받는다.
		for (int i = 0; i < n; i++) {//n번 만큼 반복한다.
			int a = sc.nextInt();//정수 a를 받는다
			int b = sc.nextInt();//정수 b를 받는다
			int	N = eucd(Math.max(a, b), Math.min(a, b));//a와b중 큰값을 bn에 작은값을 sn에 리턴한다.
			a /= N;
			b /= N;
			
			int M = a*b*N;//a*b*N의 값은 최소공배수이다.
			
			System.out.println(M);//최소공배수말하기
			System.out.println(N);//최대공약수말하기
		}
	}	
		//최대공약수를 찾는 과정
		static int eucd(int bn, int sn) {//bn은 max값 sn은 min값을 리턴한다.
			int r = bn%sn;//int r을 max%min값을 나눈게
			if(r==0) {//0이 될경우
				return sn;//sn은 min값이 된다  min값을 리턴하여 N을 min값으로 만든다.이떄 sn의값은 최대공약수이다.
			}else {
				return eucd(sn,r);
				//아닐경우는 최대공약수가 아니므로 sn과 r을 리턴하여 최대공약수를 찾을 때까지 다시 반복한다. 
				//r값은 큰값에서 작은값으로 나눈 나머지의 값이므로 min값이 되고 sn은 max값으로 리턴이 된다.
				//그리고 또다시 자동으로 재귀가되어 반복이 된다.
			}
	}
	
}