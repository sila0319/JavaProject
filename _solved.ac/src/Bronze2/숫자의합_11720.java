//N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//�Է�
//ù° �ٿ� ������ ���� N (1 �� N �� 100)�� �־�����. ��° �ٿ� ���� N���� ������� �־�����.
//
//���
//�Է����� �־��� ���� N���� ���� ����Ѵ�.

package Bronze2;

import java.util.Scanner;

public class ��������_11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//��� ���ڸ� �������� �޴´�.
		int result = 0;//����� �� ������ ����
		String sum = sc.next();//��° �ٿ� ���� n���� ��������־����Ƿ� for�� �ȿ� ������� �ʾƵ��� �ѹ��� ���ڸ� �б� ����
		for (int i = 0; i < n; i++) {//n����ŭ for�� ����
			result += sum.charAt(i)-'0'; //sum�� ����Ǿ��ִ� ���ڸ� charAt(i)�� ����Ͽ��� �� ���ھ� ���� �ޱ�
		}
		System.out.println(result);//���Ѱ����
	}
}
