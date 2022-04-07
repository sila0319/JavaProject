//1에서부터 6까지의 눈을 가진 4개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다. 
//
//같은 눈이 4개가 나오면 50,000원+(같은 눈)×5,000원의 상금을 받게 된다. 
//같은 눈이 3개만 나오면 10,000원+(3개가 나온 눈)×1,000원의 상금을 받게 된다. 
//같은 눈이 2개씩 두 쌍이 나오는 경우에는 2,000원+(2개가 나온 눈)×500원+(또 다른 2개가 나온 눈)×500원의 상금을 받게 된다.
//같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
//모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
//예를 들어, 4개의 눈이 3, 3, 3, 3으로 주어지면 50,000+3×5,000으로 계산되어 65,000원의 상금을 받게 된다. 
//4개의 눈이 3, 3, 6, 3으로 주어지면 상금은 10,000+3×1,000으로 계산되어 13,000원을 받게 된다. 
//또 4개의 눈이 2, 2, 6, 6으로 주어지면 2,000+2×500+6×500으로 계산되어 6,000원을 받게 된다. 
//4개의 눈이 6, 2, 1, 6으로 주어지면 1,000+6×100으로 계산되어 1,600원을 받게 된다. 
//4개의 눈이 6, 2, 1, 5로 주어지면 그 중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
//
//N(1 ≤ N ≤ 1,000)명이 주사위 게임에 참여하였을 때, 가장 많은 상금을 받은 사람의 상금을 출력하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에는 참여하는 사람 수 N이 주어지고 그 다음 줄부터 N개의 줄에 사람들이 주사위를 던진 4개의 눈이 빈칸을 사이에 두고 각각 주어진다.
//
//출력
//첫째 줄에 가장 많은 상금을 받은 사람의 상금을 출력한다.

package Bronze2;


import java.util.Arrays;
import java.util.Scanner;

public class 주사위네개_2484 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();//주사위 몇번 굴리는지
		int [] result = new int[n];//굴린 결과값 받을 배열
		int [] reroll = new int[4];//주사위4개 눈금 저장.
		int sum =0; // 주사위 값 계산
		
		for (int i = 0; i < n; i++) {//n번 참가자 수 만큼 돌기.
			for (int j = 0; j < reroll.length; j++) {//주사위 세개 굴리기
				reroll[j] = sc.nextInt();//주사위 네개 값 배열에 저장
			}
			Arrays.sort(reroll);//배열 정렬
			
			if(reroll[0]==reroll[1]&&reroll[1]==reroll[2]&&reroll[2]==reroll[3]) {
				//눈금이 다 같은 경우
				sum = 50000+ reroll[0]*5000; // sum에 다가 계산하기
			
			}else if(reroll[0]==reroll[1]&&reroll[1]==reroll[2]||reroll[1]==reroll[2]&&reroll[2]==reroll[3]) {//눈금이 세개가 같은경우
				sum = 10000+reroll[1]*1000;//정렬을 했기 때문에 reroll[1]번째 reroll[2]번째 주사위는 무조건 포함됨
			
			}else if(reroll[0]==reroll[1]&&reroll[2]==reroll[3]){//눈금이 두쌍씩 같은 경우
				sum = 2000+ reroll[0]*500+ reroll[2]*500;//배열을 했기 때문에 reroll[2]에 있는 눈금이 제일큼
			}else if(reroll[0]==reroll[1]) {
				sum = 1000+reroll[0]*100;
			}else if(reroll[2]==reroll[3]) {
				sum = 1000+reroll[2]*100;
			}else if(reroll[1]==reroll[2]) {
				sum = 1000+reroll[2]*100;
			}else {
				sum = 100*reroll[3];
			}
			
			result[i] =sum;// 위의 계산값을 result배열에 저장하기
		}
		Arrays.sort(result);//result 배열 정렬
		System.out.println(result[n-1]);//정렬을 하였으므로 result[n-1]의 위치의 값이 제일큼.
		
	}
}