package Silver4;

import java.util.Scanner;

public class 요세푸스_문제_1158 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //1~n값까지 생성
		int k = sc.nextInt(); //k번쨰 숫자 제거 
		int count =-1;//배열의 위치값은 
		int [] arr = new int[n]; // 1~n값 까지 담을 배열 선언
		int [] result = new int[n]; //arr에서 k값 만큼 짜른 수를 result에다가 담는다
		
		for (int i = 0; i < arr.length; i++) {// n까지의 숫자 넣기
			arr[i] = i+1;
		}
		
		for (int i = 0; i < arr.length; i++) {  //n값만큼 돌아야한다.
			int temp =0;

			while (true) {//temp가 3이 되면 멈추도록한다.
				count +=1; //몇번째 위치의 사람을 추가할지에 대한 count
				temp ++;//k만큼 더했을 경우 그 사이에 제거된 사람이 있을경우를 체크한다.
				if(count==n) { // count가 n과 같게된다면 0번째로 돌아가야한다. 오버플로우발생
					count = count-n;
				}
				if(arr[count]!=0 && temp ==k) { 
					//arr[count]의 값이 0이 아니고 temp가 k랑 같다면 멈춘다. 왜냐하면 이상황때는 사람을 찾았기 때문이다.
					break;
				}else if(arr[count]==0) {//arr[count]의 값이 0일 경우 temp를 한번더 돌아야한다. 
					temp--;
				}
			}
			
			result[i] = arr[count]; //count에 위치한 사람을 result에 넣는다.
			arr[count] =0;// 넣은 count위치의 사람을 제거한다. 
			
			//System.out.println("카운트의 값 "+count+" result의 값" + result[i] +" i의 값" + i);		
		
		}
		
		//아래는 출력 
		System.out.print("<");
		for (int i = 0; i < result.length; i++) {
			if(i!=result.length-1)System.out.print(result[i]+", ");
			else if(i==result.length-1) System.out.print(result[i]);
		}
		for (int i : result) {
			
		} 
		System.out.print(">");
	}
}
