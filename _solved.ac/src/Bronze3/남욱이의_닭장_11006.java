//계란집을 운영하는 남욱이는 매일 닭장에서 달걀을 수거해간다. 
//어느 날 닭장에 들어가보니 일부 닭의 다리가 하나씩 사라졌다.
//남욱이는 얼마나 많은 닭들이 한 다리를 잃었는지 알고싶었지만 닭이 너무 많아 셀 수 없었고, 대신 모든 닭의 다리수를 셌다. 고민하는 남욱이를 위해 모든 닭의 다리수의 합과 닭의 수를 가지고 이것을 해결해주자.
//
//입력
//첫째 줄에 총 테스트 케이스의 수 T (T ≤ 25)가, 
//둘째 줄 부터 T + 1째줄까지 매줄 마다 모든 닭의 다리수의 합 N (1 ≤ N ≤ 300)과
//닭의 수 M (M ≤ N ≤ 2M)이 공백을 간격으로 입력된다.
//
//출력
//테스트 케이스마다 한줄에 다리가 잘린 닭의 수 U와 멀쩡한 닭의 수 T를 공백을 간격으로 출력한다.

package Bronze3;

import java.util.Scanner;

public class 남욱이의_닭장_11006 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();//몇개의 테스트 케이스인가?
		for (int i = 0; i < t; i++) {//테스트케이스 숫자만큼 반복
		int n = sc.nextInt();//닭의 다리수 받기
		int m = sc.nextInt();//닭의 수 받기
		int result =(2*m-n);//이 식을 통해 나오는 수 가 다리가 잘린 닭의 수다.
		System.out.println(result+" "+(m-result));
		//m-result는 m은 총 닭의 수이므로 다리가 잘린 닭의 수를 빼면 정상닭의 수가 나온다.
		}
		
	}	
}
