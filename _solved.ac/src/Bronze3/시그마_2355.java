//�� ���� A�� B�� �־����� ��, �� ���� ���̿� �ִ� ���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. ���̿� �ִ� ������ A�� B�� �����Ѵ�.
//ù° �ٿ� �� ���� A, B�� �־�����. (-2,147,483,648 �� A, B �� 2,147,483,647)
//ù° �ٿ� ���� ����Ѵ�. (-2,147,483,648 �� �� �� 2,147,483,647)

package Bronze3;

import java.util.Scanner;

public class �ñ׸�_2355 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();//a���� �޴´�.
		long b = sc.nextLong();//b���� �޴´�.
		
		if(a <= b) { //b�� a���� ũ�ų� �������
			System.out.println(((b-a+1)*(b+a))/2);
			//b=6,a=3 �̸� (6-3+1) * (6+3) /2 = (4) * (9) /2 = 18�� ���´�.
			//b=3,a=1 �̸� (3-1+1) * (3+1) /2 = 3 * 4 /2 = 6�� ���´�.
			
		}else {
			System.out.println(((a-b+1)*(a+b))/2);
			//b�� a���� ������쿡�� ���� ������ �ݴ�� �����ָ�ȴ�.
		}
		
		

	}

}
