package Bronze2;



import java.util.Scanner;

public class Hashing_15829 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();//스캐너오류 해결 
		String s = sc.nextLine();//문자열을 s에 담는다.
		int prime = 1234567891;//이 숫자로 나누어줘야됨 math.pow를 쓸 경우 long형일때 정밀도가 떨어지므로 직접계싼함. 
		long result =0L; // 결과를 담을 변수 
		long r =1L;// 
		
		for (int i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i);//c에 문자열의 문자 담기
			result += (((char)(c-96))*r)%prime; 
			//c-96은 a의값이 1이되도록 설정해야하기때문 이다. 그후 r값만큼 곱한다. 
			//prime으로 퍼센트달러 계산을해줘 정밀도를 해결한다. 
			r =(r*31)%prime;
			
		}
		System.out.println(result%prime);

		
	}
}	


