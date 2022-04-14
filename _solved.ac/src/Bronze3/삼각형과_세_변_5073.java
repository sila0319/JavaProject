//문제
//삼각형의 세 변의 길이가 주어질 때 변의 길이에 따라 다음과 같이 정의한다.
//
//Equilateral :  세 변의 길이가 모두 같은 경우
//Isosceles : 두 변의 길이만 같은 경우
//Scalene : 세 변의 길이가 모두 다른 경우
//단 주어진 세 변의 길이가 삼각형의 조건을 만족하지 못하는 경우에는 "Invalid" 를 출력한다. 
//예를 들어 6, 3, 2가 이 경우에 해당한다. 
//가장 긴 변의 길이보다 나머지 두 변의 길이의 합이 길지 않으면 삼각형의 조건을 만족하지 못한다.
//
//세 변의 길이가 주어질 때 위 정의에 따른 결과를 출력하시오.
//
//입력
//각 줄에는 1,000을 넘지 않는 양의 정수 3개가 입력된다. 마지막 줄은 0 0 0이며 이 줄은 계산하지 않는다.
//
//출력
//각 입력에 맞는 결과 (Equilateral, Isosceles, Scalene, Invalid) 를 출력하시오.
//
//예제 입력 1 
//7 7 7
//6 5 4
//3 2 5
//6 2 6
//0 0 0
//
//예제 출력 1 
//Equilateral
//Scalene
//Invalid
//Isosceles




package Bronze3;

import java.util.Arrays;
import java.util.Scanner;

public class 삼각형과_세_변_5073 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[3];//세변의 길이를 받을 배열 선언
		while (true) {//break 걸리기 전까지 무한반복한다.
			int count =0;//break를 걸기 위한 count
			for (int i = 0; i < arr.length; i++) {//세변의 길이를 받는다.
				arr[i] = sc.nextInt();
				if(arr[i]==0) {count++;}//만약 받은 값이 0일 경우 count++를실행한다.
			}
			if(count==3) {break;}//count가 3이 될경우 멈춘다.
			Arrays.sort(arr);//배열을 정렬한다.
			
			if(arr[0]+arr[1] >arr[2]) {//삼각형의 조건을 충족할 경우 
				if(arr[0]==arr[1] && arr[2] == arr[0]) {//세변의 길이가 같은 지 검사
					System.out.println("Equilateral");//세변의 길이가 같다.
				}else if(arr[0]== arr[1] || arr[1]== arr[2]) {//두변의 길이가 같을 경우
					System.out.println("Isosceles");//Isosceles를 출력한다.
				}else {//그 외의 경우
					System.out.println("Scalene");//Scalene를 출력한다.
				}
			}else {//삼각형의 조건을 충족하지못한경우 Invalid를 말한다.
				System.out.println("Invalid");
			}
		}
	}

}
