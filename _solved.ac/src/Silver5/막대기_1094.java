package Silver5;

import java.util.Scanner;

public class 막대기_1094 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int result =64;
	        int cnt =0;
	        while(n>0) {
	        	//막대기 절반의 크기가 입력받은 값 보다 크면 절반으로 자른다.
	        	if(result>n) {
	        		result /=2;
	        	}else {// 스틱의 길이가 x보다 작으면 풀로붙인다.
	        		cnt++;
	        		n -= result;
	        	}	
	        }
	        System.out.println(cnt);
	        
	    }  

}
