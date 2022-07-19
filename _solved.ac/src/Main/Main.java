package Main;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static boolean[]check;
	static int[][] arr;
	static int count =0;
	static int node , line;
	static Queue<Integer> q = new LinkedList<>();
	
	
	public static void dfs(int start) {
		check[start] =true;
		count++;
		for (int i = 0; i <=node; i++) {
			if(arr[start][i] == 1 && !check[i]) dfs(i);
		}
	}
    public static void main(String[] args) throws IOException{
    	// 입출력 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        node = Integer.parseInt(br.readLine()); // 정점의 개수 == 노드 갯수
        line = Integer.parseInt(br.readLine()); // 간선의 개수
        
        arr = new int[node+1][node+1];//index를 0부터시작이아닌 1부터시작하기위해 +1을한다.
        check = new boolean[node+1];//그래프가 0부터시작하므로 방문여부 조사또한 +1로 한다.
        
        for (int i = 0; i < line; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a][b] = arr[b][a] =1;
		}
        dfs(1);
        System.out.println(count-1);
        for (int i = 0; i < node+1; i++) {
			for (int j = 0; j < node+1; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
        
    }
}
