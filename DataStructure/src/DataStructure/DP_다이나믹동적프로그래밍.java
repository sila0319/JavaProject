package DataStructure;

import java.util.Scanner;

public class DP_다이나믹동적프로그래밍 {
	static int[] dp;
	
	/*Bottom-up(상향식)
	 * 하위에서 부터 문제를 해결해나가면서 먼저 계산했던 문제들의 값을 활용해서
	 * 상위 문제를 해결해 나가는 방식으로 dp의 전형적인 형태는 bottom-up이다
	 * 여기서 사용되는 문제 결과값 저장용 리스트는 dp테이블이라고 부른다. 
	 */
	static int BottomUp(int x){
		dp[1] = 1;
		dp[2]= 2;
		for (int i = 3; i < x+1; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		return dp[x];
		
	}
	
	//Memoization
//	메모이제이션은 DP구현 방법 중 하나로, 
//	한 번 계산한 결과를 메모리 공간에 메모하는 기법이다. 
//	이를 사용하면 모든 부분 문제가 한 번씩만 계산된다고 보장할 수 있기 때문에
//	함수 호출 횟수가 엄청나게 감소함을 예상할 수 있다.
	
	//특징
	/*
	 * 같은 문제를 다시 호출하면 메모했던 결과를 그대로 가져온다.
	 * 값을 기록해 놓는다는 점에서 캐싱(Caching)이라고 한다
	 * DP에만 국한된 개념이 아니다 한번 계산된 결과를 담아놓기만 하고
	 * DP가 아닌 다른 방식으로도 사용될 수 있다(캐싱, 메모이제이션)
	 * 
	 * */

	 

//	위의 단순 재귀코드와 Top-down의 코드를 비교해보면 직관적으로 이해하기 쉽다.
	//하위 문제의 결과 값을 dp[]배열에 저장해놓고 필요할 때마다 계산된 값을 호출
	/* Top-down(하향식)
	 * 상위 문제를 해결하기 위해서 하위 문제를 재귀적으로 호출하여 
	 * 하위 문제를 해결함으로써 상위문제를 해결하는 방식이다.
	 * 이때 해결해놓은 하위문제를 저장해 놓기 위해 Memoization이 사용된다.
	 * 피보나치 함수를 만들때 top-down 재귀 호출을 사용하여 구현한다.
	 * 
	 */
	static int TopDown (int x) {
		if(x==1 || x==2) return 1;
		if(dp[x] !=0) return dp[x];
		dp[x] = TopDown(x-1) + TopDown(x-2);
		return dp[x];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dp = new int [n+1];
	}

}
