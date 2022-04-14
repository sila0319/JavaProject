package _9장_생성자와_접근제어;
class Car3{
	private String color;
	private int speed;
	private int gear;
	//자동차 시리얼 번호
	private int id;
	//실제화 된 Car 객체의 개수를 위한 정적 변수
	private static int numberOfCars =0;
	
	public Car3(String c, int s, int g) {
		color =c;
		speed =s;
		gear =g;
		//자동차의 개수를 증가하고 id번호를 할당한다.
		id = ++numberOfCars;
	}
	
	
	
	//정적 메소드
	public static int getNumberOfCars() {
		return numberOfCars;
	}
	
	public String toString() {
	      return String.format("%s %d %d", color,speed, gear);
	   }
}
public class CarTest3 {
	public static void main(String[] args) {
		Car3 c1 = new Car3("blue", 100, 1);
		Car3 c2 = new Car3("white", 0,1);
		int n = Car3.getNumberOfCars();
		System.out.println("지금까지 생성된 자동차 수 = " +n);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
