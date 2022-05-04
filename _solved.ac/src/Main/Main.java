package Main;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args)  {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int [] way = new int [n-1];
	int [] city = new int [n]; 
	int result =0;
	int min =1000000001;
	int where =0;
	for (int i = 0; i < way.length; i++) {
		way[i] = sc.nextInt();
	}
	for (int i = 0; i < city.length; i++) {
		city[i]= sc.nextInt();
		if(min > city[i]) {
			min =city[i];
			where =i;
		}
	}
	
	
	
	
	}
}

