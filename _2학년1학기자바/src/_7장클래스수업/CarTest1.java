package _7장클래스수업;


class Car{
	private String color;
	private int speed;
	private int gear;
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {return speed;}
	public void setSpeed(int s) {speed =s ;}
	public int getGear() {return gear;}
	public void setGear(int g ) { gear = g;}
	
}

public class CarTest1 {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.setColor("red");
		myCar.setSpeed(100);
		myCar.setGear(1);
		
		System.out.println("현재 자동차의 색상은 " + myCar.getColor());
		System.out.println("현재 자동차의 속도는 " + myCar.getSpeed());
		System.out.println("현재 자동차의 기어는 " + myCar.getGear());	
		
		Car yourCar = new Car();
		
		yourCar.setColor("red");
		yourCar.setSpeed(100);
		yourCar.setGear(1);
		
		
		
	}
}
