package _ù��°����;

import java.util.Scanner;

public class _15������ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		do {
			System.out.println("1. �簢��");
			System.out.println("2. ��");
			System.out.println("3. �ﰢ��");
			System.out.println("4. ����");
			System.out.println("�޴��� �����Ͻÿ� : ");
			int num = sc.nextInt();
			if(num==4) {
				break;
			}
			else if(num>0 && num <4) {
			System.out.printf("%d�� �޴��� �����Ͽ����ϴ�. %n",num);
				
			}else {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
			
		}while(true);
	}

}
