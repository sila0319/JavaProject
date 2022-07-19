package _방학특강_자료구조;

import java.util.Scanner;

public class 하노이_타워_재귀함수_02 {
	static void HanoiTowerMove(int num, char from, char by, char to)
	{
		if(num==1) System.out.printf("원반1을 %c에서 %c로 이동 \n",from,to);
		else
		{
			HanoiTowerMove(num-1, from, to, by);
			System.out.printf("원반%d을 %c에서 %c로 이동 \n",num,from,to);
			HanoiTowerMove(num-1, by,from ,to);

		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		하노이_타워_재귀함수_02 HTM = new 하노이_타워_재귀함수_02();
		
		System.out.println("몇개의 하노이를 옮길까요?");
		int n = sc.nextInt();
		System.out.println("순서대로 시작지점,경유지점,도착지점을 입력해주세요\n ex) ABC");
		sc.nextLine();
		String s = sc.nextLine();
		HTM.HanoiTowerMove(n,s.charAt(0),s.charAt(1),s.charAt(2));
		HanoiTowerMove(n,s.charAt(0),s.charAt(1),s.charAt(2));
		System.out.println();
		
		//아래는 임의의 재귀함수
		HTM.HanoiTowerMove(3,'A','B','C');
		

	}

}
