package _12��_�������̽���_������;

class OuterClass{
	private String secret = "Time is money";
	private class InnerClass{
		private InnerClass() {//InnerClass�� ������
			System.out.println("���� Ŭ���� �������Դϴ�.");
		}
		
		public void print() {
			System.out.println(secret);
		}
	}
	
	public OuterClass() {//OuterClass�� ������ 
		InnerClass obj = new InnerClass();
		obj.print();
	}
}

public class OuterClassTest1 {
	public static void main(String[] args) {
		new OuterClass();
	}

}
