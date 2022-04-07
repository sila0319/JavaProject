//N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
//
//출력
//입력으로 주어진 숫자 N개의 합을 출력한다.

package Bronze2;

import java.util.Scanner;

public class 숫자의합_11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//몇개의 숫자를 더할지를 받는다.
		int result = 0;//계산할 값 변수명 선언
		String sum = sc.next();//둘째 줄에 숫자 n개가 공백없이주어지므로 for문 안에 집어넣지 않아도됨 한번에 숫자를 읽기 떄문
		for (int i = 0; i < n; i++) {//n번만큼 for문 돌기
			result += sum.charAt(i)-'0'; //sum에 저장되어있는 숫자를 charAt(i)를 사용하여서 한 문자씩 값을 받기
		}
		System.out.println(result);//더한값출력
	}
}
