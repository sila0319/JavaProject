package Main;

import java.util.Scanner;

public class test {
	static int [][] arr;
	static int x; //�κ� x��ǥ 
	static int y; //�κ� y��ǥ 
	static int d; //0�� ��� ����, 1�ΰ�� ���� 2�ΰ�� ���� 3�ΰ�켭��
	static int result =0;//û��Ƚ���� ������ ����� 
	static int cnt =0;//���߱� ���� ī��Ʈ
	
	static void clean() {//���� ��ġ�� û���Ѵ�.
		if(arr[y][x]==0) {
			result++;
			cnt =0;
			arr[y][x]=2;//���� ��ġ�� û���Ͽ���.
			//2���� a�� b�� ó���ؾ���.
			
		}
	}
	
	static boolean check() {//2�� ó��.
			//a�κ��� ���ʿ� û������ ���� �κ��� üũ

		if(d==0) {//����
			d=3;
			if(arr[y][x-1]==0) {//���ʿ� �� ������ �����ϸ� �������� �̵��� Ŭ��
				x-=1;
				clean();
				return true;
			}else if(arr[y][x-1]!=0) {//���ʿ� ������� ���ٸ� cnt�� ������Ų��. 
				cnt++;
			}
			//2bó�� �κ�.
			if(cnt==4&&arr[y][x+1]==1) {
				return false;
			}else if(arr[y][x+1]!=1){
				cnt=0;
				x+=1;
				clean();
				return true;
			}
			
		}else if(d==1) {//����
			d=0;
			
			if(arr[y-1][x]==0) {//���ʿ� �� ������ �����ϸ� �������� �̵��� Ŭ��
				y-=1;
				clean();
				return true;
			}else if(arr[y-1][x]!=0){//���ʿ� ������� ���ٸ� cnt�� ������Ų��. 
				cnt++;
			}
			//2bó�� �κ�.
			if(cnt==4&&arr[y+1][x]==1) {//�ڿ��κ��� ���̸� �����.
				return false;
			}else if(arr[y+1][x]!=1){//���� �ƴѰ�� �����Ѵ�.
				cnt=0;
				y+=1;
				clean();
				return true;
			}
			
			
		}else if(d==2) {//����
			d=1;
			if(arr[y][x+1]==0) {//���ʿ� �� ������ �����ϸ� �������� �̵��� Ŭ��
				x+=1;
				clean();
				return true;
			}else {//���ʿ� ������� ���ٸ� cnt�� ������Ų��. 
				cnt++;
			}
			//2bó�� �κ�.
			if(cnt==4&&arr[y][x-1]==1) {
				return false;
			}else if(arr[y][x-1]!=1){
				cnt=0;
				x-=1;
				clean();
				return true;
			}
			
			
		}else if(d==3) {//����
			d=2;
			
			if(arr[y+1][x]==0) {//���ʿ� �� ������ �����ϸ� �������� �̵��� Ŭ��
				y+=1;
				clean();
				return true;
			}else if(arr[y+1][x]!=0){//���ʿ� ������� ���ٸ� cnt�� ������Ų��. 
				cnt++;
			}
			//2bó�� �κ�.
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
		int n = sc.nextInt();//������ �迭 y��ǥ
		int m = sc.nextInt();//������ �迭 x��ǥ
		
		x = sc.nextInt();//�κ� x��ǥ 
		y = sc.nextInt();//�κ� y��ǥ 
		
		d = sc.nextInt();//�κ��� �ٶ󺸴� �� 
		//0�� ��� ����, 1�ΰ�� ���� 2�ΰ�� ���� 3�ΰ�켭��
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