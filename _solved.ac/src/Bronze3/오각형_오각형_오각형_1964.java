//오각형의 각 변에 아래 그림과 같이 점을 찍어 나간다. N단계에서 점의 개수는 모두 몇 개일까?
//첫째 줄에 N(1 ≤ N ≤ 10,000,000)이 주어진다.
//첫째 줄에 N단계에서 점의 개수를 45678로 나눈 나머지를 출력한다.

package Bronze3;
import java.util.Scanner;
public class 오각형_오각형_오각형_1964 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//몇각형의 점을 구할 것인가.
		long num =0L;//값을 출력하는 변수
		int same = 3;//겹치는 부분을 계산하는 변수
		
		for (int i = 1; i <= n; i++) {//n번만큼 반복
			if(i>=2) {//n이 2번째가 되면 특정 조건이 만족함
				num+= i*5-same;//num의 값을 더할때 겹치는 부분을 뺴줘야함
				same +=2;//뺴준후 다음에 여기로 들어온다면 same의 값은 2개가 증가해야함
				continue;//아래 num+=ㅑ*5를 한번더하면 안되므로 컨티뉴
			}
			num += i*5;//i가1일경우에만 작동
		}
		num%=45678;//문제 출력부분에서 45678로 나누어서 답을 출력하란 말이 있음
		System.out.println(num);
	}
}
