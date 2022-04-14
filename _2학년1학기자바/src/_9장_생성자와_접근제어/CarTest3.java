package _9��_�����ڿ�_��������;
class Car3{
	private String color;
	private int speed;
	private int gear;
	//�ڵ��� �ø��� ��ȣ
	private int id;
	//����ȭ �� Car ��ü�� ������ ���� ���� ����
	private static int numberOfCars =0;
	
	public Car3(String c, int s, int g) {
		color =c;
		speed =s;
		gear =g;
		//�ڵ����� ������ �����ϰ� id��ȣ�� �Ҵ��Ѵ�.
		id = ++numberOfCars;
	}
	
	
	
	//���� �޼ҵ�
	public static int getNumberOfCars() {
		return numberOfCars;
	}
	
	public String toString() {
	      return String.format("%s %d %d", color,speed, gear);
	   }
}
public class CarTest3 {
	public static void main(String[] args) {
		Car3 c1 = new Car3("blue", 100, 1);
		Car3 c2 = new Car3("white", 0,1);
		int n = Car3.getNumberOfCars();
		System.out.println("���ݱ��� ������ �ڵ��� �� = " +n);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
