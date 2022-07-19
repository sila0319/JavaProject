package _22장_제네릭과_컬렉션;

import java.util.HashSet;
import java.util.Set;


public class FindDupplication {
	public static void main(String[] args) {
		String[] sample = {"단어", "중복", "구절", "중복"};
		Set<String> s = new HashSet<String>();
		for(String a : sample)
			if(!s.add(a))
			System.out.println("중복된 단어 " + a);
		
		System.out.println(s.size()+" 중복되지 않은 단어 : " + s);
	}

}
