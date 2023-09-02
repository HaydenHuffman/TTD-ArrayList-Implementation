package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T>{
	Object[] items = new Object[10];
	int currentIndex = 0;
	int listSize = 0;
	
	@Override
	public boolean add(T item) {
			if (listSize == items.length) {
				expandBackingArray();
			}
			items[listSize] = item;
			currentIndex = listSize++;
			return true; 
			
		}

	private void expandBackingArray() {
		Object[] oldItems = items;
		items = new Object[items.length * 2];
		for (int j = 0; j < oldItems.length; j++) {
            items[j] = oldItems[j];
        }
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		
		if (listSize == items.length) {
			expandBackingArray();
		}
		for (int j = currentIndex; j >= index; j--) {
			items[j + 1] = items[j];			
			
		}
		items[index] = item;
		currentIndex = listSize++;
		return true;
	}

	@Override
	public int getSize() {
		return listSize;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		return (T) items[index];
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
			for (int j = index; j < items.length; j++) {
				if (j == items.length - 1) {
					items[j] = null;
					currentIndex--;
					listSize--;
				} else {
					items[j] = items[j+1];
				}
			}
		
		return null;
	}
	
	@Override
	public String toString() {
		return "CustomArrayList [items=" + Arrays.toString(items) + ", currentIndex=" + currentIndex + ", listSize=" + listSize + "]";
	}

}
