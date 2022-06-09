package Gold5;


	import java.util.Scanner;

	//n극은 0 s극은 1이다.
	/*
	 * 특정 톱니바퀴 번호를 시계방향 혹은 반시게방향으로 돌릴 경우에
	 * 양쪽의 톱니바퀴와 맞닿은 부분이 s와 n극이 맞닿은 상태라면
	 * 특정 톱니바퀴가 돌아가는 방향의 반대방향으로 돌아가게된다.
	 * 톱니바퀴의 인덱스 2번,6번을 체크해야한다.
	 * 톱니바퀴의 특성상 하나의 톱니바퀴가 오른쪽으로  그 톱니바퀴의 오른쪽에는 왼쪽으로, 왼쪽에 위치한 애는 오른쪽으로 돌아간다.
	 * 하지만 돌아가기 위해서는 s와n이 인접한 상태여야하므로 그것에 대한 체크가 필요하다.
	 */

	public class 톱니바퀴_2_15662 {
		static int [] spincan;//각각의 톱니바퀴가 어떻게 회전을 해야하는지.
		static int [][]arr;//톱니바퀴의 n,s극을 받기 위한 것 
		static int n =0;//톱니바퀴의 번호.
		static int p =0; //톱니바퀴의 회전 방향
		static int t =0;
		
		static void check(int n) {//톱니바퀴가 돌아갈 수 있는 조건을 체크한다. 
			for (int i = n-1; i >=0; i--) {//n을 기준으로 왼쪽에 위치한 톱니바퀴들을 체크한다.
				if(arr[i][2] != arr[i+1][6]) {//톱니바퀴의 3번과 6번이 s와 n극인지를 확인한다.
					spincan[i]= -spincan[i+1];//톱니바퀴의 특성상 i는 i+1에 위치한 반대방향으로 돌아가야한다. i+1이 반시계방향이면 i는 시계방향으로 돌아야함.
				}else {//3번과 6번이 같은 극이라면 돌지못한다.
					break;
				}
				
			}
			for (int i = n+1; i <t; i++) {//n을 기준으로 오른쪽에 위치한 톱니바퀴들을 체크한다.
				if(arr[i][6] != arr[i-1][2]) {//톱니바퀴 3번과 6번이 s와n극이 만났는지 확인한다.
					spincan[i]= -spincan[i-1];//톱니바퀴의 특성상 반대방향으로 돌아야한다.
				}else {//3번과 6번이 같다면 돌지 못하므로 멈춘다. 
					break;
				}
				
			}
			
		}
		
	   static void spin () { //각 톱니바퀴를 체크한 결과에 따라 톱니바퀴를 돌려준다. 
	   int temp =0;
	   for (int i = 0; i < t; i++) {
		if(spincan[i]==1) {//spincan[i]의 값이 1일 경우 시계방향으로돌려준다.
			temp = arr[i][7];//7번째 값이 0번쨰로 이동해야함.
			for (int j = 7; j >0; j--) {
				arr[i][j] = arr[i][j-1];
			}
			arr[i][0]= temp;
		}
		if(spincan[i]==-1) {//spincan[i]의 값이 1일 경우 반 시계방향으로돌려준다.
			temp = arr[i][0];//0번째 값이 7번째로 이동해야함
			for(int j =0 ; j < 7 ;j++) {
				arr[i][j] = arr[i][j+1];
			}
			arr[i][7] = temp;
		}
	}
	   
		   
	     
	   
	}
	   
	public static void main(String[] args)  {
	Scanner sc = new Scanner(System.in);
	 t = sc.nextInt();//톱니바퀴의 개수를 받는다. 
	sc.nextLine();
	arr = new int[t][8];//톱니바퀴는 4개와 8개의 s,n극을 가진다. 

	for (int i = 0; i < t; i++) {
	   String [] s = sc.nextLine().split("");
	   for (int j = 0; j < 8; j++) {
	      arr[i][j] = Integer.parseInt(s[j]);
	   }
	}

	int k = sc.nextInt();// 총 회전시킬 횟수.
	int result =0;//최종적 점수.

	for (int i = 0; i < k; i++) {//k번만큼 톱니바퀴를 회전한다.
	    n = sc.nextInt();//몇번 톱니바퀴를 돌릴지를 입력받는다.
	    n-=1;//톱니바퀴를 입력받을때는 배열의 인덱스 +1로 주므로 n을 -1을 해야지 정상적으로 배열이 돌아간다.
	    p = sc.nextInt();//n번쨰 톱니바퀴가 시계방향으로 돌아가는지 반시계방향으로 돌아가는지를 받는다.
	    spincan= new int [t];//spincan배열을 새롭게 초기화 시킨다.
	    spincan[n]=p;//n번째의 톱니바퀴 상태는 p로 지정해준다. 
	    check(n);//톱니바퀴 체크
	    spin();//돌리기
	}

	for (int i = 0; i < t; i++) {//점수 계산하는 부분.
	   if(arr[i][0]==1) {
		   result++;
	   }
	}

	System.out.println(result);//결과 출력 



	   }
	}




