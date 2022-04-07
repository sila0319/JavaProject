package Main;

import java.util.Scanner;

public class 주식_PER_PBR계산 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("PER,PBR,주가를 순서대로 입력해주세요");
		double pbe = sc.nextDouble();
		double pbr = sc.nextDouble();
		double 주가 = sc.nextDouble();
		
		
		System.out.println("PER의 주당순이익은 " + 주가/pbe +"입니다.");
		//주가가 거품인지 아닌지를 판별한다 동종업계의 pbe를 비교하여 비슷한 가격인데 pbe가 낮다면 낮은쪽이 저평가되는것이다.
		System.out.println("PBR의 주당 순자산의 가치는" +주가/pbr + "입니다.");
		//주당순자산의가치를 통해 저평가 여부를판별하는 지표이다. PBR이 1미만이면 주가는 순자산대비 저평가 됨을 알 수 있다.
		
	}
}
