package Silver3;





	import java.util.Collections;
	import java.util.LinkedList;
	import java.util.PriorityQueue;
	import java.util.Queue;
	import java.util.Scanner;


	public class 프린터_큐_1966 {
		public static void main(String[] args) {
			PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
			Queue<Integer> q = new LinkedList<>();
			Scanner sc = new Scanner (System.in);
			
			int cnt =0;
			int result =0;
			
				int n = sc.nextInt(); //몇개의 q가 담는가?
				int wid = sc.nextInt();//wid의 +1을 해서 출력한다.
				q.clear();
				pq.clear();
				for (int j = 0; j < n; j++) {
					int num = sc.nextInt();
					pq.add(num);
					q.add(num);
					if(j==wid) result = num;
				}
				cnt =0;
				while(!q.isEmpty()) {
					
					if(pq.peek()==q.peek()) {
						cnt++;
					//	System.out.println(q.peek()+" q의 맨윗부분입니다.");
						if(pq.peek()==result && wid ==0) {
							System.out.println(cnt);
							break;
						}
						pq.poll();
						q.poll();
						wid--;
						if(wid==-1) wid=q.size();
						
						
						
						
					}else {
						
						q.add(q.poll());
						wid--;
						if(wid==-1) wid=q.size()-1;
						
						
					}
					//System.out.println("wid의 값 " + wid+"cnt의값 "+cnt+"q.peek의 값 "+q.peek()+"pq.peek의 값 "+ pq.peek()+"result의 값 " + result);
				}
			//	System.out.println(cnt);
			
			
			
		}
	}




