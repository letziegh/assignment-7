package com.coderscampus;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {

    Object[] items = new Object[10];
    int index = 0;
    int size = 0;

    @Override
    public boolean add(T item) {
        if (item == null) {
            return false;
        }
        if (items.length == size) {
            items = Arrays.copyOf(items, size * 2);
        }
        items[size] = item;
        size++;
        return true;
    }

    @Override
    public boolean add(int index, T item) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (items.length == size) {
            items = Arrays.copyOf(items, size * 2);
        }
        if(index != size) {
            System.arraycopy(items, index, items, index + 1, size - index);
        }
        items[index] = item;
        size++;
        return true;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (T) items[index];
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        T item = (T) items[index];
        System.arraycopy(items, index + 1, items, index, size - index - 1);
        size--;
        return item;
    }
}