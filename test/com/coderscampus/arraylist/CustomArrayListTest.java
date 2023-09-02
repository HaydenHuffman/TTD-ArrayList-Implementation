package com.coderscampus.arraylist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	@Test
	void should_add_one_unit_to_list() {
		CustomList<Integer> sut = new CustomArrayList<Integer>();
		
		for (int i = 0; i <= 21; i++) {
			sut.add(i);
		}
		
		assertEquals(21, sut.get(21));
	}
	
	@Test
	void should_add_unit_at_index() {
		CustomList<Integer> sut = new CustomArrayList<Integer>();
		for (int i = 0; i <= 21; i++) {
            sut.add(i);
        }
        sut.add(0, 2);
      
      
        assertEquals(2, sut.get(0));
        assertEquals(0, sut.get(1));
	}
	
	@Test
	void should_get_size_of_list() {
		CustomList<Integer> sut = new CustomArrayList<Integer>();
        for (int i = 0; i <= 21; i++) {
            sut.add(i);
        }
        assertEquals(22, sut.getSize());
	}
	
	@Test
    void should_remove_unit_at_index() {
		CustomList<Integer> sut = new CustomArrayList<Integer>();
		for (int i = 0; i <= 21; i++) {
            sut.add(i);
        }
		sut.remove(7);
		assertEquals(8, sut.get(7));
		assertEquals(9,sut.get(8));
;	}
	
	@Test
	void should_execute_all_functions_together() {
		CustomList<Integer> sut = new CustomArrayList<Integer>();

		for (int x = 0; x < 15; x++) {
			sut.add(x);
			
		}
		sut.remove(9);
		sut.remove(7);
		assertEquals(10, sut.get(8));
		
		sut.add(1000);
		assertEquals(1000, sut.get(13));
		
		sut.add(7, 1001);
		sut.add(7, 1002);
		sut.add(7, 89);
		assertEquals(89, sut.get(7));
		assertEquals(1002, sut.get(8));
		
		sut.remove(7);
		sut.add(2000);
		sut.add(3000);
		assertEquals(3000, sut.get(17));
	}
}


