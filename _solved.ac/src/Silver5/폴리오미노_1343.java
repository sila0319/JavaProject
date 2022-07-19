package Silver5;


	import java.util.Scanner;
	import java.util.Queue;
	import java.util.LinkedList;

	public class 폴리오미노_1343 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Queue <String> q = new LinkedList<>();
	     
	        String [] arr = sc.nextLine().split("");
//	        for(String i : arr) {
//	        	System.out.print(i+" ");
//	        }
	       
	        int cnt =0;
	        boolean b = true;
	        
	        
	        for (int i = 0; i < arr.length; i++) {
				if(arr[i].equals("X")) cnt++;
				//System.out.println(cnt);
				if(cnt==4) {
					cnt=0;
					for (int j = 0; j < 4; j++) {
						q.add("A");
					}
				}else if(arr[i].equals(".")) {
					if(cnt%2==0) {
						for (int j = 0; j < cnt; j++) {
							q.add("B");
						}
					}else b=false;
					cnt=0;
					q.add(".");
				}
				
			}
	        if(cnt%2==0) {
				for (int j = 0; j < cnt; j++) {
					q.add("B");
				}
			}else b =false;
			cnt=0;
	        if(b) {
	        	int temp = q.size();
	        	for (int i = 0; i < temp; i++) {
					System.out.print(q.poll());
				}
	        }else System.out.println(-1);
	    }     
	}
	

