//정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 
//이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
//
//둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 
//주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
//
//출력
//X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.

package Bronze3;

	import java.util.Scanner;

	public class x보다작은수_10871 {
		public static void main(String[] args)  {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();//숫자 몇개를 받는지 정한다
			int x = sc.nextInt();//어떤 정수보다 작은지를 정한다
			for (int i = 0; i < n; i++) {//n값만큼 돈다
				int num = sc.nextInt();//숫자를 n값만큼 받는다
				if(x > num) {//만약에 x보다 숫자가 작을경우 num을 출력한다.
					System.out.print(num+" ");
				}
			}

		}
	}
