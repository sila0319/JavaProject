package _20장_패키지;

public class Auto_BoxingTest1 {
	public static void main(String[] args) {
		Integer box; //Integer라는 객체로 box 선언
		box = 10; // 정수를 자동으로 Integer 객체로 포장한다(boxing)
		System.out.println(box +1); //box는 자동으로 int형으로 변환(unboxing)
		
		//오토박싱이 없다면 아래처럼 글을 작성해야한다. 위와 같은의미를 가지고있다. 
		Integer mi;
		mi = new Integer(10);
		System.out.println(mi.intValue() + 20);
		
	}

}
