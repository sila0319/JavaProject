//�� ���� ������ �־����� ��, �� �� ���̿� �ִ� ������ ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//�Է�
//�� ���� A�� B�� �־�����.
//
//���
//ù° �ٿ� �� �� ���̿� �ִ� ���� ������ ����Ѵ�.
//
//��° �ٿ��� �� �� ���̿� �ִ� ���� ������������ ����Ѵ�.
//
//�����½�ũ
//��ȣ  ���� ����
//1	  30	
//1 �� A, B �� 1000.
//
//2	  70	
//1 �� A, B �� 10^15, A�� B�� ���̴� �ִ� 100,000.


package Bronze2;

import java.util.Arrays;
import java.util.Scanner;

public class ����_10093 {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();//2�� ������ a��b�� 10��15�±��� �����ϹǷ� long ���� ���� �޾���
		long b = sc.nextLong();
		long max =0;//a��b�� ���� �� ū�� �Ǻ��ϱ� ���� ����
		long n =0;//a��b������ ���ڰ� ����� �Ǻ�
		if(a>b) {//���� a�� b���� ũ�ٸ� a�� �� ���� ���� �������� ��
			max = a;
			a = b;
			b= max;
		}if(a!=b) {//���� b��a�� ���� ���� �ƴ� ��� a��b�� ������ ���ڴ� b-a-1�̵�
			n = b-a-1;	
		}long [] arr = new long[(int)n];//long���� a��b���޾����Ƿ� �迭���� long���� �����Ѵ�.
		System.out.println(n);//a��b���̿� ������ ��ִ��� ���
		int j =1;//a����~b���� ���� ���ڸ� 1�� ���ϱ����� ����
		int i =0;//�迭�� ���� �����ϱ����� ����
		while(n!=0) {//n�� 0�̾ƴҰ�� ���ѹݺ�
			arr[i]=a+j;//�迭�� ���ڸ� �����Ѵ�.
			j++;
			i++;
			if(a+j==b) {break;}//a+j��b�� �������� �����.
		}Arrays.sort(arr);//�迭�� �����Ѵ�.
		for (long k : arr) {//for each������ �迭�� ���� ����Ѵ�.
			System.out.print(k+" ");
		}
	}
}
