package _11장_상속;

class Car1{
	int speed;
	int gear;
	public String color;
	
	public void speedUp(int increment) {
		speed += increment;
		System.out.println("현재 스피드 : "+speed);
	}
	public void speedDown(int decrement) {
		speed -= decrement;
		System.out.println("현재 스피드 : "+speed);
	}
}
class SportsCar extends Car1{
	boolean turbo;
	public void setTurbo(boolean newValue) {
		turbo = newValue;
	}
	
	public void print() {
		System.out.println("현재 기어 : "+gear + " 현재 색깔 : "+color + " 현재 스피드 : " +speed + " 현재 터보 : "+turbo  );
	}
}

public class CarTest1 {
	public static void main(String[] args) {
		SportsCar c = new SportsCar();
		c.color ="red";
		c.speedUp(100);
		c.speedDown(10);
		c.setTurbo(true);
		c.print();
		System.out.println("obj is of type" + c.getClass().getName());
	}
}
