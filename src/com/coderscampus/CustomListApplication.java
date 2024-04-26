package com.coderscampus;

public class CustomListApplication {
    public static void main(String[] args) {
        CustomList<String> myCustomList = new CustomArrayList<>();
        myCustomList.add("element 1"); // and continue to add another 10, 20 or 40 more elements
        myCustomList.add("element 2");
        myCustomList.add("element 3");
        myCustomList.add("element 4");
        myCustomList.add("element 5");
        myCustomList.add("element 6");
        myCustomList.add("element 7");
        myCustomList.add("element 8");
        myCustomList.add("element 9");
        myCustomList.add("element 10");
        myCustomList.add("element 11");
        myCustomList.add("element 12");
        myCustomList.add("element 13");
        myCustomList.add("element 14");
        myCustomList.add("element 15");
        myCustomList.add("element 16");
        myCustomList.add("element 17");
        myCustomList.add("element 18");
        myCustomList.add("element 19");
        myCustomList.add("element 20");
        myCustomList.add("element 21");
        myCustomList.add("element 22");

        myCustomList.add("element 23");
        myCustomList.add("element 24");
        myCustomList.add("element 25");
        myCustomList.add("element 26");
        myCustomList.add("element 27");
        myCustomList.add("element 28");
        myCustomList.add("element 29");
        myCustomList.add("element 30");
        myCustomList.add("element 31");
        myCustomList.add("element 32");
        myCustomList.add("element 33");
        myCustomList.add("element 34");
        myCustomList.add("element 35");
        myCustomList.add("element 36");
        myCustomList.add("element 37");
        myCustomList.add("element 38");
        myCustomList.add("element 39");
        myCustomList.add("element 40");
        myCustomList.add("element 41");



        //System.out.println(myCustomList.getSize());

        //myCustomList.getSize();
        // then you should validate that all the elements you've inserted actually exist in your data structure
        for (int i = 0; i < myCustomList.getSize(); i++) {
            System.out.println(myCustomList.get(i));

        }
        //	System.out.println("Number of items in the array: " + myCustomList.getSize());


    }
}
