package _22장_제네릭과_컬렉션;

import java.util.Queue;
import java.util.LinkedList;

public class QueueTest {
	public static void main(String[] args) throws InterruptedException {
		int time =10;
		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = time; i > -1; i--) {
			q.add(i);
			
		}
		while(!q.isEmpty()) {
			System.out.print(q.remove()+" ");
			//Thread.sleep(1000);
		}
		
	}
}
