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
		for(int i= 0; i<20;i++) {
			numbers.add(i);
			}
        assertEquals(19, numbers.size());
      
        numbers.add(0, 100);
      
        assertEquals(100, numbers.get(0));
        
        assertEquals(20, numbers.size());
        numbers.add(6, 200);
        assertEquals(200, numbers.get(6));
    }
	
	@Test
	  public void testRemote() {
		ArraysList<Integer> numbers = new ArraysList<>();
		for(int i= 0; i<20;i++) {
		numbers.add(i);
		}
		int removed1 = numbers.remove(19);
		int removed2 = numbers.remove(10);
		int removed3 = numbers.remove(0);
      assertEquals(4, numbers.size());
      assertEquals(5, numbers.get(0));
     
      numbers.add(2, 10);
      assertEquals(5, numbers.size());
      assertEquals(19, removed1);
      assertEquals(10, removed2);
      assertEquals(0, removed3);
    
  }
}

