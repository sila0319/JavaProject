package _ù��°����;

public class _13������ {
	public static void main(String[] args) {
		
		int result =0;
		int evenNum =0;
		int oddNum =0;
		for (int i = 1; i < 101; i++) {
			if(i%2==0) {
				evenNum += i;
			}else {
				oddNum+=i;
			}
			result += i;
		}
		
		System.out.printf("¦���� : %d, Ȧ���� : %d, ��ü�� : %d",evenNum, oddNum, result);
	}

}
