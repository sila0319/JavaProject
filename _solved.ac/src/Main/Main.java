

package Main;
import java.util.Scanner;

/*남학생의 경우
 * 
 * 스위치 번호가 남학생이 받은 번호의 배수이면 그 스위치의 상태를 바꾼다.
 * 3을 입력받으면 3번과 6번의 스위치 상태를 바꾼다.
 * 
 * 
 * 
 */

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//스위치 갯수
		int [] arr = new int [n+2];//스위치 갯수 선언
		
		for (int i = 1; i < arr.length-1; i++) {//스위치 상태 받기
			arr[i]= sc.nextInt();
		}
		
		int stu = sc.nextInt();//학생수 만큼 돌아간다.
		for (int i = 0; i < stu; i++) {
			int gender = sc.nextInt(); //학생의 성별
			int number = sc.nextInt();	//학생의 번호
			if(gender ==1) {//남학생일 때
				for (int j = 1; j < arr.length-1; j++) {
					if(j%number==0) {//스위치 번호가 남학생이 받은 번호의 배수일때
						if(arr[j]==0) {//스위치 기존번호가 0이면 1로바꾼다.
							arr[j]=1;
						}else {//스위치 기존번호가 1이면 0으로 바꾼다.
							arr[j]=0;
						}
					}
				}
				
//				for (int j = 1; j < arr.length-1; j++) {
//					System.out.print(arr[j]+" ");
//					if(j%10==0)System.out.println();
//				}

			}else {//여학생일 때
				for (int j = 1; j < arr.length-1; j++) {
					if(number-j>0 && number+j <arr.length-1) {
						if(arr[number+j]==arr[number-j] && arr[number-j]==0) {
							arr[number+j] = arr[number-j] = 1;
						}else if(arr[number+j]==arr[number-j] && arr[number-j]==1) {
							arr[number+j] = arr[number-j] = 0;
						}
					}
				}
				if(arr[number]==0) {
					arr[number]=1;
				}else {
					arr[number]=0;
				}
				
			}
			
		}
		
		for (int i = 1; i < arr.length-1; i++) {
			System.out.print(arr[i]+" ");
			if(i%20==0)System.out.println();
		}
	}
}
		
		
			
