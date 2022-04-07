//-는 0에 대응한다.
//\는 1에 대응한다.
//(는 2에 대응한다.
//@는 3에 대응한다.
//?는 4에 대응한다.
//>는 5에 대응한다.
//&는 6에 대응한다.
//%는 7에 대응한다.
///는 -1에 대응한다.
//당연히 문어의 수 체계는 8진법에 기반한다. 예를 들면 다음과 같다.
// (@&는 2 × 82 + 3 × 8 + 6 = 158이다.
// ?/--는 4 × 83 + −1 × 82 + 0 × 8 + 0 = 1984이다.
// /(\는 −1 × 82 + 2 × 8 + 1 = −47이다.
//한 줄에 하나씩 문어 숫자가 입력으로 주어진다. 각 숫자는 최소 한 개, 
//최대 여덟 개의 문어 숫자 기호로 이루어져있다. 입력으로 '#'이 들어오면 입력을 종료한다.
//입력 받은 문어 숫자에 대응하는 십진수를 한 줄에 하나씩 출력한다.
//
//
package Bronze3;
//
//import java.util.Scanner;
//
public class 문어숫자_1864 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int sum = 0;//변환한 값을 계산하여 담을 변수
//		
//		while (true) {//#이나오면 무한반복 멈춤
//			String n = sc.nextLine();//n값을 읽고
//			String [] arr = n.split("");//n값을 짤라서 배열에 집어 넣기
//			int low =arr.length;//배열의 길이에서 for문이 한번돌때마다 -1씩해야함.
//			int count =1;//몇번 제곱할지 카운트
//			sum =0;//섬값을 초기화해줘야 제대로된 값 나옴.
//			
//			if(n.equals("#")) {//#이 나올경우 와일문 종료
//				break;
//			}else {
//				
//				for (int i = 0; i < arr.length; i++) {//배열의 길이 만큼 문자를 읽음. 아래는 잔물결 무늬
//					if(arr[i].equals("-")) {
//						sum += 0*(int)Math.pow(8,(low-(count+i)));
//						//8을 제곱할때 low는 배열의 길이, count는 기본값1 
//						//만약 for문이 처음 도는 경우 count는 0을 더해서 8제곱 배열의 길이-1만큼 제곱
//						//만일 for문이 두번 도는 경우 count는 1을 더해서 8제곱 배열의 길이-2만큼 제곱
//						//마지막 for문의 경우 8의0승이 되므로 값이 1이 되어 잔물결 무늬 숫자 곱하기 1이 됨.
//					}else if(arr[i].equals("\\")) {
//						sum += 1*(int)Math.pow(8,(low-(count+i)));
//					}else if(arr[i].equals("(")) {
//						sum += 2*((int)Math.pow(8,(low-(count+i))));
//					}else if(arr[i].equals("@")) {
//						sum += 3*((int)Math.pow(8,(low-(count+i))));
//					}else if(arr[i].equals("?")) {
//						sum += 4*(int)Math.pow(8,(low-(count+i)));
//					}else if(arr[i].equals(">")) {
//						sum += 5*(int)Math.pow(8,(low-(count+i)));
//					}else if(arr[i].equals("&")) {
//						sum += 6*(int)Math.pow(8,(low-(count+i)));
//					}else if(arr[i].equals("%")) {
//						sum += 7*(int)Math.pow(8,(low-(count+i)));
//					}else if(arr[i].equals("/")) {
//						sum += (-1)*(int)Math.pow(8,(low-(count+i)));
//					}
//				}System.out.println(sum);//결과값 도출.
//			}
//			}
	}
}
