//����
//�ﰢ���� �� ���� ���̰� �־��� �� ���� ���̿� ���� ������ ���� �����Ѵ�.
//
//Equilateral :  �� ���� ���̰� ��� ���� ���
//Isosceles : �� ���� ���̸� ���� ���
//Scalene : �� ���� ���̰� ��� �ٸ� ���
//�� �־��� �� ���� ���̰� �ﰢ���� ������ �������� ���ϴ� ��쿡�� "Invalid" �� ����Ѵ�. 
//���� ��� 6, 3, 2�� �� ��쿡 �ش��Ѵ�. 
//���� �� ���� ���̺��� ������ �� ���� ������ ���� ���� ������ �ﰢ���� ������ �������� ���Ѵ�.
//
//�� ���� ���̰� �־��� �� �� ���ǿ� ���� ����� ����Ͻÿ�.
//
//�Է�
//�� �ٿ��� 1,000�� ���� �ʴ� ���� ���� 3���� �Էµȴ�. ������ ���� 0 0 0�̸� �� ���� ������� �ʴ´�.
//
//���
//�� �Է¿� �´� ��� (Equilateral, Isosceles, Scalene, Invalid) �� ����Ͻÿ�.
//
//���� �Է� 1 
//7 7 7
//6 5 4
//3 2 5
//6 2 6
//0 0 0
//
//���� ��� 1 
//Equilateral
//Scalene
//Invalid
//Isosceles




package Bronze3;

import java.util.Arrays;
import java.util.Scanner;

public class �ﰢ����_��_��_5073 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[3];//������ ���̸� ���� �迭 ����
		while (true) {//break �ɸ��� ������ ���ѹݺ��Ѵ�.
			int count =0;//break�� �ɱ� ���� count
			for (int i = 0; i < arr.length; i++) {//������ ���̸� �޴´�.
				arr[i] = sc.nextInt();
				if(arr[i]==0) {count++;}//���� ���� ���� 0�� ��� count++�������Ѵ�.
			}
			if(count==3) {break;}//count�� 3�� �ɰ�� �����.
			Arrays.sort(arr);//�迭�� �����Ѵ�.
			
			if(arr[0]+arr[1] >arr[2]) {//�ﰢ���� ������ ������ ��� 
				if(arr[0]==arr[1] && arr[2] == arr[0]) {//������ ���̰� ���� �� �˻�
					System.out.println("Equilateral");//������ ���̰� ����.
				}else if(arr[0]== arr[1] || arr[1]== arr[2]) {//�κ��� ���̰� ���� ���
					System.out.println("Isosceles");//Isosceles�� ����Ѵ�.
				}else {//�� ���� ���
					System.out.println("Scalene");//Scalene�� ����Ѵ�.
				}
			}else {//�ﰢ���� ������ �����������Ѱ�� Invalid�� ���Ѵ�.
				System.out.println("Invalid");
			}
		}
	}

}
