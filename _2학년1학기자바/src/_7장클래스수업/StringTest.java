package _7장클래스수업;

public class StringTest {
	public static void main(String[] args) {
		String proverb = "A barking dog";		//new 연산자 생략
		String s1, s2, s3 ,s4;					//참조 변수로서 메소드에서 반환된 참조값을 받는다.
		String number = "123";
		System.out.println("문자열의 길이 = " + proverb.length());
		
		s1 = proverb.concat(" naver Bites!");	//문자열결합
		s2 = proverb.replace('b', 'B');			//문자 교환
		s3 = proverb.substring(1, 5);			//부분 문자열 추출
		s4 = proverb.toUpperCase();				//대문자로 변환
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println();
		
		System.out.println(proverb.isEmpty());//proverb의 길이가 0이면 true 
		System.out.println(proverb.compareTo(s1));//사전적 순서로 문자열을 비교한다. 아에있으면 -1, 같으면 0, 뒤에있으면 1이 반환된다.
		System.out.println(proverb.equalsIgnoreCase(s2));//대소문자를 무시하고 비교한다.
		System.out.println(proverb.toLowerCase());//proverb의 값을 소문자로 바꾼다.
		System.out.println(proverb.toUpperCase());//proverb의 값을 대문자로 바꾼다.
		System.out.println(Integer.parseInt(number));//String을 숫자로 바꿔준다.
	}
}
