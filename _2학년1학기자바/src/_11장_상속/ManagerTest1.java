package _11��_���;

class Employee{
	public String name; // �̸� : ������
	//��𼭵��� ����� �� �ִ�.
	
	String address; // �ּ� : ��Ű�����
	//���� ��Ű���� �־�߸� ��밡���ϴ�.
	
	protected int salary; // ���� : ��ȣ���
	//�ٸ� ��Ű���� �ִ��� ��ӹ����� ��밡���ϰ� ���ش� protected 
	
	private int RRN; // �ֹε�Ϲ�ȣ : ������ 
	//����Ŭ�������� private�� ���ǵ� ����� ����Ŭ�������� ������ �� ����.
	
	public String toString() {
		return name + ", " + address + ", " + RRN + ", " + salary;
	}
	public void printRRN () {
		System.out.println(RRN); 
	}
}
class Manager extends Employee{
	private int bonus;
	
	public void printSalary() {
		System.out.println(name + " (" + address + ") : " + (salary +bonus));
		//����Ŭ������ private�� ������ ��� ����� ���ٰ���.
	}
	
}

public class ManagerTest1 {
	public static void main(String[] args) {
		Manager m = new Manager();
		m.printRRN();
		m.printSalary();
	
	}

}
