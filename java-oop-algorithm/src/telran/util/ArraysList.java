package telran.util;

import java.util.Arrays;

public class ArraysList<T> implements List<T> {
private static final int DEFAULT_CAPACITY = 16;

private T[] array;

private int size;


@SuppressWarnings("unchecked")
public ArraysList(int capacity) {
	array = (T[]) new Object[capacity];
}
public ArraysList() {
	this(DEFAULT_CAPACITY);
}
	@Override
	public boolean add(T obj) {
		if(size == array.length) {
			reallocate();
		}
		array[size]= obj;
		size++;
		return false;
	}

	private void reallocate() {
		array=Arrays.copyOf(array,array.length*2);
		
	}
	@Override
	public void add(int index, T obj) {
	
	    if (index < 0 || index > size)
	      throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
	    
	    ensureCapacity();

	    for (int i = size - 1; i >= index; i--)
	    	array[i + 1] = array[i];

	    array[index] = obj;

	    size++;
	  } 
	  private void ensureCapacity() {
	    if (size >= array.length) {
	      @SuppressWarnings("unchecked")
		T[] newArray = (T[])(new Object[size * 2 + 1]);
	      System.arraycopy(array, 0, newArray, 0, size);
	      array = newArray;
	    }
    }
	@Override
	public T remove(int index) {
		
	    checkIndex(index);
	    
	    T obj = array[index];
	    for (int j = index; j < size - 1; j++)
	    	array[j] = array[j + 1];

	    array[size - 1] = null; 
	    size--;
	    return obj;
	    
	  } 
	private void checkIndex(int index) {
	    if (index < 0 || index >= size)
	      throw new IndexOutOfBoundsException
	        ("Index: " + index + ", Size: " + size);
	}
	  

	@Override
	public T get(int index) {
		 checkIndex(index);
		    return array[index];
	}

	public static void main(String[] args) {
		

	}

	@Override
	public int size() {
		
		return size;
	}

}
