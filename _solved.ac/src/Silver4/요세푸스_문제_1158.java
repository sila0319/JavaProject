package Silver4;

import java.util.Scanner;

public class �似Ǫ��_����_1158 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //1~n������ ����
		int k = sc.nextInt(); //k���� ���� ���� 
		int count =-1;//�迭�� ��ġ���� 
		int [] arr = new int[n]; // 1~n�� ���� ���� �迭 ����
		int [] result = new int[n]; //arr���� k�� ��ŭ ¥�� ���� result���ٰ� ��´�
		
		for (int i = 0; i < arr.length; i++) {// n������ ���� �ֱ�
			arr[i] = i+1;
		}
		
		for (int i = 0; i < arr.length; i++) {  //n����ŭ ���ƾ��Ѵ�.
			int temp =0;

			while (true) {//temp�� 3�� �Ǹ� ���ߵ����Ѵ�.
				count +=1; //���° ��ġ�� ����� �߰������� ���� count
				temp ++;//k��ŭ ������ ��� �� ���̿� ���ŵ� ����� ������츦 üũ�Ѵ�.
				if(count==n) { // count�� n�� ���Եȴٸ� 0��°�� ���ư����Ѵ�. �����÷ο�߻�
					count = count-n;
				}
				if(arr[count]!=0 && temp ==k) { 
					//arr[count]�� ���� 0�� �ƴϰ� temp�� k�� ���ٸ� �����. �ֳ��ϸ� �̻�Ȳ���� ����� ã�ұ� �����̴�.
					break;
				}else if(arr[count]==0) {//arr[count]�� ���� 0�� ��� temp�� �ѹ��� ���ƾ��Ѵ�. 
					temp--;
				}
			}
			
			result[i] = arr[count]; //count�� ��ġ�� ����� result�� �ִ´�.
			arr[count] =0;// ���� count��ġ�� ����� �����Ѵ�. 
			
			//System.out.println("ī��Ʈ�� �� "+count+" result�� ��" + result[i] +" i�� ��" + i);		
		
		}
		
		//�Ʒ��� ��� 
		System.out.print("<");
		for (int i = 0; i < result.length; i++) {
			if(i!=result.length-1)System.out.print(result[i]+", ");
			else if(i==result.length-1) System.out.print(result[i]);
		}
		for (int i : result) {
			
		} 
		System.out.print(">");
	}
}
