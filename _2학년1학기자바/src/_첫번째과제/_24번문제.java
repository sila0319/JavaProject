package _ù��°����;

import java.util.Scanner;

public class _24������ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int oddnum =0;
		int evennum =0;
		System.out.println("���� �Է�<���� : -1> : ");
		
		while (true) {
			int num = sc.nextInt();
			if(num==-1) {
				System.out.printf("¦�� : %d��, Ȧ�� : %d��, ��ü : %d�� �Է�",evennum, oddnum,evennum+oddnum);
				break;
			}else if(num%2==0) {
				evennum++;
			}else if(num%2!=0) {
				oddnum++;
			}
		}
	}
}
