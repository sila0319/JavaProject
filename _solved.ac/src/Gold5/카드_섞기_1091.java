package Gold5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class 카드_섞기_1091 {
		static int n;
		static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		static int [] list  = new int[n];//리스트1에다가 값을 담는다.
		static int [] templist =  new int [n];//임시로 2에다가 담아두고 이동
		static int [] arr;//카드를 이동하는 위치
		static int [] result; //최종 결과값 
		static int [] card; //이거랑 같으면 싸이클 검사를 다했으므로 멈춘다.
		static int count =0;
		static int cant =0;
		static int cnt =0;

		static boolean check() {
			count =0;//정답처리 할때 체크하는 카운트
			for (int i = 0; i < arr.length; i++) {
				if(list[i]==result[i]) 
					count++;
			}
			if(count==n)return false;
			else return true;
		}
		static void shake() {//카드섞는 함수
			for (int i = 0; i < arr.length; i++) {
				templist[arr[i]]=list[i];			
			}
			for (int i = 0; i < arr.length; i++) {
				list[i]=templist[i];
				
			}
		}
		static boolean ShakeCheck() {//순환싸이클을 통해서 만약에 처음카드위치로 돌아오면 -1을 출력한다.
			cant =0;
			for (int j = 0; j < arr.length; j++) {
				if(list[j]==card[j]) 
					cant++;
			}
			if(cant==n) {
				cnt=-1; 
				return false;
			}
			return true;
		}
		
		static void input() throws IOException {//값을 입력받는 함수.
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < arr.length; i++) {
				card[i] = Integer.parseInt(st.nextToken());
				result[i] +=i%3 ;
				list[i] = card[i];
			}
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
		}
		
		public static void main(String[] args) throws IOException {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			n = Integer.parseInt(br.readLine());
			list  = new int [n]; //처음 카드 위치를 입력받는다.
			templist = new int [n];//카드 위치를 이동시킨후 다시 list에 담을 리스트
			cnt = 0;//몇번 섞는지 출력
			arr = new int[n];
			result = new int[n];
			card = new int[n];
			input();
			
			while(true) {
				check();
				if(check()==false) {
					break;
				}
				shake();
				cnt++;
				ShakeCheck();
				if(ShakeCheck()==false) {
					break;
				}
			}
			if(cant==-1) bw.write(Integer.toString(-1));
			else bw.write(Integer.toString(cnt));
			bw.close();
		}   
	}