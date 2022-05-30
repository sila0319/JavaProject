package DataStructure;
import java.util.Arrays;
public class Arraylist<E> implements List<E> {
	
	private static final int DEFAULT = 100;
	private Object[] array;
	private int size;
	
	public Arraylist() {
		array = new Object[DEFAULT];
	}
	public Arraylist(int capacity) {
		array = new Object[capacity];
	}
	/*
	 * 꽉찼을때, 용량을 늘려줌
	 * 절반 정도 비었을 때, 용량을 줄임 
	 */
	
	private void resize() {
		int length = array.length;
		
		if(length == size) {
			array = Arrays.copyOf(array, length = DEFAULT);
		}
		
		if(size < length/2) {
			array = Arrays.copyOf(array, length< DEFAULT ? DEFAULT : length);
		}
		
		
	}
	
	
	
	@Override
	public boolean add(E value) {
		if(size == array.length) resize();
			
		array[size] = value;
		size++;

		return false;
	}

	@Override
	public void add(int index, E value) {
		if(index > size || index < 0 ) throw new IndexOutOfBoundsException();
		
		if(size == array.length) resize();
		
		if(index == size ) add(value);
		else {
			for(int i = size ; i> index ; i--  ) {
				array[i] = array[i-1];
			}
			array[index] =value;
			size++;
		}
	}

	@Override
	public boolean remove(Object value) {
		int index = indexOf(value);
		
		if(index ==-1) return false;
		remove(index);
		return true;
		
	}

	@Override
	public E remove(int index) {
		if(index >= size || index < 0 ) throw new IndexOutOfBoundsException();
		E e =(E) array[index];
		for (int i = index ; i < size -1; i++) {
			array[i] = array[i+1];
		}
		array[size-1] = null;
		size --;
		resize();
		return e;
	}

	@Override
	public E get(int index) {
		if(index >= size || index < 0 ) throw new IndexOutOfBoundsException();
		return (E) array[index];
	}

	@Override
	public int indexOf(Object value) {
		int i =0;
		for(i =0; i <size; i++) {
			if(array[i].equals(value)) return i;
		}
		return -1;
	}

	@Override
	public boolean contains(Object value) {
		if(indexOf(value) >= 0) return true;
		return false;
	}

	@Override
	public void set(int index, E value) {
		if(index >= size || index < 0 ) throw new IndexOutOfBoundsException();
		array[index] = value;
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size ==0;
	}

	@Override
	public void clear() {
		for (int i = 0; i < size; i++) {
			array[i] = null;
		}
		size =0;
		resize();
		
		
	}
	
	

}
