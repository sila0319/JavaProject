package _22��_���׸���_�÷���;

import java.util.HashSet;
import java.util.Set;


public class FindDupplication {
	public static void main(String[] args) {
		String[] sample = {"�ܾ�", "�ߺ�", "����", "�ߺ�"};
		Set<String> s = new HashSet<String>();
		for(String a : sample)
			if(!s.add(a))
			System.out.println("�ߺ��� �ܾ� " + a);
		
		System.out.println(s.size()+" �ߺ����� ���� �ܾ� : " + s);
	}

}
