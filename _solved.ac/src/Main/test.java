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

public class test {
	
	static int eucd(int bn, int sn) {
		int r = bn%sn;
		if(r==0) {
			return sn;
		}else {
			return eucd(sn,r);
		}
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 12;
		int b = 8;
		int	N = eucd(Math.max(a, b), Math.min(a, b));
		System.out.println(N);
	}
}