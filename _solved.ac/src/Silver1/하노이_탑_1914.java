package Silver1;

import java.util.Scanner;
import java.math.BigInteger;

public class �ϳ���_ž_1914 {
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
        } else { // 20 �ʰ��ϸ� BigInteger�� �̵� Ƚ���� ���
            for(int i=0; i<n; ++i) {
                res = res.multiply(new BigInteger("2")); // 2�� N ����
            }
            res = res.subtract(new BigInteger("1")); // ���� 1
            System.out.println(res);
        }		
	}	
}