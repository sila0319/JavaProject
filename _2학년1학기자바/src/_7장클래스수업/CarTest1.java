package _7��Ŭ��������;


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
		
		System.out.println("���� �ڵ����� ������ " + myCar.getColor());
		System.out.println("���� �ڵ����� �ӵ��� " + myCar.getSpeed());
		System.out.println("���� �ڵ����� ���� " + myCar.getGear());	
		
		Car yourCar = new Car();
		
		yourCar.setColor("red");
		yourCar.setSpeed(100);
		yourCar.setGear(1);
		
		
		
	}
}
