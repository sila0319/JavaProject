package Bronze3;

import java.util.Scanner;

public class ���丮�� {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();//� ���丮�� ����� ���� �޴´�.
		int result =n ; //result�� ���丮�� ����� ��º���
		int num = n; //n-i�� num���ٰ� ��� result�� ���Ѵ�.
		for (int i = 1; i < n; i++) {//1~n-1�� ��ŭ ����.
			result = (num-i)*result;
			//�ʹ��� result�� n�̹Ƿ� n-i*result�� �Ѵ�. 
		}
		if(n==0) {
			System.out.println(1);
		}else {
			System.out.println(result);
		}
	}

}
