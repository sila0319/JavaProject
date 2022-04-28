package Main;

import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        int mul = 0;
        int [] arr = new int [3];
       
        
     
        for (int i = 1; i <= num; i++) {
			if(i < 100) {
				count++;
			}else if(100<= i && i < 1000) {
				
				mul =i;
				for (int j = 2; j >=0 ; j--) {
					arr[j] = mul%10;
					mul /=10;
				}
//				for (int k : arr) {
//					System.out.print(k+" ");
//				}
				if(arr[0]-arr[1] == arr[1]-arr[2]) {
					count++;
				}
			}else if(i==1000) {
				
			}
		}
       
        System.out.println(count);
        
    }
    
}
//캥거루 세마리2 11034