package _12장_인터페이스와_다형성;

class Shape3{
	protected int x,y;
	public void draw() {
		System.out.println("Shape Draw");
	}
}

class Rectangle3 extends Shape3{
	private int width, height;
	public void draw() {
		System.out.println("Rectangle3 Draw");
	}
}

class Triangle3 extends Shape3{
	private int base, height;
	public void draw() {
		System.out.println("Triangle3 Draw");
	}
}

class Circle3 extends Shape3{
	private int radius;
	public void draw() {
		System.out.println("Circle3 Draw");
	}
}

class Pentagon3 extends Shape3{
	private int width, height;
	public void draw() {
		System.out.println("Pentagon3 Draw ");
	}
}


public class ShapeTest3 {
	private static Shape3 arrayOfShapes3[];
	public static void init() {
		arrayOfShapes3 = new Shape3[4];
		arrayOfShapes3[0] = new Rectangle3();
		arrayOfShapes3[1] = new Triangle3();
		arrayOfShapes3[2] = new Circle3();
		arrayOfShapes3[3] = new Pentagon3();
		
	}
	
	public static void drawAll() {
		for (int i = 0; i < arrayOfShapes3.length; i++) {
			arrayOfShapes3[i].draw();
		}
	}
	
	public static void main(String[] args) {
		init();
		drawAll();
	}
	

}
