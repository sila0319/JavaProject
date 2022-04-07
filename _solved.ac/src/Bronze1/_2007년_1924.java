//오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 빈 칸을 사이에 두고 x(1 ≤ x ≤ 12)와 y(1 ≤ y ≤ 31)이 주어진다. 
//참고로 2007년에는 1, 3, 5, 7, 8, 10, 12월은 31일까지, 4, 6, 9, 11월은 30일까지, 2월은 28일까지 있다.
//
//출력
//첫째 줄에 x월 y일이 무슨 요일인지에 따라 SUN, MON, TUE, WED, THU, FRI, SAT중 하나를 출력한다.

package Bronze1;

import java.util.Scanner;

public class _2007년_1924 {
		public static void main(String[] args)  {
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();//월을 받아준다.
			int y = sc.nextInt();//요일을 받아준다.
			int result =y;//받은 요일을 result에다가 더해준다.
			int [] month = {31,28,31,30,31,30,31,31,30,31,30,31};//순서대로 1~12월까지의 일수를 저장해준 값이다.
			String [] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
			//day라는 문자열 배열에다가 일요일부터 토요일까지를 순서대로 저장
			if(x!=1) {//1월이 아닌경우
				for (int i = 0; i < x-1; i++) {//x-1만큼 돈다. month[12]고 11까지 있기떄문이다.
					//month에서 x-1만큼의 값을 다 더해서 result에다가 저장해준다.
					result += month[i];
				}
			}
	        if(result%7!=0) {//result의 다 더한값을 7로 나눈 나머지가 0이아닌경우
					result%=7;//7로나눈 나머지를 result에다가 저장한다.
					}else {//만약에 result의 나머지로 나눈값이 0일경우
						result=0;//result의 값을 0으로한다. day[7]이 없으므로 7을0으로바꿔줘야함.
					}
			System.out.println(day[result]);
			
		}
	}
//문제를 풀때 한국은 월요일부터 일요일이지만 이 문제의 경우 외국에서 번역해온 문제이기 때문에 일요일부터 토요일로 끝난다. 
//그러한 문제로 인해 문제를 푸는데 난항을겪었다. 가끔은 생각할때 외부적인 상황을 생각해서 문제를 풀어야되겠다는점을 숙지해야겠다는 생각이들었다.


