package _12장_인터페이스와_다형성;

interface Days1{
	public static final int SUNDAY =1, MONDAY =2, TUESDAY =3,
			WEDNESDAY =4, THURSDAY =5, FRIDAY =6, SATURDAY =7;
	
}
public class DayTest1 implements Days1 {
	public static void main(String[] args) {
	System.out.println("일요일 : "+SUNDAY);	
	
	}
}
