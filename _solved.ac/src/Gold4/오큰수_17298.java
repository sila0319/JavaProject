package Gold4;

import java.util.Arrays;
import java.util.Stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ��ū��_17298 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		Stack <Integer> stack = new Stack<Integer>();
		int [] arr = new int [n];
		Arrays.fill(arr, -1);//������ ���� �迭�� -1�� ������ �Ѵ�. 
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		//�� ������ �ð��� 1���̹Ƿ� �Է°� ó���� ���ÿ� �ؾ��� �ð��ʰ��� �߻����� �ʴ´�. 
		for (int i = 0; i < arr.length; i++) {
			int cur = Integer.parseInt(st.nextToken());//���� �Է¹޴´�.
					
			while(stack.size()!=0) {//���û���� 0�� �ƴ϶�� ���þ��� ���� �񱳸��Ѵ�.
				if(stack.peek()<cur) {//���þ��� peek(����ũ��)�� cur���� �۴ٸ�
					stack.pop();//����ũ�⸦ ���Ѵ� �׷��� �Ʒ��� �ִ� �迭�� ���� ��ġ�� peek�� �ȴ�.
					arr[stack.pop()]= cur;//cur�� arr[stack.pop()]���ٰ� ��´�. 
				}else break;//���࿡ ���� ��ũ�� �� ũ�ų� ���ٸ� �ݺ��� �����. 
			}
			stack.push(i);//�ش��ϴ� �̰��� ��� ��ġ�� �迭�� �������� ���Ͽ� �����Ѵ�.
			stack.push(cur);//�� ������ ũ�⸦ ���ÿ� push�� �Ѵ�. 
			
		}
		
		//��ºκ� �ð��� �����Ƿ� ��Ʈ�������� ����ؾ� �Ѵ�.
		StringBuilder sb = new StringBuilder();
		for(int j =0; j<n; j++) {
			sb.append(arr[j]).append(' ');
		}
		System.out.println(sb);
	
	}    
}