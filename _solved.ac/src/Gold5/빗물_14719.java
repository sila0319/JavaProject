package Gold5;

import java.util.Scanner;
import java.util.Stack;

public class 빗물_14719 {
	static int [][] arr;
	static Stack <Integer>stack = new Stack<>();//한줄에 테트리스가 존재할 경우 stack에 넣는다. 
	static int cnt =0;//특정 조건이 되면 cnt에 담긴 값은 빗물이 된다.
	static int result =0;//cnt로 부터 전달받은 값은 결과값으로 출력한다. 
	static void check() {//이차원 배열 한줄씩 검사해서 빗물을 담을 수 있는지를 체크한다.
		for (int i = 0; i < arr.length; i++) {
			cnt =0;//시작할때 마다 cnt를 초기화해야한다.
			stack.clear();//시작할때마다 stack에 담긴 값을 초기화 해야한다.
			for (int j = 0; j < arr[i].length; j++) {//한줄에 존재하는 빗물과 테트리스를 검사하여서 빗물이 담겼는지 아닌지를 체크한다.
				if(stack.empty()) {//stack에 비어있을 경우
					if(arr[i][j]==1) {//arr[i][j]의 값이 1일 경우 스택에 1을 삽입한다.
						stack.push(1);
					}
				}else if(!stack.empty()) {//스택이 비어있지 않았을때 arr[i][j]의 값이 1일 경우에 그 사이에 담긴 빗물을 저장한다.
					if(arr[i][j]==1) {//1일 경우 블럭이 닫힌 경우이므로 result에 빗물을 추가한다 그후 cnt를 0으로 초기화한다. 
						//스택이 비어있지않은 상황에서 1을 만나야지 블럭이 닿힌 경우이므로 cnt에 담긴값을 result에다가 옮겨야한다.
						//stack.pop();
						result += cnt;
						cnt =0;
					}else if(arr[i][j]==0) {//스택이 비어있지않고 arr[i][j]의 값이 0일 경우에는 빗물이므로 cnt를 추가한다.
						cnt++;
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();//통의 높이를 입력받는다.
		int w = sc.nextInt();//통의 넓이를 입력받는다.
		arr = new int[h][w];//이차원 배열 선언 
		//이차원 배열을 그림예제와는 꺼꾸로 입력받은 상태이므로 꺼꾸로 돌려서 생각해야한다.
		for (int i = 0; i < w; i++) {//이차원 배열 안의 값을 삽입을 한다.
			int n = sc.nextInt();
			for (int j = 0; j < n; j++) {//입력받은 n값의 길이를 블럭으로 채운다. 
				arr[j][i] = 1; 
			}
		}
		check();//check함수를 호출해서 검사한다.
		System.out.println(result);//결과 출력
	}
}