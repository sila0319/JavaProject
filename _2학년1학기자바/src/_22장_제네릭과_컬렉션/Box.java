package _22장_제네릭과_컬렉션;

public class Box<T> {
	private T data;
	public void set(T data) {this.data = data;}
	public T get() {return data;}

}
