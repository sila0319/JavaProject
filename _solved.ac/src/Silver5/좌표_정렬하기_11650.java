
//문제
//2차원 평면 위의 점 N개가 주어진다. 좌표를 x좌표가 증가하는 순으로, 
//x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 점의 개수 N (1 ≤ N ≤ 100,000)이 주어진다. 
//둘째 줄부터 N개의 줄에는 i번점의 위치 xi와 yi가 주어진다. 
//(-100,000 ≤ xi, yi ≤ 100,000) 좌표는 항상 정수이고, 위치가 같은 두 점은 없다.
//
//출력
//첫째 줄부터 N개의 줄에 점을 정렬한 결과를 출력한다.
//
//예제 입력 1 
//5
//3 4
//1 1
//1 -1
//2 2
//3 3
//예제 출력 1 
//1 -1
//1 1
//2 2
//3 3
//3 4

package Silver5;


	import java.util.Scanner;
	import java.util.Arrays;
	import java.util.Comparator;

	public class 좌표_정렬하기_11650 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();//몇개의 좌표를 받을지 정한다.
			int [][] arr = new int[n][2];//x.y 좌표를 담을 이차원배열 선언.
			for (int i = 0; i < arr.length; i++) {
				//이차원배열에 x,y를 담는다.
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			Arrays.sort(arr,new Comparator<int[]>() {
				//이차원 배열을 한다. 
				@Override
				public int compare(int[] o1, int[] o2) {
					if(o1[0] == o2[0])//o2와 o1이 같을 경우. 
						return o1[1]-o2[1];//내림차순 정렬을한다.
					else
						return o1[0]-o2[0];//내림차순 정렬을한다. 
				}
			});
			for (int[] i : arr) {//이차원 배열 말하기
				for(int j : i) {
					System.out.print(j+" ");
				}
				System.out.println();
			
			}
			
		}
	}

