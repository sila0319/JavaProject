package _11장_상속;

class Employee{
	public String name; // 이름 : 공용멤버
	//어디서든지 사용할 수 있다.
	
	String address; // 주소 : 패키지멤버
	//같은 패키지에 있어야만 사용가능하다.
	
	protected int salary; // 월급 : 보호멤버
	//다른 패키지에 있더라도 상속받으면 사용가능하게 해준다 protected 
	
	private int RRN; // 주민등록번호 : 전용멤버 
	//수퍼클래스에서 private로 정의된 멤버는 서브클래스에서 접근할 수 없다.
	
	public String toString() {
		return name + ", " + address + ", " + RRN + ", " + salary;
	}
	public void printRRN () {
		System.out.println(RRN); 
	}
}
class Manager extends Employee{
	private int bonus;
	
	public void printSalary() {
		System.out.println(name + " (" + address + ") : " + (salary +bonus));
		//수퍼클래스의 private를 제외한 모든 멤버에 접근가능.
	}
	
}

public class ManagerTest1 {
	public static void main(String[] args) {
		Manager m = new Manager();
		m.printRRN();
		m.printSalary();
	
	}

}
