//�츮���� ������ �����̴� �� ���� ��¦�� ������ ��(0)�� ��(1)�� ������ ���ڸ� ���� ��, ��, ��, ��, �� �����Ѵ�. 
//�� �� ��¦�� ������ ���� �� ��¦�� �� Ȥ�� �� ������ �־��� �� ��(�� �� ��, �� �� ��), ��(�� �� ��, �� �� ��), ��(�� �� ��, �� �� ��), ��(�� �� ��), ��(�� �� ��) �� � �������� �����ϴ� ���α׷��� �ۼ��϶�.
//
//�Է�
//ù° �ٺ��� ��° �ٱ��� �� �ٿ� ���� �� �� ���� ��¦���� ���¸� ��Ÿ���� �� ���� ����(0 �Ǵ� 1)�� ��ĭ�� ���̿� �ΰ� �־�����.
//
//���
//ù° �ٺ��� ��° �ٱ��� �� �ٿ� �ϳ��� ����� ���� A, ���� B, ���� C, ���� D, ��� E�� ����Ѵ�.

package Bronze3;

import java.util.Scanner;

public class ������_2490 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result =0;//��갪 
		
		for (int i = 0; i < 3; i++) {//3�� �������
			result =0;//���ʱ�ȭ
			for (int j = 0; j < 4; j++) {//��4��������
				int n = sc.nextInt();
				result +=n;
			}
			if(result==4) {//��4���� �� 4�� ��
				System.out.println("E");
			}else if(result==3) {//��4���� �� 3�̸� ��
				System.out.println("A");
			}else if(result==2) {//��4���� �� 2�� ��
				System.out.println("B");
			}else if(result==1) {// �� 4���� �� 1�� ��
				System.out.println("C");
			}else if(result==0){// ��4���� �� 0�̸� ��
				System.out.println("D");
			}
		}
		
	}
}



