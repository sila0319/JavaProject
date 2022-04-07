package _첫번째과제;

public class _13번문제 {
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
		
		System.out.printf("짝수합 : %d, 홀수합 : %d, 전체합 : %d",evenNum, oddNum, result);
	}

}
