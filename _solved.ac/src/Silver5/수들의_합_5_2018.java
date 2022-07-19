package Silver5;


	import java.util.Scanner;


	public class 수들의_합_5_2018 {
		static int n;
		static int [] arr;
		static int cnt =1;
		static int result =0;
		static void check() {
			int start =1;
			int end =1;
			while(start < n) {
				if(result > n || end ==n) {
					result -= arr[start];
					start++;
				}else {
					result+=arr[end];
					end++;
				}
				if(result==n) {
					cnt++;
					//System.out.println(start+" "+end );
				}
				}
			}
		
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        n = sc.nextInt();
	        arr = new int [n];
	        for (int i = 0; i < arr.length; i++) {
				arr[i] = i;
			}
	       // for(int i : arr) System.out.println(i);
	        
	        check();
	        System.out.println(cnt);
	      
	        
	    }     
	}


