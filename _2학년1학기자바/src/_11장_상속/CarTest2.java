package _11장_상속;
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
			System.out.println("동일한 종류의 자동차입니다.");
		}else {
			System.out.println("동일한 종류의 자동차가 아닙니다.");
		}
		System.out.println(firstCar.toString());
		System.out.println(secondCar.toString());
		
		System.out.println(firstCar);
		System.out.println(secondCar);
		//Syso에서 toString 메소드를 자동적으로 호출해서 붙여주므로 두 경우가 같은 결과가 나온다.
		
	}

}
