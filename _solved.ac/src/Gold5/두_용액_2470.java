package Gold5;



import java.util.Scanner;
import java.util.Arrays;

public class ��_���_2470 {
	static int [] arr; 
	static int n;
	static int min = 2100000000;
	static int leftsum;
	static int rightsum;
	static void check () { //�������ͷ� ���ʰ� �����ʰ��� ���Ѵ�. 
		 int left = 0;
		 int right = arr.length-1;
		while(left < right) {
			
			//System.out.println(min);
			if((arr[left]+arr[right]) == 0 ) {//���ʿ����ʰ��� 0�� ��� �ٷ� �����. 
				leftsum= left;
				rightsum = right;
				return;
			}
			else if(0 > (arr[left]+arr[right])) {//����+�����ʰ��� 0���� ���� ���
				if (min > Math.abs((int)(arr[left]+arr[right]))) {
					//���� �����ʰ��� ���밪�� min���� ���� ��� min�� ���� �� �����Ѵ�. 
					min = Math.abs((int)(arr[left]+arr[right]));
					
					//������ ���ʿ��� �ش��ϴ� ����� ��ġ�� �����Ƿ� �����Ѵ�. 
					leftsum= left;
					rightsum = right;
				}
				 left++;
				 //������ ���� �������� ����̹Ƿ� ����+�������� ���� 0���� �����Ƿ� ������ ���� ������Ų��. 
				 //������ ���� ������Ű�� 0�� ��������ų� Ȥ�� 0�� �ʰ��ϰ� �ȴ�. 
				 //���������� 0�� ����� ����� ��ġ�� ã���Ƿ� 0�� �ʰ��ϰ� �ȴٸ� ���̻� ������ �������� �ʰԵȴ�. 
			}else if(0 < (arr[left]+arr[right])) {//���� ������ ���� 0���� Ŭ ��� 
				if (min > Math.abs((int)(arr[left]+arr[right]))) {//����+�������� ���밪�� min���� ���� ��� min�� ���� �缳���Ѵ�. 
					min = Math.abs((int)(arr[left]+arr[right]));
					//System.out.println(min+"����϶�");
					leftsum= left;
					rightsum = right;
				}
				right--;//���� ������ ���Ѱ��� 0���� ũ�ٴ� ���� �������� ����� �� ũ�ٴ� �ǹ��̹Ƿ� ����� �ٿ��ش�. 
			}
				
			
		}
		
	}
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		check();
		System.out.println(arr[leftsum]+" "+arr[rightsum]);
	}
 
}