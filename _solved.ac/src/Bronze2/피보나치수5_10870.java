package Bronze2;



	import java.util.Scanner;


	public class 피보나치수5_10870 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int f0 = 0; //초창기 피보나치수 f0의 값은 0
			int f1 = 1; //초창기 피보나치수 f1의 값은 1
			int sum1 =0; // 결과값 
			for (int i = 0; i < n; i++) {
				sum1 = f0+f1; //sum1은 f0+f1의 값이다
				if(i%2==1) { //만약에 i%2의 값이 1일 경우는 f0이 sum1을 가져야한다.
					f0= sum1;
				}else {//아닐 경우는 f1=sum1이 되어야함. 
					f1=sum1;
				}
			}
			System.out.println(sum1);//결과출력 

			
		}
	}

