package _첫번째과제;

import java.util.Scanner;

public class _15번문제 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		do {
			System.out.println("1. 사각형");
			System.out.println("2. 원");
			System.out.println("3. 삼각형");
			System.out.println("4. 종료");
			System.out.println("메뉴를 선택하시오 : ");
			int num = sc.nextInt();
			if(num==4) {
				break;
			}
			else if(num>0 && num <4) {
			System.out.printf("%d번 메뉴를 선택하였습니다. %n",num);
				
			}else {
				System.out.println("잘못된 입력입니다.");
			}
			
		}while(true);
	}

}
