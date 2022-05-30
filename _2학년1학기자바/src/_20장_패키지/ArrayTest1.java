package _20장_패키지;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest1 {
	public static void main(String[] args) {
		int [] array = {9,4,5,6,2,1};
		//Arrays.sort(array);
		Arraysort(array,1);
		printArray(array);
		System.out.println();
		Arraysort(array,0);
		printArray(array);
		System.out.println(Arrays.binarySearch(array, 9));//9의 위치가 어디있는지 서칭한다.
		Arrays.fill(array, 8); //배열의 모든값을 8로 채운다.
		printArray(array);
		
		Random random = new Random();
		array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100);
		}
		printArray(array);
		System.out.println();
		Arrays.sort(array);
		printArray(array);
	}
	
	private static void printArray(int[] array) {
		System.out.print("[ ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
			if(i!=0 && i%9==0 && i!=array.length-1) {System.out.println(); System.out.print("  ");}
			
		}
		System.out.println("]");
	}
	
	private static void Arraysort(int[] array, int a) {
		if(a==1) {
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length-1; j++) {
					if(array[j] > array[j+1]) {
						int temp = array[j];
						array[j] = array[j+1];
						array[j+1] = temp;
					}
				}
				
			}
		}else if(a==0) {
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length-1; j++) {
					if(array[j] < array[j+1]) {
						int temp = array[j];
						array[j] = array[j+1];
						array[j+1] = temp;
					}
				}			
			}
		}
	}
}