package Silver4;


	import java.util.Scanner;
	import java.util.Stack;

	public class 균형잡힌_세상_4949 {
		
		public static String call(String s) { //함수 call 호출 시 stack에 괄호를 담는다. 
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < s.length(); i++) {//s의 길이만큼 돈다.
			char c = s.charAt(i);//char c에 s의 i번쨰 위치의 값을 넣는다.
			if(c=='(' || c =='[') {//c의 값이 ( 이거나 [ 일 경우 스택에 넣는다.
				stack.push(c);
			}
			else if(c==')' ) { // 만약에 c가 ) 일 경우 
				if(stack.empty() || stack.peek() != '(') {//스택이 비어있거나 스택의 top부분이 ( 아닐 경우 
					return "no"; //no를 호출한다. 
					}
				else {
					stack.pop();// 최상단의 ( 부분을 제거한다. 
					}
			}
			
			else if(c == ']') { // c가 ] 일 경우 
				if(stack.empty() || stack.peek() != '[') { //스택이 비어있거나 혹은 스택의 top부분이 [이 아닐 경우 
					return "no"; //no를 리턴한다. 
				}else {//그 외의 경우 
					stack.pop();//stack의 pop부분 리턴
				}
				
			}
		}
			if(stack.empty()) {//스택이 비어있을 경우 
				return "yes";//yes를 호출한다 왜냐하면 위쪽의 조건에서 return yes를 한적이 없으므로 한번에 처리한다. 
			}else {
				return "no";// 그 외의 경우는 no 
			}
			
		
		
	}
		 
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			String s;
			
			while(true) { // 무한반복
				 s = sc.nextLine();// 한줄 스캔후 s에 저장
				if(s.equals(".")) {//한줄 스캔시 .하나만 있을경우 종료
					break;
					}
				System.out.println(call(s));//함수 call 호출 
			}
		}
	}	



