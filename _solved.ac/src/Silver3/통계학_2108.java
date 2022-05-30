package Silver3;


	import java.util.Scanner;
	import java.util.Arrays;

	public class 통계학_2108 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();//n값만큼 수를 받아서  통계를 낸다.
			int [] arr =new int [n];//수를 담을 배열
			int [] marr = new int [8001];//최빈값의 max값 찾기위한 배열
			int max =0; //최빈값 max값 선정 
			int wid =0; //최빈값 max값의 위치 찾기 
			double hap =0;//산술평균을 담을 변수
			int middle =0;//중앙값을 담을 변수
			int len = 0;//범위값을 담을 변수 
	
			//입력받은 수가 몇번 나왔는지 체크 및 배열에 값 넣기. n의 모든합계구하기.
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
				hap += arr[i];
				marr[arr[i]+4000]++;
			}
			
			Arrays.sort(arr);
			
			//최빈값 찾기.
			for (int i = 0; i < marr.length; i++) {
				if(marr[i]>max) {
					max=marr[i];
					wid =i;
				}
			}
			//동일한 최빈값이 있을경우 두번째로 작은값을 최빈값으로 선정하기.
			for (int i = 0; i < marr.length; i++) {
				if(max==marr[i] && i!= wid ) {
					wid =i;
					break;
				}
			}
		middle = arr[arr.length/2];	//중앙값 계산
		len = Math.abs(arr[0]-arr[arr.length-1]);//범위값 계산
		
		//출력부분
		System.out.println(Math.round(hap/n));	//산술평균값
		System.out.println(middle);	//중앙값
		System.out.println(wid-4000);	//최빈값	
		System.out.println(len);//범위값
	}
}


