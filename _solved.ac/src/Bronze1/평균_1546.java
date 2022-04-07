//세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 
//일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
//
//예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
//
//세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다.
//둘째 줄에 세준이의 현재 성적이 주어진다. 이 값은 100보다 작거나 같은 음이 아닌 정수이고, 
//적어도 하나의 값은 0보다 크다.
//
//출력
//첫째 줄에 새로운 평균을 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-2 이하이면 정답이다.

package Bronze1;

import java.util.Scanner;

public class 평균_1546 {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//몇개의 과목을 시험을 쳤는지 받는다.
		double max =0;//과목점수중 최댓값 찾기
		double [] arr = new double[n];//과목 수 만큼 배열 선언
		double result =0;//결과값 0으로 설정
		for (int i = 0; i < arr.length; i++) {//배열에다가 과목점수 넣기
			arr[i] = sc.nextInt();
			if(arr[i]>max) {//과목점수 중 가장 큰 값 찾기
				max = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			result += arr[i]/max*100;//result 변수에 위에말한 식대로 계산하고 값을 더한다.(본점수/최대점수*100)
		}
		System.out.println(result/n);//그 후 과목 수 만큼 나 눈후 평균값을 출력한다.
		
	}
}

