package _12��_�������̽���_������;
class Shape{
	int x, y;
}

class Rectangle extends Shape{
	int width, height ;
	Rectangle r = new Rectangle();
	
	
}
public class ShapeTest2 {
	public static void main(String[] args) {
		Shape s;
		Rectangle r = new Rectangle();
		s =r;
		s.x = 0;
		s.y = 0;
		
	}
}
