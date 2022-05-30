package Silver5;

import java.util.Scanner;

public class 덩치_7568 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//몇명의 사람이 존재하는지 입력받는다.
		int [][] arr = new int [n][2];//몸무게와 키를 입력받는다.
		int [] result = new int [n];//랭킹을 저장한다.
		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = sc.nextInt();//몸무게를 저장한다.
			arr[i][1] = sc.nextInt();//키를 저장한다.
			result[i] = 1; //랭킹을 입력받는다. 
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < result.length; j++) {
				if(arr[i][0] > arr[j][0] && arr[i][1] > arr[j][1] ) {//키와 몸무게를 비교한다.
					
					result[j]++; //if문에서 i에 위치한 애한테 몸무게,키가 밀렸으므로 j의 순위가 상승한다.
				}	
			}
		}
		for (int i : result) {//랭킹출력하기 
			System.out.print(i+" ");
		}
	}
}