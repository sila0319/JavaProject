package Main;
import java.util.Scanner;

/*���л��� ���
 * 
 * ����ġ ��ȣ�� ���л��� ���� ��ȣ�� ����̸� �� ����ġ�� ���¸� �ٲ۴�.
 * 3�� �Է¹����� 3���� 6���� ����ġ ���¸� �ٲ۴�.
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