package Vector;

import java.util.Vector;//Vector�� ��ü�̴�. 

public class Vector_EX {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();  
		/*new �ڿ����� ���� ������ ��ȣ �ȿ� �ŰԺ����� ���������ְ� ���� �����ִ�.
		 * �ް������� ������ �� ũ�⸸ŭ ������ �����ȴ�
		 * ���ʹ� �Ű������� ���� ��� �⺻������ 10���� �����̻����ȴ�. 
		 * v�� �޼ҵ�
		 * Vector�� �����迭�̴�.
		 */
		System.out.println("Vector Size : " + v.size());//add�� ���� �߰��� ����Ȯ��
 		System.out.println("Vector Capacity : " + v.capacity());
		v.add(5);//0��°
		v.add(-1);//1����
		v.add(15);//2��°
		v.add(5);//3��°
		v.add(-1);//4����
		v.add(15);//5��°
		v.add(5);//6��°
		v.add(-1);//7��°
		v.addElement(3);//8��°
		v.add(10);
		v.add(15);
		
		System.out.println("Vector Size : " + v.size());//add�� ���� �߰��� ����Ȯ��
 		System.out.println("Vector Capacity : " + v.capacity());
 		//size�� 5�� Capacity�� �������10 size�� 15�� Capacity�� ������� 20
		
 		for (int i = 0; i < v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);
		}
		
		int sum =0;
		for (int i = 0; i < v.size(); i++) {//8�� ����.(sizeũ�⸸ŭ)
			int n = v.elementAt(i);//v�� ����� ���ڸ� n�̶�� ������ �����Ѵ�.
			sum +=n;//sum�� n���� �߰��Ѵ�. 
		}
		System.out.println("Sum of Vector : " + sum);//v�ȿ� ����� ��簪�� ����Ѵ�.
	}
}
