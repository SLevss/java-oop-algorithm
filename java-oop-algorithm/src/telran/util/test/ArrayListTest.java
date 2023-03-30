package telran.util.test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import telran.util.*;

class ArraysListTest {

	@Test
	void testAdd() {
		ArraysList<Integer> numbers = new ArraysList<>();
		ArraysList<String> String = new ArraysList<>();
		numbers.add(5);
		numbers.add(15);
		String.add("abc");
		assertEquals(2,numbers.size());
		assertEquals(1,String.size());
	}
	
	@Test
	  public void testAddIndex() {
		ArraysList<Integer> numbers = new ArraysList<>();
		numbers.add(0, 5);
        assertEquals(4, numbers.size());
        assertEquals(5, numbers.get(0));
       
        numbers.add(2, 10);
        assertEquals(5, numbers.size());
        assertEquals(10, numbers.get(2));
      
    }
	
}

