package _8��_�ʵ��_�޼ҵ�_����;
class Test{
	void sub(int... v) {
		System.out.println("�μ��� ���� : "  + v.length);
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
