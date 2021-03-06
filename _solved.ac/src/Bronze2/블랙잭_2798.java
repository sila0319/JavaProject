//카지노에서 제일 인기 있는 게임 블랙잭의 규칙은 상당히 쉽다. 
//카드의 합이 21을 넘지 않는 한도 내에서, 카드의 합을 최대한 크게 만드는 게임이다. 블랙잭은 카지노마다 다양한 규정이 있다.
//
//한국 최고의 블랙잭 고수 김정인은 새로운 블랙잭 규칙을 만들어 상근, 창영이와 게임하려고 한다.
//
//김정인 버전의 블랙잭에서 각 카드에는 양의 정수가 쓰여 있다. 그 다음, 
//딜러는 N장의 카드를 모두 숫자가 보이도록 바닥에 놓는다. 그런 후에 딜러는 숫자 M을 크게 외친다.
//
//이제 플레이어는 제한된 시간 안에 N장의 카드 중에서 3장의 카드를 골라야 한다. 
//블랙잭 변형 게임이기 때문에, 플레이어가 고른 카드의 합은 M을 넘지 않으면서 M과 최대한 가깝게 만들어야 한다.
//
//N장의 카드에 써져 있는 숫자가 주어졌을 때, M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 구해 출력하시오.
//
//입력
//첫째 줄에 카드의 개수 N(3 ≤ N ≤ 100)과 M(10 ≤ M ≤ 300,000)이 주어진다. 
//둘째 줄에는 카드에 쓰여 있는 수가 주어지며, 이 값은 100,000을 넘지 않는 양의 정수이다.
//
//합이 M을 넘지 않는 카드 3장을 찾을 수 있는 경우만 입력으로 주어진다.
//
//출력
//첫째 줄에 M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 출력한다.
//
//예제 입력 1 
//5 21
//5 6 7 8 9
//예제 출력 1 
//21
//예제 입력 2 
//10 500
//93 181 245 214 315 36 185 138 216 295
//예제 출력 2 
//497

package Bronze2;

	import java.util.Scanner;
	import java.util.Arrays;

	public class 블랙잭_2798 {
	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();//카드의 갯수
	        int [] arr = new int [n];//카드 갯수만큼 배열 선언
	        int sum = sc.nextInt();//블랙잭 규칙을 통해 3장을뽑아 만들 숫자
	        int temp =0;//교환할 숫자
	        int result =0;//결과값 
	        
	        for (int i = 0; i < arr.length; i++) {//배열에다가 카드숫자를 받아 넣는다. 
				arr[i] = sc.nextInt();	
			}
	        
	        Arrays.sort(arr);//정렬한다
	        
	        for (int i = 0; i < arr.length; i++) {
	        	//카드를 3장을 뽑아 sum과의 근사값을 찾아야하므로
	        	//3중포문을 선언하여서 찾는다.
				for (int j = 0; j < arr.length; j++) {
					for (int j2 = 0; j2 < arr.length; j2++) {
						if(i!=j && j!=j2 && i!=j2) {
							//카드를 한번쓰면 못 뽑으므로 i,j,j2의 값이 다 달라야한다. 1,1,1이 되면안된다는 뜻
							temp=arr[i]+arr[j]+arr[j2];//j2를 하나씩 늘려나가면서 경우의 수를 찾는다. 
							if(temp<= sum && result <= temp) {
								//sum보다 작거나 크고 기존의 result값보다 temp가 크거나 같으면 result의 값을 temp로 변환한다.
								result = temp;
							}
						}
					}
				}
			}
	        System.out.println(result);//결과 출력
	    }
}
