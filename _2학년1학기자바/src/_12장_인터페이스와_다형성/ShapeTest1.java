package _12��_�������̽���_������;

abstract class Shape1{
	int x,y;
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("x��ǥ : "+x+" y��ǥ : " + y);
	}
	public abstract void draw();
	
};

class Rectangle1 extends Shape1{
	int width, height;
	public void draw() { //�߻� �޼ҵ� ����
		move(100,200);
		System.out.println("�簢�� �׸��� �޼ҵ�");
	}
} 

class Circle1 extends Shape1{
	int radius;
	public void draw() { //�߻� �޼ҵ� ����
		move(200,300);
		System.out.println("�� �׸��� �޼ҵ�");
	}
} 

public class ShapeTest1 {
	public static void main(String[] args) {
		Rectangle1 R1 = new Rectangle1();
		Circle1 C1 = new Circle1();
		R1.draw();
		C1.draw();
		
		Shape1 s1 = R1;
		System.out.println(s1.x+" x�Դϴ�.");
		System.out.println(s1.y+" y�Դϴ�.");
		
		Shape1 s2 = C1;
		System.out.println(s2.x+" x�Դϴ�.");
		System.out.println(s2.y+" y�Դϴ�.");
		
	}

}
