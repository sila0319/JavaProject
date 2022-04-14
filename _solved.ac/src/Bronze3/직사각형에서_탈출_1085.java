//한수는 지금 (x, y)에 있다. 직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0), 
//오른쪽 위 꼭짓점은 (w, h)에 있다. 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 x, y, w, h가 주어진다.
//
//출력
//첫째 줄에 문제의 정답을 출력한다.
//
//제한
//1 ≤ w, h ≤ 1,000
//1 ≤ x ≤ w-1
//1 ≤ y ≤ h-1
//x, y, w, h는 정수
//예제 입력 1 
//6 2 10 3
//예제 출력 1 
//1
//예제 입력 2 
//1 1 5 5
//예제 출력 2 
//1
//예제 입력 3 
//653 375 1000 1000
//예제 출력 3 
//347
//예제 입력 4 
//161 181 762 375
//예제 출력 4 
//161

//알고리즘 구상
//내가 위치한 x.y좌표에서 입력받은 w h 좌표와 0,0 좌표를 비교해야한다. 
//y값은 위아래 길이를 비교해야하므로 절댓값 계산으로 y-h,와 h-0의 길이를 넣는다.
//x값은 좌우의 길이를 비교해야하므로 절댓값 계산으로 x-w,와  x-0의 길이를 배열에 넣는다.
//그후 arrays.sort로 크기순으로 정렬하여 0번쨰 값이 최소길이 이므로 출력한다.
package Bronze3;


	import java.util.Scanner;
	import java.util.Arrays;


public class 직사각형에서_탈출_1085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int x = sc.nextInt();//x좌표값
		int y = sc.nextInt();//y좌표값
		int w = sc.nextInt();//사각형의 0,0의 반대좌표(x)
		int h = sc.nextInt();//사각형 0,0의 반대좌표 (y)
		int [] arr = new int [4];//절댓값 계산 담기
		
		//절댓값 계산으로 최소값 길이 찾기
		arr[0] = Math.abs(x-w);//x-w값을 담기
		arr[1] = Math.abs(x);//x값 담기
		arr[2] = Math.abs(y-h);//y-h값 담기
		arr[3] = Math.abs(y);//y값 담기
			
		Arrays.sort(arr);//크기순으로 정렬하기
		System.out.println(arr[0]);//최소값 0번째 말하기
		}
	}
