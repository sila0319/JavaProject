package _����Ư��_�ڷᱸ��;

import java.util.Scanner;
import java.util.Arrays;

public class Binary_Search_01 {
	static int BSearch(int ar[], int target)
	{
		int cnt =0;
		int len = ar.length;
		int first = 0; // Ž�� ����� ���� �ε��� ��
		int last = len-1; // Ž�� ����� ������ �ε��� ��
		int mid;
		while(first <= last)
		{
			cnt++;
			mid = (first+last) / 2; // Ž�� ����� �߾��� ã�´�.
			if(target == ar[mid]) // �߾ӿ� ����� ���� Ÿ���̶��
			{
				System.out.println(cnt+"Ž�� Ƚ��");
				return mid; // Ž�� �Ϸ�!
			}
			else // Ÿ���� �ƴ϶�� Ž�� ����� ������ ���δ�.
			{
				if(target < ar[mid])
					last = mid-1; // �� -1�� �Ͽ�����?
				else
					first = mid+1; // �� +1�� �Ͽ�����?
			}
		}
			System.out.println(cnt+"Ž�� Ƚ��");
			return -1; // ã�� ������ �� ��ȯ�Ǵ� �� -1
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n = (int) (Math.random()*1000000)+1;
		System.out.println("ã������ ������ �� �Է� ="+ n);
		int []  arr = new int [1000000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		Arrays.sort(arr);
		System.out.println(BSearch(arr,n )+"��°�� �����մϴ�.");
		
	}
	
}
