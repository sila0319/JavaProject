package Bronze2;



	import java.util.Scanner;


	public class �Ǻ���ġ��5_10870 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int f0 = 0; //��â�� �Ǻ���ġ�� f0�� ���� 0
			int f1 = 1; //��â�� �Ǻ���ġ�� f1�� ���� 1
			int sum1 =0; // ����� 
			for (int i = 0; i < n; i++) {
				sum1 = f0+f1; //sum1�� f0+f1�� ���̴�
				if(i%2==1) { //���࿡ i%2�� ���� 1�� ���� f0�� sum1�� �������Ѵ�.
					f0= sum1;
				}else {//�ƴ� ���� f1=sum1�� �Ǿ����. 
					f1=sum1;
				}
			}
			System.out.println(sum1);//������ 

			
		}
	}

