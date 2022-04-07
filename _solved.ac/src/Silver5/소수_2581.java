//자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
//
//예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 이들 소수의 합은 620이고, 최솟값은 61이 된다.
//
//입력
//입력의 첫째 줄에 M이, 둘째 줄에 N이 주어진다.
//
//M과 N은 10,000이하의 자연수이며, M은 N보다 작거나 같다.
//
//출력
//M이상 N이하의 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그 합을, 둘째 줄에 그 중 최솟값을 출력한다. 
//
//단, M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다.
package Silver5;

import java.util.Scanner;

public class 소수_2581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int M = sc.nextInt();//자연수 최소값
		int N = sc.nextInt();//자연수 최대값
		int min = 10001;//최소값 최대값 사이 소수중 가장 작은수 찾기
		int result =0;//모든 소수 더한값
		int count =0;//소수인지아닌지판별
		
		for (int i = M; i < N+1; i++) {
			count =0;//반복문이 실행될때마다 count를 0으로 리셋한다
			for (int j = 2; j < i; j++) {//소수인지 아닌지판별을 위해 2부터 i의 숫자까지 돌린다.
				if(i%j==0) {//i%j==0일 경우 소수가 아니므로 count++ 후에 브레이크를 한다.
					count++;
					break;
				}
			}
			if(count==0&&i!=1) {//count가 0이고 i가1이 아닌경우 result변수에 i값을 더해준다.(1은 소수가아니므로 더하면 안된다.)
				result += i;
				if(i<min&&i!=1) {//소수 중에 가장 작은 값을 min으로 설정한다.
					min =i;
				}
			}
		}
		if(result==0||result==1) {//result의 값이 0이거나 1인 경우 소수가 없으므로 -1을 출력한다.(1은소수가 아니다)
			System.out.println(-1);
		}else {//그외의 다른경우는 정상적으로 출력한다.
			System.out.println(result);
			System.out.println(min);
		}
				
	}
}