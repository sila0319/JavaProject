package Silver4;


	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.OutputStreamWriter;
	import java.util.ArrayDeque;
	import java.util.Deque;
	import java.util.StringTokenizer;


	public class 덱_10866 {
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub

			Deque<Integer> q = new ArrayDeque<>();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

			int n = Integer.parseInt(br.readLine());
			String command;
			int pushNum;
			
			for(int i = 0; i < n; i++) {
				command = br.readLine();
				if(command.contains("push_front")) {
					StringTokenizer st = new StringTokenizer(command, " ");
					st.nextToken();
					pushNum = Integer.parseInt(st.nextToken());
					q.addFirst(pushNum);
				}else if(command.contains("push_back")) {
					StringTokenizer st = new StringTokenizer(command, " ");
					st.nextToken();
					pushNum = Integer.parseInt(st.nextToken());
					q.addLast(pushNum);
				}
				
				else if(command.equals("pop_front")) {
					if(q.isEmpty()) System.out.println(-1);
					else System.out.println(q.pollFirst());
				}
				
				else if(command.equals("pop_back")) {
					if(q.isEmpty()) System.out.println(-1);
					else System.out.println(q.pollLast());
				}
				
				//큐의 사이즈 출력 
				else if(command.equals("size")) System.out.println(q.size());
				
				//큐가 비어있는지 체크 
				else if(command.equals("empty")) {
					if(q.isEmpty() == true) System.out.println(1);
					else System.out.println(0);
				}
				
				else if(command.equals("front")) {
					if(q.isEmpty()) System.out.println(-1);
					else System.out.println(q.peek());//이거만 고치자
				}else if(command.equals("back")) {
					if(q.isEmpty()) System.out.println(-1);
					else System.out.println((q).getLast());
				}
				
			}
		}
	}


