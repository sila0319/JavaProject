package Bronze3;


	import java.util.Scanner;
	
	public class ACM_ȣ��_10250 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();//�׽�Ʈ���̽� 
			int wid = 0; //������ �� ȣ ��� 
			int hei = 0; //������ �������
			for (int i = 0; i < t; i++) {
				int h = sc.nextInt();//�ǹ��� ����
				int w = sc.nextInt();// �ǹ��� ȣ��
				int n = sc.nextInt(); // ����� 
				
				
				if(n%h ==0) {//������� �Է¹��� ������ ���� �������� 0�� ���  
					hei = h*100; //����� ������ h*100�̴� h�� 0�̹Ƿ� �ش����� ���
					wid = n/h; //n/h�� �ϸ� ���� ������ ��� �����Ͽ����� �� �� ���� 
				}else {
					hei = n%h*100; //n%h�� 0�� �ƴϹǷ� ���ϱ� 100�� �ϸ��.
					wid = n/h+1; //0ȣ���� �����Ƿ� �÷��� 1����.  
				}
				System.out.println(hei+wid);
			}
			
		}
	}


