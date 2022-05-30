package Silver5;

import java.util.Scanner;

public class 그룹_단어_체커_1306 {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result =0;
		
		for (int i = 0; i < n; i++) {//입력받은 문자의 수 만큼 더하게된다.
			int count =0;//count가 0이 아니면 집합이아님.
			String[] c = sc.next().split("");
			int [] arr = new int[26];
			
			for (int j = 0; j < c.length-1; j++) {
				for (int j2 = 0; j2 < c.length; j2++) {
					int k = j+1;
					if(c[j].equals(c[k])) {
						k++;
					}else {
						j2=k-1;
						char ch = c[j].charAt(0);
						arr[ch-97]+=1;//문자열의 아스키코드 값 위치에 +1을 해준다.
						break;
					}
				}
			}
			char ch = c[c.length-1].charAt(0);
			arr[ch-97]+=1;//문자열의 아스키코드 값 위치에 +1을 해준다.
			
			//이부분을 처리하고나서 전체의 결과값을 처리한다. 
				for (int k2 = 0; k2 < arr.length; k2++) {//정수가 담긴곳을 순회해서 2보다같거나 클 경우에는 집합이 아니게 됨.
					if(arr[k2] >=2) {//2보다 클경우 count를 플러스 시켜준다.
						count++;
					}	
				}
				if(count==0) {//카운트가 플러스1이 안되었다는것은 집합이 아니라는 의미를 뜻함.
					result++;
				}
				

		}
		
		System.out.println(result);
		
		
		
		
	}

}
