package _세번쨰과제;
import java.util.Scanner;

public class _1번별찍기 {
	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				//출력할 별의 줄
				int num = sc.nextInt();//별의 줄을 입력받는다.
				String star = "";//String star 변수를 선언한다.
				for (int i = 0; i < num; i++) {//num값 만큼 돈다
					star += "*";//별이 1개씩 늘린다.
					System.out.println(star);//별을 출력한다				
		}	
	}
}