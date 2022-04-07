//N부터 M까지의 수들을 종이에 적었을 때 종이에 적힌 0들을 세는 프로그램을 작성하라.
//
//예를 들어, N, M이 각각 0, 10일 때 0을 세면 0에 하나, 10에 하나가 있으므로 답은 2이다.
//
//입력
//첫 번째 줄에 테스트 케이스의 수 T가 주어진다.
//
//각 줄에는 N과 M이 주어진다.
//
//1 ≤ T ≤ 20
//0 ≤ N ≤ M ≤ 1,000,000
//출력
//각각의 테스트 케이스마다 N부터 M까지의 0의 개수를 출력한다.
package Silver5;

	import java.util.Scanner;

	public class _0의개수_11170 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();//몇번 실행할 것인가에 대한 질문
			int count =0;//0이 몇개 있는가의 숫자를 센다.
			int result =0;//100이상의 숫자의 0을 카운트 할때 j의 값을 받아서 값을 변경하면서 계산
			
			for (int i = 0; i < t; i++) {//t값만큼 실행한다
				int n = sc.nextInt();//숫자받기1
				int m = sc.nextInt();//숫자받기2
				
				count =0;//카운트값을 초기화 한다.
				for (int j = n; j < m+1; j++) {
					//n부터m+1사이의 0을 찾으므로 for문 설정을 j=n, j<m+1로 쓴다.
					if(j>=0 && j<=99) {//0~99까지는 %걔선을 한번만 하면된다.
						if(j%10==0) {
							count++;
						}
					}else if(j>=100&&j<=1000000) {
						//100이 넘어가면 %계산후에 /10을 해야한다.
						result = j;//j의값으로 하면 값이바뀌기에 result변수에 값을 담아준다.
						while (true) {//무한반복
							if(result==0) {//result값이0이되면 멈춘다.
								break;
							}else if(result%10==0){//result의 일의자리값이0이면 count++실행
								count++;
							}
							result/=10;//무조건 result/10을 한다.
						}
					}
				}
				System.out.println(count);//count값 출력
			}
			
		}
	}

