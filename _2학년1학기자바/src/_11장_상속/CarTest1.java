package _11��_���;

class Car1{
	int speed;
	int gear;
	public String color;
	
	public void speedUp(int increment) {
		speed += increment;
		System.out.println("���� ���ǵ� : "+speed);
	}
	public void speedDown(int decrement) {
		speed -= decrement;
		System.out.println("���� ���ǵ� : "+speed);
	}
}
class SportsCar extends Car1{
	boolean turbo;
	public void setTurbo(boolean newValue) {
		turbo = newValue;
	}
	
	public void print() {
		System.out.println("���� ��� : "+gear + " ���� ���� : "+color + " ���� ���ǵ� : " +speed + " ���� �ͺ� : "+turbo  );
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
