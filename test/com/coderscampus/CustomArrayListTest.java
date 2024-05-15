package com.coderscampus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomArrayListTest {
    @Test

    void test_Get_Index_Out_Of_Bounds_Exception() {
        CustomArrayList<String> customArrayList = new CustomArrayList<>();
        customArrayList.add("Test1");
  //  assertThrows(IndexOutOfBoundsException.class, customArrayList.get(-1));
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
        // This test case will test the functionality to add an item that is not null into the list.
        CustomArrayList<String> list = new CustomArrayList<>();
        assertTrue(list.add("Item 1"));
        assertEquals(1, list.getSize());
        assertEquals("Item 1", list.get(0));
    }

    /**
     * Test to ensure a value added to the CustomArrayList can be retrieved using the 'get' method.
     */
    @Test
    public void get_Value() {
        CustomArrayList<String> customList = new CustomArrayList<>();
        customList.add("Test");

        String result = customList.get(0);

        assertEquals("Test", result);
    }
    @Test
    public void test_get_size_after_adding_elements() {
        CustomArrayList<Integer> list = new CustomArrayList<>();
        list.add(1);
        list.add(2);
        int result = list.getSize();
        assertEquals(2, result, "Expected size after adding two elements to be 2");
    }



}