package _12장_인터페이스와_다형성;

abstract class Shape1{
	int x,y;
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("x좌표 : "+x+" y좌표 : " + y);
	}
	public abstract void draw();
	
};

class Rectangle1 extends Shape1{
	int width, height;
	public void draw() { //추상 메소드 구현
		move(100,200);
		System.out.println("사각형 그리기 메소드");
	}
} 

class Circle1 extends Shape1{
	int radius;
	public void draw() { //추상 메소드 구현
		move(200,300);
		System.out.println("원 그리기 메소드");
	}
} 

public class ShapeTest1 {
	public static void main(String[] args) {
		Rectangle1 R1 = new Rectangle1();
		Circle1 C1 = new Circle1();
		R1.draw();
		C1.draw();
		
		Shape1 s1 = R1;
		System.out.println(s1.x+" x입니다.");
		System.out.println(s1.y+" y입니다.");
		
		Shape1 s2 = C1;
		System.out.println(s2.x+" x입니다.");
		System.out.println(s2.y+" y입니다.");
		
	}

}
