//5명의 요원 중 FBI 요원을 찾는 프로그램을 작성하시오.
//
//FBI요원은 요원의 첩보원명에 FBI가 들어있다. 
//
//입력
//5개 줄에 요원의 첩보원명이 주어진다. 첩보원명은 알파벳 대문자, 숫자 0~9, 대시 (-)로만 이루어져 있으며, 최대 10글자이다.
//
//출력
//첫째 줄에 FBI 요원을 출력한다. 이때, 해당하는 요원이 몇 번째 입력인지를 공백으로 구분하여 출력해야 하며, 
//오름차순으로 출력해야 한다. 만약 FBI 요원이 없다면 "HE GOT AWAY!"를 출력한다.

package Bronze2;

import java.util.Scanner;

public class FBI_2857 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count =0;//도망쳤는지 안 도망쳤는지 알 수 있는 카운트
		
		for (int i = 0; i < 5; i++) {//다섯명의 요원 중 찾기
			String name = sc.nextLine();//이름을 입력받는다.
			if(name.contains("FBI")) {//"FBI"라는 이름이 있을 경우
				System.out.print((i+1)+" ");//몇번쨰에 있는지 말한다  i는0부터 시작하므로 +1을 더해서 말한다.
				count++;//FBI를 찾았을 경우 count를 +1한다.
			}
		}
		if(count==0) {//만일 카운트가 0이라면 FBI를 못찾은것 이므로 
			System.out.println("HE GOT AWAY!");//"HE GOT AWAY!"를 출력한다.
		}
		
	}
}
