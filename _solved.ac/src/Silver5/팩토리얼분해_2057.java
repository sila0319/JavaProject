package Silver5;

import java.util.Scanner;

public class ���丮�����_2057 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        long n = sc.nextLong();//�Է¹��� �� ���ϱ�
        long t =2432902008176640000L; //20�� ���丮��
        if(n==0) n-=1;//n==0�̸� ����ó��
        for(int i =20; i>0;i--) {//
        	t/=i;//t�� i�� ������.
        	if(n>=t) n-=t;//t�� n���� �۴ٸ� t����ŭ n�� �A��.
        }
        if(n==0) System.out.println("YES");//n==0�� �Ǹ� ���丮����ذ���
        else System.out.println("NO"); //0�̾ƴϸ� ���丮����غҰ�
    }   
}