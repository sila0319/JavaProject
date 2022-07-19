package Silver5;

import java.util.Scanner;

public class 팩토리얼분해_2057 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        long n = sc.nextLong();//입력받은 값 구하기
        long t =2432902008176640000L; //20의 팩토리얼값
        if(n==0) n-=1;//n==0이면 예외처리
        for(int i =20; i>0;i--) {//
        	t/=i;//t를 i로 나눈다.
        	if(n>=t) n-=t;//t가 n보다 작다면 t값만큼 n을 뺸다.
        }
        if(n==0) System.out.println("YES");//n==0이 되면 팩토리얼분해가능
        else System.out.println("NO"); //0이아니면 팩토리얼분해불가
    }   
}