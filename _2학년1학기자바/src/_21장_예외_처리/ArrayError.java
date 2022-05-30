package _21장_예외_처리;

public class ArrayError {
	public static void main(String[] args) {
		int [] arr = {1 ,2,3,4,5};
		int i =0;
		try {
			for(i = 0; i<=arr.length ; i++) {
				System.out.print(arr[i] + " ");
			}
		}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스 " + i +"는 사용 할 수 없네요.");
			}	
	}
}