package Silver2;


	import java.util.Scanner;
	 
	public class ����_�ڸ���_2805 {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int[] tree = new int[N];
			
			int min = 0;
			int max = 0;
			
			for(int i = 0; i < N; i++) {
				tree[i] = sc.nextInt();
				
				/*
				 * ������ �� �ִ��� ���ϱ� ���� �� �Է� ������ max ������ ���Ͽ�
				 * �Է� ���� ������ max���� Ŭ ��� max ���� �ش� ������ ���̷� �������ش�. 
				 */
				if(max < tree[i]) {
					max = tree[i];
				}
			}
			
			// �̺� Ž�� (upper bound)
			while(min < max) {
				
				int mid = (min + max) / 2;
				long sum = 0;
				for(int treeHeight : tree) {
					
					/*
					 *  tree�� �߸� ���� = tree�� ���� - �ڸ��� ��ġ(mid)
					 *  tree�� �߸� ������ ���� ���Ѵ�.
					 *  �� �� �ڸ��� ��ġ�� �־��� ������ ���̺��� Ŭ �� �ֱ� ������
					 *  0 ������ ���(=����)���� �ջ��� ���� �ʰ� ����� �ջ��ϵ��� �ؾ��Ѵ�.
					 */
					if(treeHeight - mid > 0) { 
						sum += (treeHeight - mid);
					}
				}
				
	 
				/*
				 * �ڸ� ���� ������ ���� M���� �۴ٴ� ����
				 * �ڸ��� ��ġ(����)�� ���ٴ� �ǹ��̹Ƿ� ���̸� ����� �Ѵ�.
				 * ��, ����(max)�� �ٿ��� �Ѵ�.
				 */
				if(sum < M) {
					max = mid;
				}
				
				/*
				 * �ڸ� ���� ������ ���� M���� ũ�ٴ� ����
				 * �ڸ��� ��ġ(����)�� ���ٴ� �ǹ��̹Ƿ� ���̸� ������ �Ѵ�.
				 * ����, ���� ��쿡�� �ִ��� ���� �ڸ��� ���� �ڸ��� ���̸�
				 * ������ �ϹǷ� ����(min)�� �÷��� �Ѵ�.
				 */
				else {
					min = mid + 1;
				}
			}
			
			System.out.println(min - 1);
			
		}
	}


