//두 양의 정수가 주어졌을 때, 두 수 사이에 있는 정수를 모두 출력하는 프로그램을 작성하시오.
//
//입력
//두 정수 A와 B가 주어진다.
//
//출력
//첫째 줄에 두 수 사이에 있는 수의 개수를 출력한다.
//
//둘째 줄에는 두 수 사이에 있는 수를 오름차순으로 출력한다.
//
//서브태스크
//번호  배점 제한
//1	  30	
//1 ≤ A, B ≤ 1000.
//
//2	  70	
//1 ≤ A, B ≤ 10^15, A와 B의 차이는 최대 100,000.


package Bronze2;

import java.util.Arrays;
import java.util.Scanner;

public class 숫자_10093 {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();//2번 조건이 a와b가 10의15승까지 가능하므로 long 으로 값을 받아줌
		long b = sc.nextLong();
		long max =0;//a와b중 뭐가 더 큰지 판별하기 위한 변수
		long n =0;//a와b사이의 숫자가 몇개인지 판별
		if(a>b) {//만약 a가 b보다 크다면 a가 더 작은 수를 가지도록 함
			max = a;
			a = b;
			b= max;
		}if(a!=b) {//만약 b와a가 같은 수가 아닐 경우 a와b의 사이의 숫자는 b-a-1이됨
			n = b-a-1;	
		}long [] arr = new long[(int)n];//long으로 a와b를받았으므로 배열또한 long으로 선언한다.
		System.out.println(n);//a와b사이에 정수가 몇개있는지 출력
		int j =1;//a부터~b까지 갈때 숫자를 1씩 더하기위한 변수
		int i =0;//배열에 값을 저장하기위해 선언
		while(n!=0) {//n이 0이아닐경우 무한반복
			arr[i]=a+j;//배열에 숫자를 저장한다.
			j++;
			i++;
			if(a+j==b) {break;}//a+j가b와 같아지면 멈춘다.
		}Arrays.sort(arr);//배열을 정렬한다.
		for (long k : arr) {//for each문으로 배열의 값을 출력한다.
			System.out.print(k+" ");
		}
	}
}
