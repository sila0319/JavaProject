package Silver3;





	import java.util.Collections;
	import java.util.LinkedList;
	import java.util.PriorityQueue;
	import java.util.Queue;
	import java.util.Scanner;


	public class ������_ť_1966 {
		public static void main(String[] args) {
			PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
			Queue<Integer> q = new LinkedList<>();
			Scanner sc = new Scanner (System.in);
			
			int cnt =0;
			int result =0;
			
				int n = sc.nextInt(); //��� q�� ��°�?
				int wid = sc.nextInt();//wid�� +1�� �ؼ� ����Ѵ�.
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
					//	System.out.println(q.peek()+" q�� �����κ��Դϴ�.");
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
					//System.out.println("wid�� �� " + wid+"cnt�ǰ� "+cnt+"q.peek�� �� "+q.peek()+"pq.peek�� �� "+ pq.peek()+"result�� �� " + result);
				}
			//	System.out.println(cnt);
			
			
			
		}
	}




