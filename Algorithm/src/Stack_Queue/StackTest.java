package Stack_Queue;
import java.util.EmptyStackException;
class Stack<T>{
	class Node<T>{
	
	private T date;
	private Node<T> next;
	
	public Node(T date) {
		this.date = data;
	}
 }
	private Node<T> top;
	public T pop() {
		if(top == null) {
			throw nex ExptyStackException();
		}
		T item = top.data;
		top = top.next;
		return item;
	}
	public void push(T item) {
		Node<T> t = new Node<T>(item);
		t.next = top;
		top = t;
	}
	public boolean isEmpty() {
		return top == null;
	}
}
public class StackTest {
	public static void main(String[] args) {
		S
	
	}
}
