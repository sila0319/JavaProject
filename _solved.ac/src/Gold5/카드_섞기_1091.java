package Gold5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class ī��_����_1091 {
		static int n;
		static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		static int [] list  = new int[n];//����Ʈ1���ٰ� ���� ��´�.
		static int [] templist =  new int [n];//�ӽ÷� 2���ٰ� ��Ƶΰ� �̵�
		static int [] arr;//ī�带 �̵��ϴ� ��ġ
		static int [] result; //���� ����� 
		static int [] card; //�̰Ŷ� ������ ����Ŭ �˻縦 �������Ƿ� �����.
		static int count =0;
		static int cant =0;
		static int cnt =0;

		static boolean check() {
			count =0;//����ó�� �Ҷ� üũ�ϴ� ī��Ʈ
			for (int i = 0; i < arr.length; i++) {
				if(list[i]==result[i]) 
					count++;
			}
			if(count==n)return false;
			else return true;
		}
		static void shake() {//ī�弯�� �Լ�
			for (int i = 0; i < arr.length; i++) {
				templist[arr[i]]=list[i];			
			}
			for (int i = 0; i < arr.length; i++) {
				list[i]=templist[i];
				
			}
		}
		static boolean ShakeCheck() {//��ȯ����Ŭ�� ���ؼ� ���࿡ ó��ī����ġ�� ���ƿ��� -1�� ����Ѵ�.
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
		
		static void input() throws IOException {//���� �Է¹޴� �Լ�.
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
			list  = new int [n]; //ó�� ī�� ��ġ�� �Է¹޴´�.
			templist = new int [n];//ī�� ��ġ�� �̵���Ų�� �ٽ� list�� ���� ����Ʈ
			cnt = 0;//��� ������ ���
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