package _22��_���׸���_�÷���;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("MILK");
		list.add("BREAD");
		list.add("BUTTER");
		list.add(1,"APPLE");
		list.set(2, "GRAPE");
		list.remove(3);
		
		
		String s;
		Iterator e = list.iterator();
		while(e.hasNext()) {
			s = (String)e.next();
			e.remove();
			System.out.println(s);
		}
		System.out.println("�׽�Ʈ"+list.size());
		for(String i : list) System.out.println(i);
	}

}
