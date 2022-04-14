package _8장_필드와_메소드_수업;
class Test{
	void sub(int... v) {
		System.out.println("인수의 개수 : "  + v.length);
		for (int i : v)System.out.print(i + " ");
		System.out.println();
	}
}
public class VarArgsTest {
	public static void main(String[] args) {
		Test c = new Test();
		c.sub(1);
		c.sub(2, 3,4,5,6);
		c.sub();
	}

}
