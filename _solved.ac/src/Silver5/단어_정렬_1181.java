//알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
//
//길이가 짧은 것부터
//길이가 같으면 사전 순으로
//입력
//첫째 줄에 단어의 개수 N이 주어진다. (1 ≤ N ≤ 20,000) 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 
//주어지는 문자열의 길이는 50을 넘지 않는다.
//
//출력
//조건에 따라 정렬하여 단어들을 출력한다. 단, 같은 단어가 여러 번 입력된 경우에는 한 번씩만 출력한다.
//
//예제 입력 1 
//13
//but
//i
//wont
//hesitate
//no
//more
//no
//more
//it
//cannot
//wait
//im
//yours	
//
//예제 출력 1 
//i
//im
//it
//no
//but
//more
//wait
//wont
//yours
//cannot
//hesitate

package Silver5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 단어_정렬_1181 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//몇개의 단어를 입력받을지를 정한다.
		String [] arr =new String[n];//n값만큼 배열의 크기를 선언한다.
		for (int i = 0; i < arr.length; i++) {//배열에 값 넣기
			arr[i] = sc.next();
		}
		
		Arrays.sort(arr, new Comparator<String>(){
			//Comparator를 사용하여 배열을 하면서 String값 비교를 한다.
			//사전순서로 배열을하면서 단어의 길이가 같은경우 또한 정렬을 한다. 
			public int compare(String s1, String s2) {
				//단어의 길이가 같을 경우 
				if(s1.length() == s2.length()) {
					return s1.compareTo(s2);
				}
				//그외의 경우
				else {
					return s1.length() - s2.length();
				}
			}
		});
		
		System.out.println(arr[0]);
		//밑의 코드는 0값을 입력안한다. 그러므로 arr[0]번째 값을 먼저 말한다.
		for (int i = 1; i < arr.length; i++) {
			//arr[i+1]로 비교를하면 배열오류가 나므로 1부터시작해 arr[i-1]부터 비교를해서 
			//출력을 한다.
			if(!arr[i].equals(arr[i-1])) {
				//arr[i]와 arr[i-1]의 값이 같지 않다면
				//arr[i]의 값을 출력을 한다.
				System.out.println(arr[i]);
			}
		}	
	}	
}