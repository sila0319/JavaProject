package Silver1;

import java.util.Scanner;

public class 하노이_탑_이동_순서_11729 {
	static StringBuilder sb = new StringBuilder();
	
	/*
	 * from은 하노이탑이 맨처음에 위치한 곳
	 * to는 도착지점
	 * by는 중간지점
	 * */
	static void HanoiTowerMove(int num, int from, int by, int to)
	{
		if(num==1) {
			sb.append(from+" "+to+"\n");
			return;
		}
			// A -> C로 옮긴다고 가정할 떄,
			// STEP 1 : N-1개를 A에서 B로 이동 (= start 지점의 N-1개의 원판을 mid 지점으로 옮긴다.)
			HanoiTowerMove(num-1, from, to, by);
			// STEP 2 : 1개를 A에서 C로 이동 (= start 지점의 N번째 원판을 to지점으로 옮긴다.)
			sb.append(from+" "+to+"\n");
			// STEP 3 : N-1개를 B에서 C로 이동 (= mid 지점의 N-1개의 원판을 to 지점으로 옮긴다.)
			HanoiTowerMove(num-1, by, from, to);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();//시작지점에 쌓인 하노이의 갯수 
		sb.append((int)(Math.pow(2, n)-1)).append('\n'); //이동횟수는 n개의 하노이가 있다면 2*n -1만큼의 이동횟수이다.
		
		HanoiTowerMove(n,1,2,3);//순서대로 하노이의 갯수, 시작지점, 중간지점, 도착지점
		System.out.println(sb);//출력
		
	}	
}
