//�ر԰� ������ �ִ� ������ �� N�����̰�, ������ ������ �ſ� ���� ������ �ִ�.
//
//������ ������ ����ؼ� �� ��ġ�� ���� K�� ������� �Ѵ�. 
//�̶� �ʿ��� ���� ������ �ּڰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//�Է�
//ù° �ٿ� N�� K�� �־�����. (1 �� N �� 10, 1 �� K �� 100,000,000)
//
//��° �ٺ��� N���� �ٿ� ������ ��ġ Ai�� ������������ �־�����. 
//(1 �� Ai �� 1,000,000, A1 = 1, i �� 2�� ��쿡 Ai�� Ai-1�� ���)
//
//���
//ù° �ٿ� K���� ����µ� �ʿ��� ���� ������ �ּڰ��� ����Ѵ�.
//
//���� �Է� 1 
//10 4200
//1
//5
//10
//50
//100
//500
//1000
//5000
//10000
//50000
//���� ��� 1 
//6
//���� �Է� 2 
//10 4790
//1
//5
//10
//50
//100
//500
//1000
//5000
//10000
//50000
//���� ��� 2 
//12

package Silver3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ����0_11047 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count =0;
		int result =0;
		Integer [] arr = new Integer[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr, Collections.reverseOrder());
		while(true) {
			count =0;
			if(k==0) {
				break;
			}
			for (int i = 0; i < arr.length; i++) {
				if( k>=arr[i]) {
					result += k/arr[i];
					k %= arr[i];
				}
			}
		System.out.println(result);
		}
	}
}