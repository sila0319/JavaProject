package Silver3;
import java.util.Scanner;

public class ����ġ_�Ѱ�_����_1244 {



/*���л��� ���
 * 
 * ����ġ ��ȣ�� ���л��� ���� ��ȣ�� ����̸� �� ����ġ�� ���¸� �ٲ۴�.
 * 3�� �Է¹����� 3���� 6���� ����ġ ���¸� �ٲ۴�.
 * 
 * 
 * 
 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//����ġ ����
		int [] arr = new int [n+1];//����ġ ���� ����
		
		for (int i = 1; i < arr.length; i++) {//����ġ ���� �ޱ�
			arr[i]= sc.nextInt();
		}
		
		int stu = sc.nextInt();//�л��� ��ŭ ���ư���.
		for (int i = 0; i < stu; i++) {
			int gender = sc.nextInt(); //�л��� ����
			int number = sc.nextInt();	//�л��� ��ȣ
			if(gender ==1) {//���л��� ��
				for (int j = 1; j < arr.length; j++) {
					
					if(j%number==0) {//����ġ ��ȣ�� ���л��� ���� ��ȣ�� ����϶�
						if(arr[j]==0) {//����ġ ������ȣ�� 0�̸� 1�ιٲ۴�.
							arr[j]=1;
						}else {//����ġ ������ȣ�� 1�̸� 0���� �ٲ۴�.
							arr[j]=0;
						}
					}
				}
			}else {//���л��� ��
				arr[number] = Math.abs(arr[number] - 1); // �ڱ� ��ȣ ���
				int r=1; //���� �ϳ��� ����Ѵ�.
				while (true) {
				if (number - r >= 1 && number + r <= n && arr[number - r] == arr[number + r]) {
					//number -r���� 1���� ũ�ų� ���� number +r���� n���� �۰ų� ���ƾ��ϰ� arr[number -r] �� arr[number+r]���� ���ƾ��Ѵ�.
					//��ĩ�ϸ� �迭�� ũ�⸦ �ʰ��ϱ� ������ ���� �����Ͽ��� ������ �ؾ��Ѵ�.
					arr[number - r] = Math.abs(arr[number - r] - 1);
					arr[number + r] = Math.abs(arr[number + r] - 1);
					r++;
				}else break;//if���� ���ǿ� �������� �ʴٸ� break�� �ϰԵȴ�.

			
			}
			
		}
		
	}
		for (int j = 1; j < arr.length; j++) {//���
			System.out.print(arr[j]+" ");
			if(j%20==0&&j!=0)System.out.println();
		}
	}
}
