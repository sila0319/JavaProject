package Silver5;

import java.util.Scanner;

public class ��ġ_7568 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//����� ����� �����ϴ��� �Է¹޴´�.
		int [][] arr = new int [n][2];//�����Կ� Ű�� �Է¹޴´�.
		int [] result = new int [n];//��ŷ�� �����Ѵ�.
		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = sc.nextInt();//�����Ը� �����Ѵ�.
			arr[i][1] = sc.nextInt();//Ű�� �����Ѵ�.
			result[i] = 1; //��ŷ�� �Է¹޴´�. 
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < result.length; j++) {
				if(arr[i][0] > arr[j][0] && arr[i][1] > arr[j][1] ) {//Ű�� �����Ը� ���Ѵ�.
					
					result[j]++; //if������ i�� ��ġ�� ������ ������,Ű�� �з����Ƿ� j�� ������ ����Ѵ�.
				}	
			}
		}
		for (int i : result) {//��ŷ����ϱ� 
			System.out.print(i+" ");
		}
	}
}