package Bronze1;

import java.util.Scanner;

public class ����_���_1_11050 {
	public static int fatorial(int a) {//����Լ��� ���Ͽ� ���丮���� �����Ͽ���. 
		if(a ==0) {
			return 1;
		}
		return a *fatorial(a-1);
	}
	
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		//n���丮�� / (k���丮��*n-k ���丮��)�� ����ϸ� �ȴ�. 
		System.out.println(fatorial(n) / (fatorial(k) *fatorial(n-k)));
		
	}
}
