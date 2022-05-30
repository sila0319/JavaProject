package DataStructure;


public class Test {
	public static void main(String[] args) {
		int [] arr = new int [5] ; //배열선언 및 배열의 길이 지정
		
		for (int i = 0; i < arr.length; i++) {//배열 안의 값 지정 
			arr[i] = i;
		}
		
		int [] arr1; // 배열선언
		arr1= new int [5]; //배열의 길이 지정
		
		
		for (int i : arr1) { //for each 문을 사용한 방식으로 프린트하기
			System.out.print(i+" ");//한줄로 프린트 된다. " "을 안할 경우에는 i값이 붙어서 출력이됨.
		}
		
		int [] arr2 = { 0,1,2,3,4 } ;//배열 선언 및 배열의 길이및 배열안의 값을 정해준 방식 
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
		System.out.println("arr3입니다.");
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
		System.out.println( "2중배열 시작");
		
		for(int i[] : array) {
			for (int j : i) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		
		System.out.println("2중 배열 또시작 ");
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] +" ");
			}
			System.out.println();
		}
		System.out.println("또 다른 2중 배열 시작 ");
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(array[i][j] +" ");
			}
			System.out.println();
		}
	
		
		
		
		
		
		
		
		
	}
}