

package Main;
import java.util.Scanner;

/*���л��� ���
 * 
 * ����ġ ��ȣ�� ���л��� ���� ��ȣ�� ����̸� �� ����ġ�� ���¸� �ٲ۴�.
 * 3�� �Է¹����� 3���� 6���� ����ġ ���¸� �ٲ۴�.
 * 
 * 
 * 
 */

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//����ġ ����
		int [] arr = new int [n+2];//����ġ ���� ����
		
		for (int i = 1; i < arr.length-1; i++) {//����ġ ���� �ޱ�
			arr[i]= sc.nextInt();
		}
		
		int stu = sc.nextInt();//�л��� ��ŭ ���ư���.
		for (int i = 0; i < stu; i++) {
			int gender = sc.nextInt(); //�л��� ����
			int number = sc.nextInt();	//�л��� ��ȣ
			if(gender ==1) {//���л��� ��
				for (int j = 1; j < arr.length-1; j++) {
					if(j%number==0) {//����ġ ��ȣ�� ���л��� ���� ��ȣ�� ����϶�
						if(arr[j]==0) {//����ġ ������ȣ�� 0�̸� 1�ιٲ۴�.
							arr[j]=1;
						}else {//����ġ ������ȣ�� 1�̸� 0���� �ٲ۴�.
							arr[j]=0;
						}
					}
				}
				
//				for (int j = 1; j < arr.length-1; j++) {
//					System.out.print(arr[j]+" ");
//					if(j%10==0)System.out.println();
//				}

			}else {//���л��� ��
				for (int j = 1; j < arr.length-1; j++) {
					if(number-j>0 && number+j <arr.length-1) {
						if(arr[number+j]==arr[number-j] && arr[number-j]==0) {
							arr[number+j] = arr[number-j] = 1;
						}else if(arr[number+j]==arr[number-j] && arr[number-j]==1) {
							arr[number+j] = arr[number-j] = 0;
						}
					}
				}
				if(arr[number]==0) {
					arr[number]=1;
				}else {
					arr[number]=0;
				}
				
			}
			
		}
		
		for (int i = 1; i < arr.length-1; i++) {
			System.out.print(arr[i]+" ");
			if(i%20==0)System.out.println();
		}
	}
}
		
		
			
