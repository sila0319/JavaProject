package Bronze3;

import java.util.Scanner;

public class 팩토리얼 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();//어떤 팩토리얼 계산을 할지 받는다.
		int result =n ; //result는 팩토리얼 계산을 담는변수
		int num = n; //n-i를 num에다가 담고 result에 곱한다.
		for (int i = 1; i < n; i++) {//1~n-1번 만큼 돈다.
			result = (num-i)*result;
			//초반의 result가 n이므로 n-i*result를 한다. 
		}
		if(n==0) {
			System.out.println(1);
		}else {
			System.out.println(result);
		}
	}

}
