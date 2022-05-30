package Silver3;

import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;
public class 스택_수열_1874 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int pos =0;
		ArrayList <String>  StrList = new ArrayList();
		Stack <Integer> stack = new Stack();
		int [] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		for (int j = 0; j < arr.length; j++) {
			stack.push(j+1);
			StrList.add("+");
			while(true) {
				if(stack.isEmpty()==false) {
					if(stack.peek()!=arr[pos] || stack.isEmpty()==true) {
						break;
					}
					else if(stack.peek()==arr[pos] && stack.isEmpty()==false) {
						stack.pop();
						StrList.add("-");
						pos++;
					}
				}else {
					break;
				}
			}
		}
		
		if(StrList.size()==n*2) {
		for (int i = 0; i < StrList.size(); i++) {
			System.out.println(StrList.get(i));
		}
		}else {
			System.out.println("NO");
		}
		
		
		
		
	}
}



