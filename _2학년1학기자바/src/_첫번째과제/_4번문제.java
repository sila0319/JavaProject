package _ù��°����;

import java.util.Scanner;

public class _4������ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�μ��� �Է��Ͻÿ� <�� 10.5,3.14> : 10.5,3.14" );
		double firstsum = sc.nextDouble();
		double secondsum = sc.nextDouble();
		
		System.out.printf("%.1f + %.1f = %.1f %n",firstsum,secondsum,firstsum+secondsum);
		System.out.printf("%.1f - %.1f = %.1f %n",firstsum,secondsum,firstsum-secondsum);
		System.out.printf("%.1f / %.1f = %.1f %n",firstsum,secondsum,firstsum*secondsum);
		System.out.printf("%.1f * %.1f = %.1f %n",firstsum,secondsum,firstsum/secondsum);
	}

}
