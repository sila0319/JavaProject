package _11��_���;
class Car2{
	private String model;
	public Car2(String model) {this.model = model;}
	public boolean eqauls(Object obj) {
		if(obj instanceof Car2) {
			return model.equals(((Car2)obj).model);
		}else {
			return false;
		}
	}
	public String toString() {
		return this.model;
	}
}

public class CarTest2 {
	
	public static void main(String[] args) {
		Car2 firstCar = new Car2("HMW520");
		Car2 secondCar = new Car2("HMW520");
		if(firstCar.eqauls(secondCar)) {
			System.out.println("������ ������ �ڵ����Դϴ�.");
		}else {
			System.out.println("������ ������ �ڵ����� �ƴմϴ�.");
		}
		System.out.println(firstCar.toString());
		System.out.println(secondCar.toString());
		
		System.out.println(firstCar);
		System.out.println(secondCar);
		//Syso���� toString �޼ҵ带 �ڵ������� ȣ���ؼ� �ٿ��ֹǷ� �� ��찡 ���� ����� ���´�.
		
	}

}
