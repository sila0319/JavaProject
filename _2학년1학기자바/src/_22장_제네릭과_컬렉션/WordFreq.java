package _22��_���׸���_�÷���;

import java.util.Map;
import java.util.HashMap;

public class WordFreq {
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer>();
		
		String [] sample = {"to","be","or","not","to","be","is","a", " problem"};
		for(String a : sample) {
			Integer freq = m.get(a);
			m.put(a, (freq ==null) ? 1 : freq+1);
		}
		
		System.out.println(m.size()+" �ܾ �ֽ��ϴ�.");
		System.out.println(m.containsKey("to"));
		System.out.println(m.isEmpty());
		System.out.println(m);
	}

}
