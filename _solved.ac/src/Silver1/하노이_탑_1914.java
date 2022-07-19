package Silver1;

import java.util.Scanner;
import java.math.BigInteger;

public class 하노이_탑_1914 {
	static StringBuilder sb = new StringBuilder();
	
	static void HanoiTowerMove(int num, int from, int by, int to)
	{
		if(num==1) {
			sb.append(from+" "+to+"\n");
			return;
		}
			HanoiTowerMove(num-1, from, to, by);
			sb.append(from+" "+to+"\n");
			HanoiTowerMove(num-1, by, from, to);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger res = new BigInteger("1");
		
		int n = sc.nextInt();
		if (n<=20) { 
			HanoiTowerMove(n, 1, 2, 3);
            sb.insert(0, (int)(Math.pow(2, n) - 1) + "\n");
            System.out.print(sb);
        } else { // 20 초과하면 BigInteger로 이동 횟수만 출력
            for(int i=0; i<n; ++i) {
                res = res.multiply(new BigInteger("2")); // 2의 N 제곱
            }
            res = res.subtract(new BigInteger("1")); // 빼기 1
            System.out.println(res);
        }		
	}	
}