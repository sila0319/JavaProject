//5���� ��� �� FBI ����� ã�� ���α׷��� �ۼ��Ͻÿ�.
//
//FBI����� ����� ø������ FBI�� ����ִ�. 
//
//�Է�
//5�� �ٿ� ����� ø�������� �־�����. ø�������� ���ĺ� �빮��, ���� 0~9, ��� (-)�θ� �̷���� ������, �ִ� 10�����̴�.
//
//���
//ù° �ٿ� FBI ����� ����Ѵ�. �̶�, �ش��ϴ� ����� �� ��° �Է������� �������� �����Ͽ� ����ؾ� �ϸ�, 
//������������ ����ؾ� �Ѵ�. ���� FBI ����� ���ٸ� "HE GOT AWAY!"�� ����Ѵ�.

package Bronze2;

import java.util.Scanner;

public class FBI_2857 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count =0;//�����ƴ��� �� �����ƴ��� �� �� �ִ� ī��Ʈ
		
		for (int i = 0; i < 5; i++) {//�ټ����� ��� �� ã��
			String name = sc.nextLine();//�̸��� �Է¹޴´�.
			if(name.contains("FBI")) {//"FBI"��� �̸��� ���� ���
				System.out.print((i+1)+" ");//������� �ִ��� ���Ѵ�  i��0���� �����ϹǷ� +1�� ���ؼ� ���Ѵ�.
				count++;//FBI�� ã���� ��� count�� +1�Ѵ�.
			}
		}
		if(count==0) {//���� ī��Ʈ�� 0�̶�� FBI�� ��ã���� �̹Ƿ� 
			System.out.println("HE GOT AWAY!");//"HE GOT AWAY!"�� ����Ѵ�.
		}
		
	}
}
