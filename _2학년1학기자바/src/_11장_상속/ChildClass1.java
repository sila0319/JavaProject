package _11��_���;

class ParentClass1{
	int data= 100;
	public void print() {
		System.out.println("���� Ŭ������ print() �޼ҵ�");
	}
}

public class ChildClass1 extends ParentClass1{
	int data = 200;
	
	public void print() {
		super.print();
		System.out.println("���� Ŭ������ print() �޼ҵ�");
		System.out.println(this.data);
		System.out.println(super.data);
	}
	
	public static void main(String[] args) {
		ChildClass1 obj = new ChildClass1();
		obj.print();
	}
}
