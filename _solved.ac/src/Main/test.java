package Main;

import java.util.Scanner;

public class test {
	static int [][] arr;
	static int x; //로봇 x좌표 
	static int y; //로봇 y좌표 
	static int d; //0인 경우 북쪽, 1인경우 동쪽 2인경우 남쪽 3인경우서쪽
	static int result =0;//청소횟수를 저장할 결과값 
	static int cnt =0;//멈추기 위한 카운트
	
	static void clean() {//현재 위치를 청소한다.
		if(arr[y][x]==0) {
			result++;
			cnt =0;
			arr[y][x]=2;//현재 위치를 청소하였다.
			//2번의 a와 b를 처리해야함.
			
		}
	}
	
	static boolean check() {//2번 처리.
			//a부분의 왼쪽에 청소하지 않은 부분을 체크

		if(d==0) {//북쪽
			d=3;
			if(arr[y][x-1]==0) {//왼쪽에 빈 공간이 존재하면 그쪽으로 이동후 클린
				x-=1;
				clean();
				return true;
			}else if(arr[y][x-1]!=0) {//왼쪽에 빈공간이 없다면 cnt를 증가시킨다. 
				cnt++;
			}
			//2b처리 부분.
			if(cnt==4&&arr[y][x+1]==1) {
				return false;
			}else if(arr[y][x+1]!=1){
				cnt=0;
				x+=1;
				clean();
				return true;
			}
			
		}else if(d==1) {//동쪽
			d=0;
			
			if(arr[y-1][x]==0) {//왼쪽에 빈 공간이 존재하면 그쪽으로 이동후 클린
				y-=1;
				clean();
				return true;
			}else if(arr[y-1][x]!=0){//왼쪽에 빈공간이 없다면 cnt를 증가시킨다. 
				cnt++;
			}
			//2b처리 부분.
			if(cnt==4&&arr[y+1][x]==1) {//뒤에부분이 벽이면 멈춘다.
				return false;
			}else if(arr[y+1][x]!=1){//벽이 아닌경우 후진한다.
				cnt=0;
				y+=1;
				clean();
				return true;
			}
			
			
		}else if(d==2) {//남쪽
			d=1;
			if(arr[y][x+1]==0) {//왼쪽에 빈 공간이 존재하면 그쪽으로 이동후 클린
				x+=1;
				clean();
				return true;
			}else {//왼쪽에 빈공간이 없다면 cnt를 증가시킨다. 
				cnt++;
			}
			//2b처리 부분.
			if(cnt==4&&arr[y][x-1]==1) {
				return false;
			}else if(arr[y][x-1]!=1){
				cnt=0;
				x-=1;
				clean();
				return true;
			}
			
			
		}else if(d==3) {//서쪽
			d=2;
			
			if(arr[y+1][x]==0) {//왼쪽에 빈 공간이 존재하면 그쪽으로 이동후 클린
				y+=1;
				clean();
				return true;
			}else if(arr[y+1][x]!=0){//왼쪽에 빈공간이 없다면 cnt를 증가시킨다. 
				cnt++;
			}
			//2b처리 부분.
			if(cnt==4&&arr[y-1][x]==1) {
				return false;
			}else if(cnt==4&& (arr[y-1][x]!=1)){
				cnt=0;
				y-=1;
				clean();
				return true;
			}
		}
		return false;	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//이차원 배열 y좌표
		int m = sc.nextInt();//이차원 배열 x좌표
		
		x = sc.nextInt();//로봇 x좌표 
		y = sc.nextInt();//로봇 y좌표 
		
		d = sc.nextInt();//로봇이 바라보는 곳 
		//0인 경우 북쪽, 1인경우 동쪽 2인경우 남쪽 3인경우서쪽
		arr = new int[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		clean();
		while(true) {
			if(check()==false) break;
			check();
			
		}
		System.out.println(result);
	}
}