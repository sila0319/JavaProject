package _12장_인터페이스와_다형성;

class OuterClass{
	private String secret = "Time is money";
	private class InnerClass{
		private InnerClass() {//InnerClass의 생성자
			System.out.println("내부 클래스 생성자입니다.");
		}
		
		public void print() {
			System.out.println(secret);
		}
	}
	
	public OuterClass() {//OuterClass의 생성자 
		InnerClass obj = new InnerClass();
		obj.print();
	}
}

public class OuterClassTest1 {
	public static void main(String[] args) {
		new OuterClass();
	}

}
