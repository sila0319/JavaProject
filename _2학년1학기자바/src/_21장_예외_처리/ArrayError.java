package _21��_����_ó��;

public class ArrayError {
	public static void main(String[] args) {
		int [] arr = {1 ,2,3,4,5};
		int i =0;
		try {
			for(i = 0; i<=arr.length ; i++) {
				System.out.print(arr[i] + " ");
			}
		}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("�ε��� " + i +"�� ��� �� �� ���׿�.");
			}	
	}
}