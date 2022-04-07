package Bronze3;

//문제
//각 숫자 사이에는 1cm의 여백이 들어가야한다.
//1은 2cm의 너비를 차지해야한다. 0은 4cm의 너비를 차지해야한다. 나머지 숫자는 모두 3cm의 너비를 차지한다.
//호수판의 경계와 숫자 사이에는 1cm의 여백이 들어가야한다.
//예를 들어 위의 120 같은 경우,  각 숫자 사이에 여백이 1cm 씩 2개 들어간다.
//1은 2cm, 2는 3cm, 0은 4cm를 차지한다. 오른쪽, 왼쪽 경계에서 각각 여백이 1cm씩 차지한다. 
//따라서 총 2 + 2 + 3 + 4 + 1 + 1 = 13(cm) 가 된다.
//
//입력
//재석이는 고객에게 전달해야할 호수판의 너비가 얼마나 되는지 궁금해졌다. 재석이를 도와주자!
//호수판에 들어갈 숫자 N의 범위는 1 ≤ N ≤ 9999 이다.
//입력은 마지막에 0이 들어오기 전까지 계속해서 줄 단위로 주어진다.
//또한, 마지막의 0은 처리하지 않는다.
//
//출력
//각 입력마다 얼마만큼 너비를 차지하는지 정수로 출력하면 된다.
//각 출력은 줄바꿈으로 구분되어야한다.


import java.util.Scanner;

public class 집주소_1284 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0;//입력받은 숫자의 넓이 합
		while (true) {//몇번 받을지 알수 없으므로 무한반복
			String name = sc.nextLine();//문자를 입력받는다.
			if(name.equals("0")) {// 만약에 받은 문자가 0 일 경우 반복문 탈출
				break;
			}else {
				String [] arr = name.split(""); //받은 문자열 배열에다가 잘라서 넣기
				num =arr.length+1; //입력 받은 문자 사이의 배열 1cm 더해주기
				for (int i = 0; i < arr.length; i++) {//문자열 길이 만큼 반복
					if(arr[i].equals("1")) {//arr[i]가 1일 경우 num값에 2 더하기
						num +=2;
					}else if (arr[i].equals("0")) {//arr[i]가 0일 경우 num값에 4 더하기
						num +=4;
					}else {//그 외의 문자는 num에 3을 더한다.
						num +=3;
					}
				}System.out.println(num); //답 출력
			}
		}
	}
}
