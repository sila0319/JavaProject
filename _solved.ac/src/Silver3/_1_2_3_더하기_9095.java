package Silver3;

	import java.util.Scanner;

	public class _1_2_3_���ϱ�_9095 {
		
		static int cnt=0;//����Ǽ��� ����� cnt����
		public static void cal (int n) {//int n�� �޾Ƽ� �����Ѵ�.
			if(n ==0) {//n�� 0�̵� ��� ����Ǽ��� �� ����� ��
				cnt ++;
				return ;
			}
			if(n-1>=0){
				//n-1>=0�� ��� n-1�� ���� �ٽ� cal(n-1)�� �Ѵ�.
				//���� �Ʒ��� if���� n-2�� ���� n-3���� ����
				//��� ����� ���� ����ϰ� �ȴ�.
				//n-2�� ������ cal���ϰ� n-3������ �����ϹǷ� ������Ǽ��� ����̵ȴ�.
				cal(n-1);
			}
			if(n-2>=0) {
				cal(n-2);
			}
			if(n-3>=0) {
				cal(n-3);
			}
		}

	   public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int t = sc.nextInt(); //������ Ƚ���� �Է¹޴´�.
	      
	      for (int i = 0; i < t; i++) {//������ Ƚ����ŭ �ݺ�
			int n = sc.nextInt();//� ���� 1,2,3,���ϱ����� �޴´�.
			cal(n);//����Լ� cal(n)�� ����Ѵ�.
			System.out.println(cnt);//cnt���
			cnt =0;//cnt �ʱ�ȭ 
		}
	      
	   }
	}	


