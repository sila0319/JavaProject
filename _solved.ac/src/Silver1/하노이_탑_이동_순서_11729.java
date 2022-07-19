package Silver1;

import java.util.Scanner;

public class �ϳ���_ž_�̵�_����_11729 {
	static StringBuilder sb = new StringBuilder();
	
	/*
	 * from�� �ϳ���ž�� ��ó���� ��ġ�� ��
	 * to�� ��������
	 * by�� �߰�����
	 * */
	static void HanoiTowerMove(int num, int from, int by, int to)
	{
		if(num==1) {
			sb.append(from+" "+to+"\n");
			return;
		}
			// A -> C�� �ű�ٰ� ������ ��,
			// STEP 1 : N-1���� A���� B�� �̵� (= start ������ N-1���� ������ mid �������� �ű��.)
			HanoiTowerMove(num-1, from, to, by);
			// STEP 2 : 1���� A���� C�� �̵� (= start ������ N��° ������ to�������� �ű��.)
			sb.append(from+" "+to+"\n");
			// STEP 3 : N-1���� B���� C�� �̵� (= mid ������ N-1���� ������ to �������� �ű��.)
			HanoiTowerMove(num-1, by, from, to);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();//���������� ���� �ϳ����� ���� 
		sb.append((int)(Math.pow(2, n)-1)).append('\n'); //�̵�Ƚ���� n���� �ϳ��̰� �ִٸ� 2*n -1��ŭ�� �̵�Ƚ���̴�.
		
		HanoiTowerMove(n,1,2,3);//������� �ϳ����� ����, ��������, �߰�����, ��������
		System.out.println(sb);//���
		
	}	
}
