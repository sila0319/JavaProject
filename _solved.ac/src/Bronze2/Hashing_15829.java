package Bronze2;



import java.util.Scanner;

public class Hashing_15829 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();//��ĳ�ʿ��� �ذ� 
		String s = sc.nextLine();//���ڿ��� s�� ��´�.
		int prime = 1234567891;//�� ���ڷ� ��������ߵ� math.pow�� �� ��� long���϶� ���е��� �������Ƿ� ���������. 
		long result =0L; // ����� ���� ���� 
		long r =1L;// 
		
		for (int i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i);//c�� ���ڿ��� ���� ���
			result += (((char)(c-96))*r)%prime; 
			//c-96�� a�ǰ��� 1�̵ǵ��� �����ؾ��ϱ⶧�� �̴�. ���� r����ŭ ���Ѵ�. 
			//prime���� �ۼ�Ʈ�޷� ��������� ���е��� �ذ��Ѵ�. 
			r =(r*31)%prime;
			
		}
		System.out.println(result%prime);

		
	}
}	


