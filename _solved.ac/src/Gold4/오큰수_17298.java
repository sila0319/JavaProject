package Gold4;

import java.util.Arrays;
import java.util.Stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 오큰수_17298 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		Stack <Integer> stack = new Stack<Integer>();
		int [] arr = new int [n];
		Arrays.fill(arr, -1);//정답을 담을 배열을 -1로 선언을 한다. 
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		//이 문제의 시간이 1초이므로 입력과 처리를 동시에 해야지 시간초과가 발생하지 않는다. 
		for (int i = 0; i < arr.length; i++) {
			int cur = Integer.parseInt(st.nextToken());//값을 입력받는다.
					
			while(stack.size()!=0) {//스택사이즈가 0이 아니라면 스택안의 값과 비교를한다.
				if(stack.peek()<cur) {//스택안의 peek(숫자크기)가 cur보다 작다면
					stack.pop();//숫자크기를 팝한다 그러면 아래에 있는 배열에 담을 위치가 peek가 된다.
					arr[stack.pop()]= cur;//cur을 arr[stack.pop()]에다가 담는다. 
				}else break;//만약에 스택 피크가 더 크거나 같다면 반복을 멈춘다. 
			}
			stack.push(i);//해당하는 이값을 어느 위치의 배열에 담을지에 대하여 저장한다.
			stack.push(cur);//이 숫자의 크기를 스택에 push를 한다. 
			
		}
		
		//출력부분 시간이 없으므로 스트링빌더를 사용해야 한다.
		StringBuilder sb = new StringBuilder();
		for(int j =0; j<n; j++) {
			sb.append(arr[j]).append(' ');
		}
		System.out.println(sb);
	
	}    
}