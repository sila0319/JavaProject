package _10��_�迭;

public class ArrayTest6 {
	public static void main(String[] args) {
		int [][] arry = {{10,20,30,40}, {50,60,50,80},{90,100,110,120}};
		
		for (int i = 0; i < arry.length; i++) {
			for (int j = 0; j < arry[i].length; j++) {
				System.out.println(i+ "�� " + j +"�� " + arry[i][j]);
				
			}
		}
	}

}
