package com.epam.custom_list;

import java.util.Arrays;

public class ListOperations<T> {
	private int size = 0;
    
    private static final int initialSize = 10;
     
    private Object attributes[];
 
    public ListOperations() {
    	attributes = new Object[initialSize];
    }
 
    public void add(T x) {
        if (size == attributes.length) {
            extendSize();
        }
        attributes[size++] = x;
    }
    
    private void extendSize() {
        int newSize = attributes.length * 2;
        attributes = Arrays.copyOf(attributes, newSize);
    }
    
    @SuppressWarnings("unchecked")
    public T get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (T) attributes[i];
    }
     
    @SuppressWarnings("unchecked")
    public T remove(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        Object item = attributes[i];
        int ele = attributes.length - ( i + 1 ) ;
        System.arraycopy( attributes, i + 1, attributes, i, ele ) ;
        size--;
        return (T) item;
    }
     
    public int size() {
        return size;
    }
     
    @Override
    public String toString() 
    {
         StringBuilder str = new StringBuilder();
         str.append('[');
         for(int i = 0; i < size ;i++) {
             str.append(attributes[i].toString());
             if(i<size-1){
                 str.append(",");
             }
         }
         str.append(']');
         return str.toString();
    }
    
}


