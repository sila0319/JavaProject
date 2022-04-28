
//����
//2���� ��� ���� �� N���� �־�����. ��ǥ�� x��ǥ�� �����ϴ� ������, 
//x��ǥ�� ������ y��ǥ�� �����ϴ� ������ ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//�Է�
//ù° �ٿ� ���� ���� N (1 �� N �� 100,000)�� �־�����. 
//��° �ٺ��� N���� �ٿ��� i������ ��ġ xi�� yi�� �־�����. 
//(-100,000 �� xi, yi �� 100,000) ��ǥ�� �׻� �����̰�, ��ġ�� ���� �� ���� ����.
//
//���
//ù° �ٺ��� N���� �ٿ� ���� ������ ����� ����Ѵ�.
//
//���� �Է� 1 
//5
//3 4
//1 1
//1 -1
//2 2
//3 3
//���� ��� 1 
//1 -1
//1 1
//2 2
//3 3
//3 4

package Silver5;


	import java.util.Scanner;
	import java.util.Arrays;
	import java.util.Comparator;

	public class ��ǥ_�����ϱ�_11650 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();//��� ��ǥ�� ������ ���Ѵ�.
			int [][] arr = new int[n][2];//x.y ��ǥ�� ���� �������迭 ����.
			for (int i = 0; i < arr.length; i++) {
				//�������迭�� x,y�� ��´�.
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			Arrays.sort(arr,new Comparator<int[]>() {
				//������ �迭�� �Ѵ�. 
				@Override
				public int compare(int[] o1, int[] o2) {
					if(o1[0] == o2[0])//o2�� o1�� ���� ���. 
						return o1[1]-o2[1];//�������� �������Ѵ�.
					else
						return o1[0]-o2[0];//�������� �������Ѵ�. 
				}
			});
			for (int[] i : arr) {//������ �迭 ���ϱ�
				for(int j : i) {
					System.out.print(j+" ");
				}
				System.out.println();
			
			}
			
		}
	}

