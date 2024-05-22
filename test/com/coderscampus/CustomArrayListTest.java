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
    public void testGet_GivenValidIndex_ThenReturnCorrectItem() {
        CustomArrayList<String> customArrayList = new CustomArrayList<>();
        customArrayList.add("item1");
        customArrayList.add("item2");
        customArrayList.add("item3");

        String actualItem = customArrayList.get(1);

        assertEquals("item2", actualItem);
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
    //add item
    @Test
    public void test_Add_Item() {
        CustomArrayList<String> list = new CustomArrayList<>();
        assertTrue(list.add("Item 1"));
        assertEquals(1, list.getSize());
        assertEquals("Item 1", list.get(0));
    }
    @Test
    public void testAddMethod_AddingNull() {
        CustomArrayList<String> list = new CustomArrayList<>();
        boolean result = list.add(null);

        // Verifying that null is not added to the list
        assertFalse(result);
        assertEquals(0, list.getSize());
    }

    @Test
    public void testAddMethod_ArrayExpansion() {
        CustomArrayList<String> list = new CustomArrayList<>();

        // Adding more than 10 items to the list to force an array expansion
        for (int i = 1; i <= 11; i++) {
            list.add("testItem" + i);
        }

        // Verifying that all items were successfully added
        assertEquals(11, list.getSize());
        assertEquals("testItem11", list.get(10));
    }
    @Test
    public void addAtIndexMethodTest() {
        CustomArrayList<Integer> list = new CustomArrayList<>();

        list.add(0, 10);
        list.add(1, 20);
        list.add(1, 15);
        assertEquals(3, list.getSize());
        assertEquals(10, list.get(0));
        assertEquals(15, list.get(1));
        assertEquals(20, list.get(2));
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
    @Test
    void getSize_inEmptyList_returnsZero() {
        CustomList<Object> list = new CustomArrayList<>();
        int size = list.getSize();
        assertEquals(0, size, "The size of an empty list should be 0.");
    }




}
