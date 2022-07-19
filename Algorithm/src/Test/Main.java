package Test;

import java.util.Scanner;
import java.math.BigInteger;


public class Main {
	static BigInteger cnt = new BigInteger("1");
	static BigInteger k; 
	
	
	static void HanoiTowerMove(int num, int from, int by, int to)
	{
		
		if(cnt==k) {
			System.out.println(from+" "+to);
			return;
		}
//			if(num==1) {
//				//System.out.println((from+" "+to));
//				return;
//			}
			
				HanoiTowerMove2(num-1, from, to, by);
				//HanoiTowerMove(num-1, by,from,to,++cnt);
				
		
	}
	static void HanoiTowerMove2(int num, int from, int by, int to)
	{
		
		if(cnt==k) {
			System.out.println(from+" "+to);
			return;
		}
//			if(num==1) {
//				//System.out.println((from+" "+to));
//				return;
//			}
			
				//HanoiTowerMove(num-1, from, to, by,++cnt);
				HanoiTowerMove(num-1, by,from,to);
				
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		int a = sc.nextInt();
		k = new BigInteger("a");
		
		HanoiTowerMove(2*n+1, 1, 2, 3);
		//System.out.println(cnt);
		
		
		
	}	
}
