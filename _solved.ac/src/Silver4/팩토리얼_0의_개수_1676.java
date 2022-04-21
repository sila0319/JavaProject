//N!에서 뒤에서부터 처음 0이 아닌 숫자가 나올 때까지 0의 개수를 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 N이 주어진다. (0 ≤ N ≤ 500)
//
//출력
//첫째 줄에 구한 0의 개수를 출력한다.
//
//예제 입력 1 
//10
//예제 출력 1 
//2
//예제 입력 2 
//3
//예제 출력 2 
//0

//이 문제에서는 팩토리얼이 돌면서 5의 배수 하나당 0의 개수가 1개 늘어난다.
//5의 배수중 25는 5가2개 이므로 0이 2개 늘어난다.
//5의 배수중 125는 5가3개이므로 0이 3개 늘어난다.
//문제를 어떤식으로 푸는냐에 따라 위의 공식을 다르게 써야한다. 

package Silver4;

import java.util.Scanner;

public class 팩토리얼_0의_개수_1676 { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//몇 팩토리얼인지 값을 받는다.
		int count =0;//0의 개수를 셀 count를 선언한다
		for (int i = 1; i <= n; i++) {//팩토리얼이므로 1부터 n까지 i가 늘어난다.
			if(i%125==0) {//만약에 i가 125의 배수 일경우 count+=3을 한다
				count +=3;
			}else if(i%25==0) {//i가 25의 배수일 경우 count +=2를 한다.
					count +=2;
			}else if(i%5==0) {//i가 5의 배수일 경우 count ++을 한다.
						count+=1;	
			}
		}
		System.out.println(count);//0의 개수를 출력한다.	
	}
}
