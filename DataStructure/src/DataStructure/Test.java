package DataStructure;


public class Test {
	public static void main(String[] args) {
		int [] arr = new int [5] ; //�迭���� �� �迭�� ���� ����
		
		for (int i = 0; i < arr.length; i++) {//�迭 ���� �� ���� 
			arr[i] = i;
		}
		
		int [] arr1; // �迭����
		arr1= new int [5]; //�迭�� ���� ����
		
		
		for (int i : arr1) { //for each ���� ����� ������� ����Ʈ�ϱ�
			System.out.print(i+" ");//���ٷ� ����Ʈ �ȴ�. " "�� ���� ��쿡�� i���� �پ ����̵�.
		}
		
		int [] arr2 = { 0,1,2,3,4 } ;//�迭 ���� �� �迭�� ���̹� �迭���� ���� ������ ��� 
		System.out.println();
		
		for (int i : arr2) {
			System.out.print(i+" ");
		}
		
		
		int sum ;
		
		int [] arr3 = null;
		for (int i = 0; i < 1; i++) {
			int result =0;
			arr3 = new int [5];
			for (int j = 0; j < 5; j++) {
				arr3[j] = j;
			}
		}
		
	
		
		System.out.println();
		System.out.println("arr3�Դϴ�.");
		for (int j : arr3) {
			System.out.print(j+" ");
		}
		
		
		
		int [][] array = new int [4][5];
		
//		for(int i = 1; i <= 4; i++ ) {
//			for(int j = 1; j <=5;j++) {
//				array[i-1][j-1] = j;
//			}
//		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = j+1;
			}
		}
		System.out.println();
		System.out.println( "2�߹迭 ����");
		
		for(int i[] : array) {
			for (int j : i) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		
		System.out.println("2�� �迭 �ǽ��� ");
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] +" ");
			}
			System.out.println();
		}
		System.out.println("�� �ٸ� 2�� �迭 ���� ");
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(array[i][j] +" ");
			}
			System.out.println();
		}
	
		
		
		
		
		
		
		
		
	}
}