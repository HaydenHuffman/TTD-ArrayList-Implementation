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
        assertEquals(1, sut.get(1));
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
		sut.remove(0);
		assertEquals(1, sut.get(0));
		assertEquals(null,sut.get(sut.getSize()));
;	}
}


