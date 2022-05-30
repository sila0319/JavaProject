package Silver4;


	import java.util.Scanner;
	import java.util.Stack;

	public class ��������_����_4949 {
		
		public static String call(String s) { //�Լ� call ȣ�� �� stack�� ��ȣ�� ��´�. 
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < s.length(); i++) {//s�� ���̸�ŭ ����.
			char c = s.charAt(i);//char c�� s�� i���� ��ġ�� ���� �ִ´�.
			if(c=='(' || c =='[') {//c�� ���� ( �̰ų� [ �� ��� ���ÿ� �ִ´�.
				stack.push(c);
			}
			else if(c==')' ) { // ���࿡ c�� ) �� ��� 
				if(stack.empty() || stack.peek() != '(') {//������ ����ְų� ������ top�κ��� ( �ƴ� ��� 
					return "no"; //no�� ȣ���Ѵ�. 
					}
				else {
					stack.pop();// �ֻ���� ( �κ��� �����Ѵ�. 
					}
			}
			
			else if(c == ']') { // c�� ] �� ��� 
				if(stack.empty() || stack.peek() != '[') { //������ ����ְų� Ȥ�� ������ top�κ��� [�� �ƴ� ��� 
					return "no"; //no�� �����Ѵ�. 
				}else {//�� ���� ��� 
					stack.pop();//stack�� pop�κ� ����
				}
				
			}
		}
			if(stack.empty()) {//������ ������� ��� 
				return "yes";//yes�� ȣ���Ѵ� �ֳ��ϸ� ������ ���ǿ��� return yes�� ������ �����Ƿ� �ѹ��� ó���Ѵ�. 
			}else {
				return "no";// �� ���� ���� no 
			}
			
		
		
	}
		 
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			String s;
			
			while(true) { // ���ѹݺ�
				 s = sc.nextLine();// ���� ��ĵ�� s�� ����
				if(s.equals(".")) {//���� ��ĵ�� .�ϳ��� ������� ����
					break;
					}
				System.out.println(call(s));//�Լ� call ȣ�� 
			}
		}
	}	



