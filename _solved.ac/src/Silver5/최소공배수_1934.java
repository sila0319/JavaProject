package Silver5;

import java.util.Scanner;

public class �ּҰ����_1934 {
	static int eucd(int bn, int sn) {//�ּҰ������ ã�´�.
		int r = bn%sn;
		if(r==0) {
			return sn;
		}else {
			return eucd(sn,r);
		}
	}
	public static void main(String[] args)   {
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	for (int i = 0; i < t; i++) {
		
	
	int a = sc.nextInt();
	int b = sc.nextInt();
	int	N = eucd(Math.max(a, b), Math.min(a, b));
	System.out.println(a*b/N);
	}
	
	}
	
}

