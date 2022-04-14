package _9厘_积己磊客_立辟力绢;
class Point{
	private int x, y;
	
	public Point(int a, int b) {
		x = a;
		y = b;
	}
}

class Circle{
	private int radius =0;
	private Point center;
	
	public Circle(Point p, int r) {
		center = p;
		radius = r;
	}
}

public class CicleTest {
	public static void main(String[] args) {
		Point p = new Point(25, 78);
		Circle c = new Circle(p, 10);
		System.out.println(c);
	}

}
