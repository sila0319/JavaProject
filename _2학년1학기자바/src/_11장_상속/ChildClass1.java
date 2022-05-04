package _11장_상속;

class ParentClass1{
	int data= 100;
	public void print() {
		System.out.println("수퍼 클래스의 print() 메소드");
	}
}

public class ChildClass1 extends ParentClass1{
	int data = 200;
	
	public void print() {
		super.print();
		System.out.println("서브 클래스의 print() 메소드");
		System.out.println(this.data);
		System.out.println(super.data);
	}
	
	public static void main(String[] args) {
		ChildClass1 obj = new ChildClass1();
		obj.print();
	}
}
