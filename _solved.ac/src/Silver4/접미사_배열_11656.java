//접미사 배열은 문자열 S의 모든 접미사를 사전순으로 정렬해 놓은 배열이다.
//
//baekjoon의 접미사는 
//baekjoon, aekjoon, ekjoon, kjoon, joon, oon, on, n 으로 총 8가지가 있고, 이를 사전순으로 정렬하면, aekjoon, baekjoon, ekjoon, joon, kjoon, n, on, oon이 된다.
//
//문자열 S가 주어졌을 때, 모든 접미사를 사전순으로 정렬한 다음 출력하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 문자열 S가 주어진다. S는 알파벳 소문자로만 이루어져 있고, 
//길이는 1,000보다 작거나 같다.
//
//출력
//첫째 줄부터 S의 접미사를 사전순으로 한 줄에 하나씩 출력한다.
//
//예제 입력 1 
//baekjoon
//예제 출력 1 
//aekjoon
//baekjoon
//ekjoon
//joon
//kjoon
//n
//on
//oon



package Silver4;

import java.util.Scanner;
import java.util.Arrays;

public class 접미사_배열_11656 {
	public static void main(String[] args)   {
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	String [] arr = new String[s.length()];
	
	for (int i = 0; i < arr.length; i++) {
		arr[i] = s.substring(i, s.length());//배열에 접미사를 담는다.
		//substring(a,b)는 a부터 b까지의 문자열을 말한다.
	}
	Arrays.sort(arr);//정렬한다
	for (String i : arr) {//결과값도출 
		System.out.println(i);
	}
	
	
	}
}

