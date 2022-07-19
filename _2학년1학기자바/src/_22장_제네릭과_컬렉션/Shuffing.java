package _22장_제네릭과_컬렉션;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Shuffing {
	 public static void main(String[] args) {
	      List<Integer> list = new ArrayList<Integer>();
	         for(int i = 1; i <= 10; i++)
	            list.add(i);
	            Collections.shuffle(list);
	            System.out.println(list);
	   }

}
