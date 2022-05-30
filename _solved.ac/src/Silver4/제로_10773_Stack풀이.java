package Silver4;

import java.util.Stack;
import java.util.Scanner;

public class ����_10773_StackǮ�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		int k = sc.nextInt();
		int result =0;
		
		for (int i = 0; i < k; i++) {
			int n = sc.nextInt();
			if(n!=0) {
				stack.push(n);
			}else {
				stack.pop();
			}
		}
		int a = stack.size();
		for (int i = 0; i < a; i++) {
			result += stack.pop();
		}
		System.out.println(result);
		
		
	}

}
