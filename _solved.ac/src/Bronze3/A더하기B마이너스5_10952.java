//�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//�Է�
//�Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�.
//
//�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, 
//�� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
//
//�Է��� ���������� 0 �� ���� ���´�.
//
//���
//�� �׽�Ʈ ���̽����� A+B�� ����Ѵ�.

package Bronze3;

import java.util.Scanner;

public class A���ϱ�B���̳ʽ�5_10952 {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		while (true) {//���ѹݺ��Ѵ�.
			int a = sc.nextInt();//a�����޴´�
			int b = sc.nextInt();//b�����޴´�
			if(a==b&&a==0) {//a��b�� �Ѵ� 0�ϰ�� �����
				break;
			}else {
				System.out.println(a+b);//�ƴҰ�� a+b�� ���� ���Ѵ�.
			}
		}
	}
}
