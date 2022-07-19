package 에라토스테네스의_체;

import java.util.Scanner;

public class 에라토스테네스의_체2 {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
     if(num <= 1) return;

     boolean[] arr = new boolean[num+1];  
     
     
     arr[0] = arr[1] = true;
    
     for(int i=2; i*i<=num; i+=1) {
         for(int j=i*i; j<=num; j+=i) {
             arr[j] = true;        
         }
     }
      
     for(int i=2; i<=num; i+=1) {
         if(false == arr[i]) {
             System.out.print(i+" ");
         }
     }
       
 }  
	
}

