package _12��_�������̽���_������;
interface RemoteControl1{
	void turnOn();
	void turnOff();
}
public class AnonymousClassTest1   {
	public static void main(String[] args) {
		RemoteControl1 ac = new RemoteControl1() {
			public void turnOn() {
				System.out.println("TV turnOn()");
			}
			public void turnOff() {
				System.out.println("TV turnOff()");
			}
		};
		ac.turnOn();
		ac.turnOff();
	}

}
