package _20��_��Ű��;

public class Auto_BoxingTest1 {
	public static void main(String[] args) {
		Integer box; //Integer��� ��ü�� box ����
		box = 10; // ������ �ڵ����� Integer ��ü�� �����Ѵ�(boxing)
		System.out.println(box +1); //box�� �ڵ����� int������ ��ȯ(unboxing)
		
		//����ڽ��� ���ٸ� �Ʒ�ó�� ���� �ۼ��ؾ��Ѵ�. ���� �����ǹ̸� �������ִ�. 
		Integer mi;
		mi = new Integer(10);
		System.out.println(mi.intValue() + 20);
		
	}

}
