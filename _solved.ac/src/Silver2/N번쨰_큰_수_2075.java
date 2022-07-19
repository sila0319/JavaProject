package Silver2;


	import java.util.Collections;
	import java.util.PriorityQueue;
	import java.util.Scanner;

	public class N¹ø¤Š_Å«_¼ö_2075 {
		public static void main(String[] args)  {
			Scanner sc = new Scanner(System.in);
			PriorityQueue<Integer> PQ = new PriorityQueue<>(Collections.reverseOrder());
			int n = sc.nextInt();
			for (int i = 0; i < n*n ; i++) {
				PQ.add(sc.nextInt());
			}
			for (int i = 0; i < n; i++) {
				int result = PQ.poll();
				if(i==n-1)System.out.println(result);
			}
			
			
			
		}
	 
	}


