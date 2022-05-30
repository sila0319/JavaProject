package Main;

import java.util.Scanner;
import java.util.Stack;
 
public class test2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		String s;
		
		while(true) {		
			s = in.nextLine();
			
			if(s.equals(".")) {	// ���� ���ǹ� 
				break;
			}		
			System.out.println(solve(s));
		}
	
	}
	
	public static String solve(String s) {
		
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i);	// i ��° ���� 
			
			// ���� ��ȣ�� ��� ���ÿ� push 
			if(c == '(' || c == '[') {
				stack.push(c);
			}
			
			// �ݴ� �Ұ�ȣ �� ��� 
			else if(c == ')') {
				
				// ������ ����ְų� pop�� ���Ұ� �Ұ�ȣ�� ��Ī�� �ȵǴ� ��� 
				if(stack.empty() || stack.peek() != '(') {
					return "no";
				}
				else {
					stack.pop();
				}
			}
			
			else if(c == ']') {
				
				// ������ ����ְų� pop�� ���Ұ� ���ȣ�� ��Ī�� �ȵǴ� ��� 
				if(stack.empty() || stack.peek() != '[') {
					return "no";
				}
				else {
					stack.pop();
				}
			}
			
			// �� ���� ��쿡�� ���ʿ��� ���ڵ��̱⿡ skip�Ѵ�. 
		}
		
		if(stack.empty()) {
			return "yes";
		}
		else {
			return "no";
		}
	}
 
}

