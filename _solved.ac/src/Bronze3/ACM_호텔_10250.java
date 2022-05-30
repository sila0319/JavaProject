package Bronze3;


	import java.util.Scanner;
	
	public class ACM_호텔_10250 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();//테스트케이스 
			int wid = 0; //배정할 뒷 호 계산 
			int hei = 0; //배정할 층수계산
			for (int i = 0; i < t; i++) {
				int h = sc.nextInt();//건물의 층수
				int w = sc.nextInt();// 건물의 호실
				int n = sc.nextInt(); // 사람수 
				
				
				if(n%h ==0) {//사람수와 입력받은 층수를 나눈 나머지가 0일 경우  
					hei = h*100; //사람의 층수는 h*100이다 h가 0이므로 해당층에 배당
					wid = n/h; //n/h를 하면 방을 층마다 몇번 배정하였는지 알 수 있음 
				}else {
					hei = n%h*100; //n%h가 0이 아니므로 곱하기 100을 하면됨.
					wid = n/h+1; //0호실이 없으므로 플러스 1을함.  
				}
				System.out.println(hei+wid);
			}
			
		}
	}


