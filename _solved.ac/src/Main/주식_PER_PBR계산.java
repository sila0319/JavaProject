package Main;

import java.util.Scanner;

public class �ֽ�_PER_PBR��� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("PER,PBR,�ְ��� ������� �Է����ּ���");
		double pbe = sc.nextDouble();
		double pbr = sc.nextDouble();
		double �ְ� = sc.nextDouble();
		
		
		System.out.println("PER�� �ִ�������� " + �ְ�/pbe +"�Դϴ�.");
		//�ְ��� ��ǰ���� �ƴ����� �Ǻ��Ѵ� ���������� pbe�� ���Ͽ� ����� �����ε� pbe�� ���ٸ� �������� ���򰡵Ǵ°��̴�.
		System.out.println("PBR�� �ִ� ���ڻ��� ��ġ��" +�ְ�/pbr + "�Դϴ�.");
		//�ִ���ڻ��ǰ�ġ�� ���� ���� ���θ��Ǻ��ϴ� ��ǥ�̴�. PBR�� 1�̸��̸� �ְ��� ���ڻ��� ���� ���� �� �� �ִ�.
		
	}
}
