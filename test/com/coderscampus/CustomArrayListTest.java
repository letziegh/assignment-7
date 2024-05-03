package com.coderscampus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomArrayListTest {
    @Test

    void test_Get_Index_Out_Of_Bounds_Exception() {
        CustomArrayList<String> customArrayList = new CustomArrayList<>();
        customArrayList.add("Test1");
        assertThrows(IndexOutOfBoundsException.class, () -> customArrayList.get(-1));
    }
    @Test
    public void test_Remove_Item_A() {
        CustomArrayList<String> list = new CustomArrayList<>();
        list.add("A");
        list.add("B");

        String removedItem = list.remove(0);

        assertEquals("A", removedItem);
        assertEquals(1, list.getSize());
    }
    @Test
    public void test_Add_Item() {
        CustomArrayList<String> list = new CustomArrayList<>();
        assertTrue(list.add("Item 1"));
        assertEquals(1, list.getSize());
        assertEquals("Item 1", list.get(0));
    }


}
