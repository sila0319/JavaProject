package Silver5;

import java.util.Scanner;

public class �����_1094 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int result =64;
	        int cnt =0;
	        while(n>0) {
	        	//����� ������ ũ�Ⱑ �Է¹��� �� ���� ũ�� �������� �ڸ���.
	        	if(result>n) {
	        		result /=2;
	        	}else {// ��ƽ�� ���̰� x���� ������ Ǯ�κ��δ�.
	        		cnt++;
	        		n -= result;
	        	}	
	        }
	        System.out.println(cnt);
	        
	    }  

}
