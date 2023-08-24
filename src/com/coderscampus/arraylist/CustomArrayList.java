package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T>{
	Object[] items = new Object[10];
	int i = 0;
	
	@Override
	public boolean add(T item) {
		if (i == items.length) {
			expandBackingArray();
		}
		items[i] = item;
		i++;
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
		
		while (index > items.length - 1) {
			expandBackingArray();
		}
		for (int i = items.length; i == index; i--) {
			items[i] = items[i-1];			
		}
		items[index] = item;
		return true;
	}

	@Override
	public int getSize() {
		for (int i = 0; i < items.length; i++) {
			if (items[i]!= null) {
                i++;
            }
		}
		
		
		return i;
	}

	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		return (T) items[index];
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
			for (int i = index; i < items.length - 1; i++) {
				if (i == items.length) {
					items[i] = null;
				}
					items[i] = items[i+1];
				}
		
		return null;
	}

}
