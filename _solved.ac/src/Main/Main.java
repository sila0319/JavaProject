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
    	// ����� ó��
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        node = Integer.parseInt(br.readLine()); // ������ ���� == ��� ����
        line = Integer.parseInt(br.readLine()); // ������ ����
        
        arr = new int[node+1][node+1];//index�� 0���ͽ����̾ƴ� 1���ͽ����ϱ����� +1���Ѵ�.
        check = new boolean[node+1];//�׷����� 0���ͽ����ϹǷ� �湮���� ������� +1�� �Ѵ�.
        
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
