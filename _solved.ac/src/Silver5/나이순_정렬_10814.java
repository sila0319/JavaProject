//�¶��� ������ ������ ������� ���̿� �̸��� ������ ������� �־�����. 
//�̶�, ȸ������ ���̰� �����ϴ� ������, ���̰� ������ ���� ������ ����� �տ� ���� ������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//�Է�
//ù° �ٿ� �¶��� ���� ȸ���� �� N�� �־�����. (1 �� N �� 100,000)
//
//��° �ٺ��� N���� �ٿ��� �� ȸ���� ���̿� �̸��� �������� ���еǾ� �־�����. 
//���̴� 1���� ũ�ų� ������, 200���� �۰ų� ���� �����̰�, �̸��� ���ĺ� ��ҹ��ڷ� �̷���� �ְ�, ���̰� 100���� �۰ų� ���� ���ڿ��̴�. �Է��� ������ ������ �־�����.
//
//���
//ù° �ٺ��� �� N���� �ٿ� ���� �¶��� ���� ȸ���� ���� ��, 
//���̰� ������ ������ ������ �� �ٿ� �� �� ���̿� �̸��� �������� ������ ����Ѵ�.
//
//���� �Է� 1 
//3
//21 Junkyu
//21 Dohyun
//20 Sunyoung
//���� ��� 1 
//20 Sunyoung
//21 Junkyu
//21 Dohyun


package Silver5;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;


public class ���̼�_����_10814 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();// ������ ����� ���� �Է¹޴´�.
		String [][] arr = new String[t][2];
		//��� ����ŭ ����, �ϳ��� ������� , �ϳ��� ��� �̸��� ������� �޴´�.
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.next();//���ޱ�.
			}
		}
		//������ �ϴµ� �̹����� ���ڻ��·� �������Ѵ�. ������ ���ڸ� ���ڷ� �ٲ��Ŀ� ������ ���� ���ϰ���
		//�ٽ� ���ڷ�����Ѵٴ� ���� �߿��ϴ�. �׷��Ƿ� String���� ����� ���� ���� Intefer.parseInt()������ؼ� ���ڷιٲ���
		//�ΰ��� ���� ���� �Ŀ� ���� ���� ������ ū���� �ڷ� �����Ѵ�.
		 Arrays.sort(arr,new Comparator<String[]>(){
	            @Override
	            public int compare(String[] one, String[] two){
	                return Integer.compare(Integer.parseInt(one[0]),Integer.parseInt(two[0]));
	            }
	        });
		 
		 //���� �� ���ϱ�
		for (String []i  : arr) {
			for(String j : i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
