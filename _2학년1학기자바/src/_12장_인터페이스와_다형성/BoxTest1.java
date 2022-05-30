package _12장_인터페이스와_다형성;

interface Comparable1{
	int compareTo(Object other);
}

public class BoxTest1 implements Comparable1 {
	private double volume =0;
	public BoxTest1(double v) {
		volume =v;
	}
	
	public int compareTo(Object otherObject) {
		BoxTest1 other = (BoxTest1) otherObject;
		if(this.volume < other.volume) return -1;
		else if(this.volume > other.volume) return 1;
		else return 0;
	}
		
	public static void main(String[] args) {
		BoxTest1 b1 = new BoxTest1(100);
		BoxTest1 b2 = new BoxTest1(85.0);
		
		if(b1.compareTo(b2) >0) {
			System.out.println("b1이 b2보다 크다");
		}else if(b1.compareTo(b2) <0) {
			System.out.println("b2이 b1보다 크다");
		}else {
			System.out.println("b1과b2의 크기가 같다.");
		}
	}
}
