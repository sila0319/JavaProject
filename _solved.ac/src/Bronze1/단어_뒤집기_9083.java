//������ �־����� ��, �ܾ ��� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��, �ܾ��� ������ �ٲ� �� ����. 
//�ܾ�� ���� ���ĺ����θ� �̷���� �ִ�.
//
//�Է�
//ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, ������ �ϳ� �־�����. 
//�ܾ��� ���̴� �ִ� 20, ������ ���̴� �ִ� 1000�̴�. �ܾ�� �ܾ� ���̿��� ������ �ϳ� �ִ�.
//
//���
//�� �׽�Ʈ ���̽��� ���ؼ�, �Է����� �־��� ������ �ܾ ��� ������ ����Ѵ�.
//
//���� �Է� 1 
//2
//I am happy today
//We want to win the first prize
//���� ��� 1 
//I ma yppah yadot
//eW tnaw ot niw eht tsrif ezirp

package Bronze1;

	import java.util.Scanner;

	public class �ܾ�_������_9083 {
		public static void main(String[] args)   {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();//������ ������ testcase���� �޴´�.
		sc.nextLine();//nextLine�� ���� ���ش�.
		
		for (int i = 0; i < t; i++) {//t����ŭ �ݺ� 
			String s = sc.nextLine();//���ڿ� s�� ��´�.
			String [] arr = s.split(" ");//������ s�� �ܾ� ������ ©�� �迭�� ��´�.
			
			for (int j = 0; j < arr.length; j++) {//�ܾ��� ������ŭ ���ư���.
				System.out.print(new StringBuffer(arr[j]).reverse().toString() +" ");
				//String�� reverse��� �޼ҵ尡 �����Ѵ�. reverse�� ���ڸ� �Ųٷ� �迭�ϴ� �޼ҵ��̴�.
				//�׷��Ƿ� arr[j]�� ��䰪�� �ܾ� ������ ��������Ƿ� �Ųٷ� �������� ���ϴ� �����̵ȴ�.
				
		}
			System.out.println();//���� �ٱ�
		}
		
		
		}
	}


