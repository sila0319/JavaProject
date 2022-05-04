//문장이 주어졌을 때, 단어를 모두 뒤집어서 출력하는 프로그램을 작성하시오. 단, 단어의 순서는 바꿀 수 없다. 
//단어는 영어 알파벳으로만 이루어져 있다.
//
//입력
//첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있으며, 문장이 하나 주어진다. 
//단어의 길이는 최대 20, 문장의 길이는 최대 1000이다. 단어와 단어 사이에는 공백이 하나 있다.
//
//출력
//각 테스트 케이스에 대해서, 입력으로 주어진 문장의 단어를 모두 뒤집어 출력한다.
//
//예제 입력 1 
//2
//I am happy today
//We want to win the first prize
//예제 출력 1 
//I ma yppah yadot
//eW tnaw ot niw eht tsrif ezirp

package Bronze1;

	import java.util.Scanner;

	public class 단어_뒤집기_9083 {
		public static void main(String[] args)   {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();//뒤집을 문장의 testcase수를 받는다.
		sc.nextLine();//nextLine의 빈값을 없앤다.
		
		for (int i = 0; i < t; i++) {//t값만큼 반복 
			String s = sc.nextLine();//문자열 s를 담는다.
			String [] arr = s.split(" ");//문장인 s를 단어 단위로 짤라서 배열에 담는다.
			
			for (int j = 0; j < arr.length; j++) {//단어의 개수만큼 돌아간다.
				System.out.print(new StringBuffer(arr[j]).reverse().toString() +" ");
				//String에 reverse라는 메소드가 존재한다. reverse는 문자를 거꾸로 배열하는 메소드이다.
				//그러므로 arr[j]에 담긴값이 단어 단위로 담겨있으므로 거꾸로 뒤집으면 원하는 정답이된다.
				
		}
			System.out.println();//한줄 뛰기
		}
		
		
		}
	}


