package Gold5;

import java.util.Scanner;
import java.util.Stack;

public class ����_14719 {
	static int [][] arr;
	static Stack <Integer>stack = new Stack<>();//���ٿ� ��Ʈ������ ������ ��� stack�� �ִ´�. 
	static int cnt =0;//Ư�� ������ �Ǹ� cnt�� ��� ���� ������ �ȴ�.
	static int result =0;//cnt�� ���� ���޹��� ���� ��������� ����Ѵ�. 
	static void check() {//������ �迭 ���پ� �˻��ؼ� ������ ���� �� �ִ����� üũ�Ѵ�.
		for (int i = 0; i < arr.length; i++) {
			cnt =0;//�����Ҷ� ���� cnt�� �ʱ�ȭ�ؾ��Ѵ�.
			stack.clear();//�����Ҷ����� stack�� ��� ���� �ʱ�ȭ �ؾ��Ѵ�.
			for (int j = 0; j < arr[i].length; j++) {//���ٿ� �����ϴ� ������ ��Ʈ������ �˻��Ͽ��� ������ ������ �ƴ����� üũ�Ѵ�.
				if(stack.empty()) {//stack�� ������� ���
					if(arr[i][j]==1) {//arr[i][j]�� ���� 1�� ��� ���ÿ� 1�� �����Ѵ�.
						stack.push(1);
					}
				}else if(!stack.empty()) {//������ ������� �ʾ����� arr[i][j]�� ���� 1�� ��쿡 �� ���̿� ��� ������ �����Ѵ�.
					if(arr[i][j]==1) {//1�� ��� ���� ���� ����̹Ƿ� result�� ������ �߰��Ѵ� ���� cnt�� 0���� �ʱ�ȭ�Ѵ�. 
						//������ ����������� ��Ȳ���� 1�� �������� ���� ���� ����̹Ƿ� cnt�� ��䰪�� result���ٰ� �Űܾ��Ѵ�.
						//stack.pop();
						result += cnt;
						cnt =0;
					}else if(arr[i][j]==0) {//������ ��������ʰ� arr[i][j]�� ���� 0�� ��쿡�� �����̹Ƿ� cnt�� �߰��Ѵ�.
						cnt++;
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();//���� ���̸� �Է¹޴´�.
		int w = sc.nextInt();//���� ���̸� �Է¹޴´�.
		arr = new int[h][w];//������ �迭 ���� 
		//������ �迭�� �׸������ʹ� ���ٷ� �Է¹��� �����̹Ƿ� ���ٷ� ������ �����ؾ��Ѵ�.
		for (int i = 0; i < w; i++) {//������ �迭 ���� ���� ������ �Ѵ�.
			int n = sc.nextInt();
			for (int j = 0; j < n; j++) {//�Է¹��� n���� ���̸� ������ ä���. 
				arr[j][i] = 1; 
			}
		}
		check();//check�Լ��� ȣ���ؼ� �˻��Ѵ�.
		System.out.println(result);//��� ���
	}
}