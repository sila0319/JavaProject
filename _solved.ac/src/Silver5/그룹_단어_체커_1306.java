package Silver5;

import java.util.Scanner;

public class �׷�_�ܾ�_üĿ_1306 {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result =0;
		
		for (int i = 0; i < n; i++) {//�Է¹��� ������ �� ��ŭ ���ϰԵȴ�.
			int count =0;//count�� 0�� �ƴϸ� �����̾ƴ�.
			String[] c = sc.next().split("");
			int [] arr = new int[26];
			
			for (int j = 0; j < c.length-1; j++) {
				for (int j2 = 0; j2 < c.length; j2++) {
					int k = j+1;
					if(c[j].equals(c[k])) {
						k++;
					}else {
						j2=k-1;
						char ch = c[j].charAt(0);
						arr[ch-97]+=1;//���ڿ��� �ƽ�Ű�ڵ� �� ��ġ�� +1�� ���ش�.
						break;
					}
				}
			}
			char ch = c[c.length-1].charAt(0);
			arr[ch-97]+=1;//���ڿ��� �ƽ�Ű�ڵ� �� ��ġ�� +1�� ���ش�.
			
			//�̺κ��� ó���ϰ��� ��ü�� ������� ó���Ѵ�. 
				for (int k2 = 0; k2 < arr.length; k2++) {//������ ������ ��ȸ�ؼ� 2���ٰ��ų� Ŭ ��쿡�� ������ �ƴϰ� ��.
					if(arr[k2] >=2) {//2���� Ŭ��� count�� �÷��� �����ش�.
						count++;
					}	
				}
				if(count==0) {//ī��Ʈ�� �÷���1�� �ȵǾ��ٴ°��� ������ �ƴ϶�� �ǹ̸� ����.
					result++;
				}
				

		}
		
		System.out.println(result);
		
		
		
		
	}

}
