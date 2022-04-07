package _첫번째과제;

import java.util.Scanner;

public class _24번문제 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int oddnum =0;
		int evennum =0;
		System.out.println("정수 입력<종료 : -1> : ");
		
		while (true) {
			int num = sc.nextInt();
			if(num==-1) {
				System.out.printf("짝수 : %d개, 홀수 : %d개, 전체 : %d개 입력",evennum, oddnum,evennum+oddnum);
				break;
			}else if(num%2==0) {
				evennum++;
			}else if(num%2!=0) {
				oddnum++;
			}
		}
	}
}
