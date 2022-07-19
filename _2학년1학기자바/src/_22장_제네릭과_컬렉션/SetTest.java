package _22장_제네릭과_컬렉션;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTest {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Milk");
		set.add("Bread");
		set.add("Butter");
		set.add("Cheese");
		set.add("Ham");
		set.add("Ham");
		System.out.println(set);
		System.out.println("HashSet Test");
		
		LinkedHashSet<String> lhset = new LinkedHashSet<String>();
		lhset.add("Milk");
		lhset.add("Bread");
		lhset.add("Butter");
		lhset.add("Cheese");
		lhset.add("Ham");
		lhset.add("Ham");
		System.out.println(lhset);
		System.out.println("LinkedHasgSet Test");
		
		TreeSet<String> treeset = new TreeSet<String>();
		treeset.add("Milk");
		treeset.add("Bread");
		treeset.add("Butter");
		treeset.add("Cheese");
		treeset.add("Ham");
		treeset.add("Ham");
		System.out.println(treeset);
		System.out.println("TreeSet Test");
	}

}
