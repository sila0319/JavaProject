package _����Ư��_�ڷᱸ��;

import java.util.Scanner;

public class �ϳ���_Ÿ��_����Լ�_02 {
	static void HanoiTowerMove(int num, char from, char by, char to)
	{
		if(num==1) System.out.printf("����1�� %c���� %c�� �̵� \n",from,to);
		else
		{
			HanoiTowerMove(num-1, from, to, by);
			System.out.printf("����%d�� %c���� %c�� �̵� \n",num,from,to);
			HanoiTowerMove(num-1, by,from ,to);

		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		�ϳ���_Ÿ��_����Լ�_02 HTM = new �ϳ���_Ÿ��_����Լ�_02();
		
		System.out.println("��� �ϳ��̸� �ű���?");
		int n = sc.nextInt();
		System.out.println("������� ��������,��������,���������� �Է����ּ���\n ex) ABC");
		sc.nextLine();
		String s = sc.nextLine();
		HTM.HanoiTowerMove(n,s.charAt(0),s.charAt(1),s.charAt(2));
		HanoiTowerMove(n,s.charAt(0),s.charAt(1),s.charAt(2));
		System.out.println();
		
		//�Ʒ��� ������ ����Լ�
		HTM.HanoiTowerMove(3,'A','B','C');
		

	}

}
