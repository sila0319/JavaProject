//���� n(0 < n < 1000)�� ���� ����� �־����� ��, 
//��Ͽ� ����ִ� ���� n�� ������� �ƴ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//�Է�
//ù° �ٿ� n�� �־�����. ���� �ٺ��� �� �ٿ� �� ���� ��Ͽ� ����ִ� ���� �־�����.
//�� ���� 0���� ũ��, 10,000���� �۴�. ����� 0���� ������.
//
//���
//��Ͽ� �ִ� ���� n�� ������� �ƴ����� ���� �� ���� ���ó�� ����Ѵ�.

package Bronze3;

import java.util.Scanner;

public class ���ã��_4504 {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//� ���� ����� ã������ ���Ѵ�.
			
		while(true) {//���ѹݺ��Ѵ�.
			int sum = sc.nextInt();//sum���� �޾��ְ�
			if(sum==0) {//sum���� 0�� ��쿡�� while�� �ݺ��� �����.
				break;
			}else if(sum%n==0) {//sum�� ���� ���� �������� ���� 0 �ϰ�� sum�� n�� ����� �ȴ�.
				System.out.println(sum+" is a multiple of "+n+".");
			}else if(sum%n!=0) {//sum�� ���� ���� �������� ���� 0�� �ƴ� ��� sum�� n�� ����� �ƴϴ�.
				System.out.println(sum + " is NOT a multiple of "+n+".");
			}
		}
			
	}
}
//�� ���� ������ ��� 3�� ã�°ſ��� sum%n���ؾ��ϴµ� sum%3�� �ع��ȴ�. 
