//4 �� 3 = 12�̴�.
//
//�� ���� ���� ������ ���� ����� �� �� �ִ�.
//
//3�� 12�� ����̰�, 12�� 3�� ����̴�.
//
//4�� 12�� ����̰�, 12�� 4�� ����̴�.
//
//�� ���� �־����� ��, ���� 3���� �� � �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//ù ��° ���ڰ� �� ��° ������ ����̴�.
//ù ��° ���ڰ� �� ��° ������ ����̴�.
//ù ��° ���ڰ� �� ��° ������ ����� ��� ��� �ƴϴ�.
//�Է�
//�Է��� ���� �׽�Ʈ ���̽��� �̷���� �ִ�. 
//�� �׽�Ʈ ���̽��� 10,000�� �����ʴ� �� �ڿ����� �̷���� �ִ�. ������ �ٿ��� 0�� 2�� �־�����. �� ���� ���� ���� ����.
//
//���
//�� �׽�Ʈ ���̽����� ù ��° ���ڰ� �� ��° ������ ������ factor��, 
//������ multiple��, �� �� �ƴ϶�� neither�� ����Ѵ�.
//
//���� �Է� 1 
//8 16
//32 4
//17 5
//0 0
//���� ��� 1 
//factor
//multiple
//neither


package Bronze3;
import java.util.Scanner;

public class �����_���_5086 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(x==y && x==0) {break;}
			else if(y%x ==0) {
				System.out.println("factor");
			}else if(x%y ==0) {
				System.out.println("multiple");
			}else {
				System.out.println("neither");
			}			
		}
	}
}