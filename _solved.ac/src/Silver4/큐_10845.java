package Silver4;


	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.OutputStreamWriter;
	import java.util.Queue;
	import java.util.StringTokenizer;
	import java.util.LinkedList;

	public class 큐_10845 {
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub

			LinkedList<Integer> q = new LinkedList<>();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

			int n = Integer.parseInt(br.readLine());
			String command;
			int pushNum;
			
			for(int i = 0; i < n; i++) {
				command = br.readLine();
				if(command.contains("push")) {
					StringTokenizer st = new StringTokenizer(command, " ");
					st.nextToken();
					pushNum = Integer.parseInt(st.nextToken());
					q.offer(pushNum);
					
				}
				
				else if(command.equals("pop")) {
					if(q.isEmpty()) bw.write(-1+"\n");
					else bw.write(q.poll()+"\n");
				}
				
				else if(command.equals("size")) bw.write(q.size()+"\n");
				
				else if(command.equals("empty")) {
					if(q.isEmpty() == true) bw.write(1+"\n");
					else bw.write(0+"\n");
				}
				
				else if(command.equals("front")) {
					if(q.isEmpty()) bw.write(-1+"\n");
					else bw.write(q.peek()+"\n");//이거만 고치자
				}else if(command.equals("back")) {
					if(q.isEmpty()) bw.write(-1+"\n");
					else bw.write((q).getLast()+"\n");
				}
				
			}
			bw.close();
		}
	}	
	


