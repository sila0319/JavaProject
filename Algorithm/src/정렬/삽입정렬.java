package ����;

public class �������� {
	public static void insertion_sort(int[] a) {
		insertion_sort(a, a.length);
	}
	
	private static void insertion_sort(int[] a, int size) {
		
		
		for(int i = 1; i < size; i++) {
			// Ÿ�� �ѹ�
			int target = a[i];
			
			int j = i - 1;
			
			// Ÿ���� ���� ���Һ��� ũ�� �� ���� �ݺ�
			while(j >= 0 && target < a[j]) {
				a[j + 1] = a[j];	// ���� ���Ҹ� �� ĭ�� �ڷ� �̷��.
				j--;
			}
			
			/*
			 * �� �ݺ������� Ż�� �ϴ� ��� ���� ���Ұ� Ÿ�ٺ��� �۴ٴ� �ǹ��̹Ƿ�
			 * Ÿ�� ���Ҵ� j��° ���� �ڿ� �;��Ѵ�.
			 * �׷��Ƿ� Ÿ���� j + 1 �� ��ġ�ϰ� �ȴ�.
			 */
			a[j + 1] = target;	
		}
		
	}
}
