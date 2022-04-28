//온라인 저지에 가입한 사람들의 나이와 이름이 가입한 순서대로 주어진다. 
//이때, 회원들을 나이가 증가하는 순으로, 나이가 같으면 먼저 가입한 사람이 앞에 오는 순서로 정렬하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 온라인 저지 회원의 수 N이 주어진다. (1 ≤ N ≤ 100,000)
//
//둘째 줄부터 N개의 줄에는 각 회원의 나이와 이름이 공백으로 구분되어 주어진다. 
//나이는 1보다 크거나 같으며, 200보다 작거나 같은 정수이고, 이름은 알파벳 대소문자로 이루어져 있고, 길이가 100보다 작거나 같은 문자열이다. 입력은 가입한 순서로 주어진다.
//
//출력
//첫째 줄부터 총 N개의 줄에 걸쳐 온라인 저지 회원을 나이 순, 
//나이가 같으면 가입한 순으로 한 줄에 한 명씩 나이와 이름을 공백으로 구분해 출력한다.
//
//예제 입력 1 
//3
//21 Junkyu
//21 Dohyun
//20 Sunyoung
//예제 출력 1 
//20 Sunyoung
//21 Junkyu
//21 Dohyun


package Silver5;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;


public class 나이순_정렬_10814 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();// 정렬할 사람의 수를 입력받는다.
		String [][] arr = new String[t][2];
		//사람 수만큼 선언, 하나는 사람나이 , 하나는 사람 이름을 순서대로 받는다.
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.next();//값받기.
			}
		}
		//정렬을 하는데 이번에는 문자상태로 정렬을한다. 하지만 문자를 숫자로 바꾼후에 정렬을 한후 리턴값을
		//다시 숫자로줘야한다는 점이 중요하다. 그러므로 String으로 만들어 놓은 값을 Intefer.parseInt()를사용해서 숫자로바꾼후
		//두개의 값을 비교한 후에 작은 쪽을 앞으로 큰쪽을 뒤로 리턴한다.
		 Arrays.sort(arr,new Comparator<String[]>(){
	            @Override
	            public int compare(String[] one, String[] two){
	                return Integer.compare(Integer.parseInt(one[0]),Integer.parseInt(two[0]));
	            }
	        });
		 
		 //정렬 후 말하기
		for (String []i  : arr) {
			for(String j : i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
